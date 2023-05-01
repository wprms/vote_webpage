package project.vote.command;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.vote.dao.VoteDao;
import project.vote.vo.VoteVo;

/**
 * Servlet implementation class BoardController
 */

public class voteCheckCommand implements voteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		VoteDao dao = new VoteDao();
		List<VoteVo> vos = dao.voteCheck();
		request.setAttribute("vo", vos);
	}
}
