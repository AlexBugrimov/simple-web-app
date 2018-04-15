package net.ensode.glassfishbook.simpleapp;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(SimpleServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h2>");
            printWriter.println("If you are reading this, your application server is good to go!!!");
            printWriter.println("</h2>");
        } catch (IOException ex) {
            log.error("Ошибка работы сервлета", ex);
        }
    }
}
