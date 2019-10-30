package com.example.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author jiangqw
 * @date 2019/10/28 9:50
 */
public class BeerRequestFilter implements Filter {
    private FilterConfig fc;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String name = httpServletRequest.getRemoteUser();
        if (name != null) {
            fc.getServletContext().log("User " + name + " is updating");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
