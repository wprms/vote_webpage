package project.vote.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardController
 */

public interface voteCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);

}
