package com.example.demoafc;

import com.talanlabs.avatargenerator.Avatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

@WebServlet(name="BeerSelect",value="/SelectBeer.do" )
public class BeerSelect extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)
    throws IOException,ServletException {
    response.setContentType("text/html");//返回类型
    PrintWriter out = response.getWriter();
    out.println();
    Beer Beerclass = new Beer();
    out.println("<b>Beer Selection Advice</b><br>");
    String c = request.getParameter("color");


    Beerclass.setColor(c);
    out.println("<br>Got beer color:  " + c + "<br>");
    out.println(Beerclass.toString());




}
//你的代码在哪

}

