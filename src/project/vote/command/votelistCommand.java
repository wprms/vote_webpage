package project.vote.command;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.vote.dao.VoteDao;
import project.vote.vo.candidateVo;

/**
 * Servlet implementation class BoardController
 */

public class votelistCommand implements voteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VoteDao dao = new VoteDao();
		List<candidateVo> vos = dao.candidatelist();
		request.setAttribute("ls", vos);
	}
}
