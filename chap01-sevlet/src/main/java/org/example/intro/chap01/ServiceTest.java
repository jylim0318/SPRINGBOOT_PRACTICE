package org.example.intro.chap01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/service" )

public class ServiceTest extends HttpServlet {

    /*
     * GET요청을 처리하는 메서드( GET: /service)
     * - 데이터를 조회할때 사용
     * - 전달할 데이터를 BODY(본문)에 담지 않음
     * - URL의 쿼리문자열에 포함 (예: /service?name = LIM)
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        System.out.println("GET - name = " + name);

    }

    /*
     * POST요청을 처리하는 메서드( GET: /service)
     *
     * */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
