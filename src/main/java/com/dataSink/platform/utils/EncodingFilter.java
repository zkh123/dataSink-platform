package com.dataSink.platform.utils;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 乱码过滤
 */
public class EncodingFilter implements Filter {
    private String encoding;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encoding);
        filterChain.doFilter(new HttpServletRequestWrapper((HttpServletRequest) servletRequest) {
            @Override
            public String getParameter(String name) {
                String value = super.getParameter(name);
                if (super.getMethod().equalsIgnoreCase("GET")) {

                    if (value != null) {
                        try {
                            value = new String(value.getBytes("iso8859-1"), encoding);
                        } catch (UnsupportedEncodingException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                return value;
            }
        },servletResponse);
    }

    @Override
    public void destroy() {
        encoding = null;
    }
}
