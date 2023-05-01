package project.vote.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.vote.dao.VoteDao;

/**
 * Servlet implementation class BoardController
 */

public class voteGetCommand implements voteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String vjumin = request.getParameter("vjumin");
		String vname = request.getParameter("vname");
		String mno = request.getParameter("mno");
		String vtime = request.getParameter("vtime");
		String varea = request.getParameter("varea");
		String vconfirm = request.getParameter("vconfirm");
		VoteDao dao = new VoteDao();
		dao.voteGet(vjumin, vname, mno, vtime, varea, vconfirm);

	}
}
