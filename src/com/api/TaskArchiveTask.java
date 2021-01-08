package com.api;

import com.dao.TaskDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 归档的操作
@WebServlet("/task/archive")
public class TaskArchiveTask extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        try {
            new TaskDAO().archiveTask(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("不好意思，归档出错");
        }
    }
}
