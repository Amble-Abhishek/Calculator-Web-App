/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mymains.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABHISHEK
 */
public class Calculator extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Calculator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out = null;
        try{
            out= response.getWriter();
            out.println("<center>");
            int a =Integer.parseInt(request.getParameter("t1"));
            int b =Integer.parseInt(request.getParameter("t2"));
            int c =0;
            String op= request.getParameter("btn");
            if(op.equals("+")) c= a+b;
            if(op.equals("-")) c= a-b;
            if(op.equals("*")) c= a*b;
            if(op.equals("/")) c= a/b;
            out.println("<h3>"+a+op+b+" = "+ c + "</h3>");
        }catch(Exception e )
        {
        out.println("Error: "+ e.getMessage());
        }finally{
            
            out.println("<br>");
            out.println("To go to main page <a href = index.html> Click Here </a>");
            out.println("</center>");
            
            out.close();
        }
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
     //   processRequest(request, response); response.setContentType("text/html");
      /*  PrintWriter out = null;
        try{
            out= response.getWriter();
            out.println("<center>");
            int a =Integer.parseInt(request.getParameter("t1"));
            int b =Integer.parseInt(request.getParameter("t2"));
            int c =0;
            String op= request.getParameter("btn");
            if(op.equals("+")) c= a+b;
            if(op.equals("-")) c= a-b;
            if(op.equals("*")) c= a*b;
            if(op.equals("/")) c= a/b;
            out.println("<h3>"+a+op+b+" = "+ c + "</h3>");
        }catch(Exception e )
        {
        out.println("Error: "+ e.getMessage());
        }finally{
            
            out.println("<br>");
            out.println("To go to main page <a href = index.html> Click Here </a>");
            out.println("</center>");
            
            out.close();
        }
    */
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
