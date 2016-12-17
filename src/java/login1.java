/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sai
 */
public class login1 extends HttpServlet {

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
        HttpSession session = request.getSession();
                db.DataBaseConnectionClass dataBaseConnectionClass = new db.DataBaseConnectionClass();

        int i;
            try{
            String AccountId= request.getParameter("AccountId");
            String pwd = request.getParameter("Password");
            ResultSet rs1 = dataBaseConnectionClass.selectData("select * from admin where AccountId='" + AccountId + "' or Password='"+pwd+"'");
            String invalid="";
            if(rs1.next())
            {
                           if(rs1.getString("AccountId").equals(AccountId) && rs1.getString("Password").equals(pwd))
                            {
                                out.println("Login Succesfully");
                                session.setAttribute("Login", AccountId);
                                response.sendRedirect("login.jsp");
                               
                            }
                           else{
                               try{
                                   invalid=session.getAttribute("invalid").toString();
                               }catch(Exception p){}
                                 if(!invalid.equals(""))
                                 {
                                     i=Integer.parseInt(invalid);
                                 }else
                                 {
                                     i=0;
                                 }
                                  i++;
                                  if(i==4)
                             {
                                Cookie invaliduser=new Cookie("invaliduser","invalid");
                                invaliduser.setMaxAge(60*1);
                                response.addCookie( invaliduser );
                             }
                              session.setAttribute("invalid", ""+i);
                              response.sendRedirect("index.jsp");
            
                           }
            }
            
            }catch(SQLException | IOException | NumberFormatException e)
        {
            out.println(e.getMessage());
        }
               
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
