package com._520.web.homework._01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/shopping")
public class ShoppingServlet extends HttpServlet {
    private List<Commodity> list = null;

    @Override
    public void init() throws ServletException {
        list = new ArrayList<>();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        // 获取请求参数
        String bookName = req.getParameter("bookName");
        Integer count = Integer.valueOf(req.getParameter("count"));
        System.out.println("名字：" + bookName + " 数量：" + count);
        //
        boolean isHave = false;
        // 判断当前书籍有没有在list中
        for (Commodity comm:list
             ) {
            if (bookName.equals(comm.getName())){
                comm.setCount(comm.getCount() + count);
                isHave = true;
            }
        }
        // 没有就新创建一个对象
       if (!isHave){
            Commodity commodity = new Commodity();
            commodity.setName(bookName);
            commodity.setCount(count);
            commodity.setPrice(15);
            list.add(commodity);
        }
       // 将list存入session
        req.getSession().setAttribute("COMMODITY_IN_SESSION",list);
//        req.getRequestDispatcher("/jsp/shopping.jsp").forward(req,resp);
        // 跳转
        req.getRequestDispatcher("/jsp/success.jsp").forward(req,resp);
    }

}
