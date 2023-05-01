package project.vote.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.vote.command.candidateRankCommand;
import project.vote.command.candidatelistCommand;
import project.vote.command.voteCheckCommand;
import project.vote.command.voteCommand;
import project.vote.command.voteGetCommand;

/**
 * Servlet implementation class BoardController
 */

@WebServlet("*.do")
public class VoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VoteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		actionDo(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		actionDo(request, response);

	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo() ..");
		request.setCharacterEncoding("UTF-8");
		String viewPage = null;
		voteCommand command = null;
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length());
		System.out.println("uri:" + uri);
		System.out.println("contextPath:" + contextPath);
		System.out.println("com:" + com);
		if (com.equals("/candidatelist.do")) {
			command = new candidatelistCommand();
			command.execute(request, response);
			viewPage = "candidatelist.jsp";
		} else if (com.equals("/candidateRank.do")) {
			command = new candidateRankCommand();
			command.execute(request, response);
			viewPage = "candidateRank.jsp";
		} else if (com.equals("/vote.do")) {
			System.out.println("/vote.do..");
			viewPage = "vote.jsp";
		} else if (com.equals("/voteGet.do")) {
			System.out.println("/vote.do..");
			command = new voteGetCommand();
			command.execute(request, response);
			viewPage = "voteCheck.do";
		} else if (com.equals("/voteCheck.do")) {
			command = new voteCheckCommand();
			command.execute(request, response);
			viewPage = "voteCheck.jsp";
		} 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}