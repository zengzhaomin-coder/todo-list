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
import java.util.List;

// 显示所有信息方法
@WebServlet("/task/list")
public class TaskListApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Task> tasks = new TaskDAO().getAllTasks();
            String json = new Gson().toJson(tasks);
            resp.getWriter().write(json);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("不好意思，显示错误");
        }
    }
}
