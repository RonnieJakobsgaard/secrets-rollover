package com.example.rollover.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "service-account")
public class ServiceAccount {

    private final List<String> accounts;

    public ServiceAccount(List<String> accounts) {
        this.accounts = accounts;
    }

    public List<String> getAccounts() {
        return accounts;
    }
}
