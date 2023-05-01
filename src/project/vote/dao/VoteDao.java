package project.vote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import project.vote.vo.VoteVo;
import project.vote.vo.candidateVo;
import project.vote.vo.rankVo;

public class VoteDao {

	private DataSource dataSource;

	public VoteDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 후보자 리스트
	public List<candidateVo> candidatelist() {
		List<candidateVo> ls = new ArrayList<candidateVo>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			connection = dataSource.getConnection();
			String query = "select M.mno,M.mname,P.pname,M.pschool,substr(M.mjumin,1,6)||'-'||substr(M.mjumin,7) mjumin,"
					+ "M.mcity,P.ptel1,P.ptel2,P.ptel3 FROM TBL_MEMEBER_202005 M, TBL_PARTY_202005 P WHERE M.pcode = P.pcode";
			prepareStatement = connection.prepareStatement(query);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				String mno = resultSet.getString("mno");
				String mname = resultSet.getString("mname");
				String pname = resultSet.getString("pname");
				String pschool = resultSet.getString("pschool");
				String mjumin = resultSet.getString("mjumin");
				String mcity = resultSet.getString("mcity");
				String ptel1 = resultSet.getString("ptel1");
				String ptel2 = resultSet.getString("ptel2");
				String ptel3 = resultSet.getString("ptel3");
				candidateVo vo = new candidateVo(mno, mname, pname, pschool, mjumin, mcity, ptel1, ptel2, ptel3);
				ls.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (prepareStatement != null)
					prepareStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return ls;
	}

	// 투표하기
	public int voteGet(String vjumin, String vname, String mno, String vtime, String varea, String vconfirm) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int ret = 0;
		try {
			String query = "insert into TBL_VOTE_202005 values (?, ?, ?, ?, ?, ?)";
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vjumin);
			pstmt.setString(2, vname);
			pstmt.setString(3, mno);
			pstmt.setString(4, vtime);
			pstmt.setString(5, varea);
			pstmt.setString(6, vconfirm);
			ret = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return ret;
	}

	// 투표결과 확인
	public List<VoteVo> voteCheck() {
		ArrayList<VoteVo> ls = new ArrayList<VoteVo>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select vname,19||substr(vjumin,1,2)||'년'||substr(vjumin,3,2)||'월'||substr(vjumin,5,2)||'일생' as vbirth,"
				+ "2023-TO_NUMBER(19||substr(vjumin,1,2)) as vage,"
				+ "substr(vjumin,7,1) as vgender,mno, substr(vtime,1,2)||':'||substr(vtime,3,2) vtime,"
				+ " vconfirm from TBL_VOTE_202005 where varea = '제1투표장'";
		try {
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String vname = rs.getString("vname");
				String vbirth = rs.getString("vbirth");
				String vage = rs.getString("vage");
				String vgender = rs.getString("vgender");
				String mno = rs.getString("mno");
				String vtime = rs.getString("vtime");
				String vconfirm = rs.getString("vconfirm");
				VoteVo vo = new VoteVo(vname, "0", vbirth, vage, vgender, mno, vtime, "제1투표장", vconfirm);
				ls.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return ls;
	}

	// 후보자 등수
	public List<rankVo> candidateRank() {
		ArrayList<rankVo> ls = new ArrayList<rankVo>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "SELECT M.mno, M.mname, count(*) AS vtotal FROM TBL_MEMEBER_202005 M,"
				+ "TBL_VOTE_202005 V WHERE M.mno = V.mno AND V.vconfirm = 'Y' GROUP BY M.mno,"
				+ " M.mname ORDER BY vtotal DESC";
		try {
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String mno = rs.getString("mno");
				String mname = rs.getString("mname");
				String vtotal = rs.getString("vtotal");
				rankVo vo = new rankVo(mno, mname, vtotal);
				ls.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return ls;
	}
}
