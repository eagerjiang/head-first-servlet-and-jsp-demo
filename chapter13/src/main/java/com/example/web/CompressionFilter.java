package com.example.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jiangqw
 * @date 2019/10/30 18:22
 */
public class CompressionFilter implements Filter {
    private FilterConfig filterConfig;
    private ServletContext servletContext;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        servletContext = filterConfig.getServletContext();
        servletContext.log(filterConfig.getFilterName() + " initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String validEncodings = ((HttpServletRequest) request).getHeader("Accept-Encoding");
        String gzip = "gzip";
        if (validEncodings.contains(gzip)) {
            CompressionResponseWrapper compressionResponseWrapper = new CompressionResponseWrapper((HttpServletResponse) response);
            compressionResponseWrapper.setHeader("Content-Encoding", "gzip");
            chain.doFilter(request, compressionResponseWrapper);
            try {
                compressionResponseWrapper.getGzipOutputStream().finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
            servletContext.log(filterConfig.getFilterName() + ": finished the request");
        } else {
            servletContext.log(filterConfig.getFilterName() + ": no encoding performed.");
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
