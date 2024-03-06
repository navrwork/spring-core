package com.navr.springcore.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;

public class DbConnectionInfo {
    private String url;
    private String username;
    private String password;
    private String driverClass;

    @Value("${db.url}")
    public void setUrl(String url) {
        this.url = url;
    }

    @Value("${db.username}")
    public void setUsername(String username) {
        this.username = username;
    }

    @Value("${db.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${db.driverClassName}")
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    @Override
    public String toString() {
        return "DbConnectionInfo{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", driverClass='" + driverClass + '\'' +
                '}';
    }
}
