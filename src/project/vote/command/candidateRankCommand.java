package project.vote.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.vote.dao.VoteDao;
import project.vote.vo.rankVo;

/**
 * Servlet implementation class BoardController
 */

public class candidateRankCommand implements voteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VoteDao dao = new VoteDao();
		List<rankVo> vos = dao.candidateRank();
		request.setAttribute("vo", vos);
	}
}
