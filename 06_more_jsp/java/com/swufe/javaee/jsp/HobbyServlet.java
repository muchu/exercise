package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, String> userHobby;

    @Override
    public void init() {
        userHobby = new HashMap<>();
        userHobby.put("Bob", "skiing");
        userHobby.put("Jim", "skiing");
        userHobby.put("James", "knitting");
        userHobby.put("Tom", "knitting");
        userHobby.put("Fei", "scuba");
        userHobby.put("Jone", "scuba");
        userHobby.put("Fred", "dating");
        userHobby.put("Pradeep", "dating");
        userHobby.put("Philippe", "dating");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = (String) request.getParameter("hobby");
        String hobby2 = (String) request.getParameter("hobby2");
        boolean same;
        same = hobby.equals(hobby2);

        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        if (same==true) {

            userHobby.forEach((k, v) -> {
                if (v.equals(hobby)) {
                    names.add(k);
                }
            });
            request.setAttribute("names", names);
            request.setAttribute("hobby", hobby);

        }

         else {

        userHobby.forEach((k, v) -> {
            if (v.equals(hobby)) {
                names.add(k);
            }
        });
        request.setAttribute("names", names);
        request.setAttribute("hobby", hobby);




        userHobby.forEach((k, v) -> {
            if (v.equals(hobby2)) {
                names2.add(k);
            }
        });
        request.setAttribute("names2", names2);
        request.setAttribute("hobby2", hobby2);


    }
        request.getRequestDispatcher("hobbyResult2.jsp").forward(request, response);
}
}

