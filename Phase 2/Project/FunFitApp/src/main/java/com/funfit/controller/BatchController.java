package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.funfit.bean.Batch;
import com.funfit.service.BatchService;

@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    BatchService bs = new BatchService();
       
    public BatchController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        List<Batch> listOfBatch = bs.viewAllBatch();
        HttpSession hs = request.getSession();
        hs.setAttribute("batches", listOfBatch);
        String flagValue = request.getParameter("flag");
        if(flagValue.equals("2")) {
            response.sendRedirect("addParticipants.jsp");
        } else {
            response.sendRedirect("viewBatches.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //add the condition if the parameter is delete => call the deleteBatch function
    	String action = request.getParameter("action");
        if ("delete".equals(action)) {
        	PrintWriter pw = response.getWriter();
            response.setContentType("text/html");
            int bid = Integer.parseInt(request.getParameter("bid"));
            String result = bs.deleteBatch(bid);  // Calling deleteBatch method in BatchService
            pw.print(result);
            
        } else { // else call the addBatch method
            PrintWriter pw = response.getWriter();
            response.setContentType("text/html");
            String typeofbatch = request.getParameter("typeofbatch");
            String time = request.getParameter("time");
            RequestDispatcher rd = request.getRequestDispatcher("addBatch.jsp");
            Batch bb = new Batch();
            bb.setTypeofbatch(typeofbatch);
            bb.setTime(time);
            String result = bs.addBatch(bb);
            pw.print(result);
            rd.include(request, response);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
}