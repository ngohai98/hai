package com.ngonhuhai.controller;

import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.service.iUserService;
import com.ngonhuhai.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;


@WebServlet("/changepass")
public class ChangePassController extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = -8148822810867968300L;

    private iUserService userService = new UserService();
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equals("changepass")) {
            String alert = req.getParameter("alert");
            String message = req.getParameter("message");
            if (message != null && alert != null) {
                req.setAttribute("message", resourceBundle.getString(message));
                req.setAttribute("alert", alert);
            }
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/changepass.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equals("changepass")) {
            String oldpass= req.getParameter("oldpass");
            String compass = req.getParameter("compass");
            String newpass = req.getParameter("newpass");
            UserModel model = new UserModel();
            model.setUser_matkhau(req.getParameter("oldpass"));
            model.setUser_ten(req.getParameter("userten"));
            model.setUser_id(Long.parseLong(req.getParameter("userid")));

            UserModel model1 = userService.findByUserPass(model.getUser_ten(), model.getUser_matkhau());
            if(model1!=null){
                if(compass.equals(newpass)){
                    userService.updatePass(newpass,model.getUser_id());
                    resp.sendRedirect(
                            req.getContextPath() + "/dang-nhap?action=login");
                }else{
                    resp.sendRedirect(
                            req.getContextPath() + "/changepass?action=changepass&message=password_incorrect&alert=danger");
                }
            }
        }
    }
}
