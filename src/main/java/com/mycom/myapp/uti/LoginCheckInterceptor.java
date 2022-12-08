package com.mycom.myapp.uti;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("login");
        if (obj == null) {
            response.sendRedirect(request.getContextPath() + "/login/login");
            return false;
        }
        return true;
    }
}
