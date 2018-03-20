package br.com.exmart.rtdpj.portal.backend.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.security.Principal;

@Component
public class HeaderTenantIdentifierResolver implements CurrentTenantIdentifierResolver {

    @Value("${multitenant.tenantKey}")
    String tenantKey;

    @Value("${multitenant.defaultTenant}")
    String defaultTenant;


    @Override
    public String resolveCurrentTenantIdentifier() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(requestAttributes != null) {
            Principal usuarioLogado = ((ServletRequestAttributes) requestAttributes).getRequest().getUserPrincipal();
            if (usuarioLogado != null) {
                return ((MyUser)((UsernamePasswordAuthenticationToken) usuarioLogado).getPrincipal()).getSchema();
            }
//        if (requestAttributes != null) {
//            String tenantId = (String) requestAttributes.getAttribute(tenantKey, RequestAttributes.SCOPE_REQUEST);
//            if (tenantId != null) {
//                return tenantId;
//            }
//        }
        }
        return defaultTenant;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
