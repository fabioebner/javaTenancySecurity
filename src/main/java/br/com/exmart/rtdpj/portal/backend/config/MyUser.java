package br.com.exmart.rtdpj.portal.backend.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class MyUser extends User {
    String schema;
    public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String schema) {
        super(username, password, authorities);
        this.schema = schema;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
