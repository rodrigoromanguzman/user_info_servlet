/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author rodrigoroman
 */

@WebServlet("/user-info")
public class UserInfoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String technologies [] = request.getParameterValues("technologies");
        String gender = request.getParameter("gender");
        String position = request.getParameter("position");
        String music [] =  request.getParameterValues("music");
        String comments = request.getParameter("comments");
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
            out.print("<body>");
                out.print("<table border ='1'>");
                    out.print("<tr>");
                        out.print("<td>");
                            out.print("Nombre");
                        out.print("</td>");
                        out.print("<td>");
                            out.print(username);
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Contraseña");
                        out.print("</td>");
                        out.print("<td>");
                            out.print(password);
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Technologies");
                        out.print("</td>");
                        out.print("<td>");
                            for(String technology:technologies){
                                out.print(technology);
                            }
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Genero");
                        out.print("</td>");
                        out.print("<td>");
                            out.print(gender);
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Posicion");
                        out.print("</td>");
                        out.print("<td>");
                            out.print(position);
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Posicion");
                        out.print("</td>");
                        out.print("<td>");
                            for(String musicGen:music){
                                out.print(musicGen);
                            }
                        out.print("</td>");
                     out.print("</tr>");
                     
                     out.print("<tr>");
                        out.print("<td>");
                            out.print("Comentarios");
                        out.print("</td>");
                        out.print("<td>");
                            out.print(comments);
                        out.print("</td>");
                     out.print("</tr>");
                             
                out.print("</table>");
            out.print("</body>");
        out.print("</html>");
    }
}
