package com.api;

import com.bean.Task;
import com.dao.TaskDAO;
import com.google.gson.Gson;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 添加信息操作
@WebServlet("/task/add")
public class TaskAppApi extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = req.getParameter("body");
        try {
            Task task = new TaskDAO().addTask(new Task(body));
            String json = new Gson().toJson(task);
            resp.getWriter().write(json);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("不好意思，发生异常");
        }
    }
}
