package com.zeen.graduationdesign.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    // 容器启动时调用
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    // 拦截方法时调用
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("Request--coming");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    // 容器销毁时调用
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
