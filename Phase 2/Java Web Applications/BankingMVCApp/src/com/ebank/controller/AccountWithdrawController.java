package com.ebank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ebank.bean.Account;
import com.ebank.service.AccountService;

/**
 * Servlet implementation class AccountWithdrawController
 */
@WebServlet("/AccountWithdrawController")
public class AccountWithdrawController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountWithdrawController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		float amount = Float.parseFloat(request.getParameter("amount"));
		AccountService as = new AccountService();
		Account account = new Account();
		account.setEmailid(emailid);
		account.setAmount(amount);
		String result = as.withdrawn(account);
		pw.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("withdrawn.jsp");
		rd.include(request, response);
	}

}