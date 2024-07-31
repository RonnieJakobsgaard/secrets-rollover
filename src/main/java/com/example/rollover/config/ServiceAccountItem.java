package com.example.rollover.config;

public class ServiceAccountItem {

    private final String privateKey;
    private final String publicKey;

    public ServiceAccountItem(String privateKey, String publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }
}
