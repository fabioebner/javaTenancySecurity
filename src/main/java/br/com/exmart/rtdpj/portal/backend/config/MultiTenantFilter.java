package br.com.exmart.rtdpj.portal.backend.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MultiTenantFilter implements Filter {


    private static Logger logger = LoggerFactory.getLogger(MultiTenantFilter.class.getName());
    @Value("${multitenant.tenantKey}")
    String tenantKey;

    @Value("${multitenant.defaultTenant}")
    String defaultTenant;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        logger.info("Tentando acessar: " + req.getRequestURI());
        //TODO deve pegar de acordo com o usuario logado
//        req.setAttribute(tenantKey, "db_teste");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
