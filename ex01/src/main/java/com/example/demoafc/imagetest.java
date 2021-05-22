package com.example.demoafc;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.security.auth.login.Configuration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLDecoder;

@WebServlet("/imagetest" )
public class imagetest extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse resp)
    throws IOException,ServletException {
    Avatar avatar = TriangleAvatar.newAvatarBuilder().build();
    BufferedImage shengcheng = avatar.create(200281L);

   /* ServletContext bzd = req.getServletContext();

    File file = new File("imageman.png");
    BufferedImage image = ImageIO.read(file);*/
    ImageIO.write(shengcheng, "JPG", resp.getOutputStream());
}
public void doGet(HttpServletRequest req,HttpServletResponse resp)
    throws IOException,ServletException{
    this.doPost(req,resp);
}

}

