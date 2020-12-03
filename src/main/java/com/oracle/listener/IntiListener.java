package com.oracle.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class IntiListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc=sce.getServletContext();
        sc.setAttribute("root",sc.getContextPath());
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
