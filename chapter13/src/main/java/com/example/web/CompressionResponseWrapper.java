package com.example.web;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.zip.GZIPOutputStream;

/**
 * @author jiangqw
 * @date 2019/10/30 18:37
 */
public class CompressionResponseWrapper extends HttpServletResponseWrapper {
    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response the {@link HttpServletResponse} to be wrapped.
     * @throws IllegalArgumentException if the response is null
     */
    public CompressionResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    public GZIPOutputStream getGzipOutputStream() throws Exception {
        return new GZIPOutputStream(getResponse().getOutputStream());
    }

}
