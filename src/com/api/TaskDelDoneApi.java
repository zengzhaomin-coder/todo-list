package com.api;

import com.dao.TaskDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 删除已完成任务的方法
@WebServlet("/task/delDone")
public class TaskDelDoneApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        try {
            new TaskDAO().deleteDone(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("不好意思，删除出错");
        }
    }
}
