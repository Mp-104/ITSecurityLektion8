//package com.example.tokens;
//
//import com.nimbusds.jose.jwk.RSAKey;
//import org.springframework.stereotype.Component;
//
//import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//
//import java.security.interfaces.RSAPrivateKey;
//import java.security.interfaces.RSAPublicKey;
//import java.util.UUID;
//
//@Component
//final class KeyGeneratorUtils {
//
//
//    private KeyGeneratorUtils(){}
//
//
//    static KeyPair generateRsaKey(){
//        KeyPair keyPair;
//
//        try {
//            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
//            keyPairGenerator.initialize(2048);
//            keyPair = keyPairGenerator.generateKeyPair();
//        } catch (Exception ex) {
//            throw new IllegalArgumentException(ex);
//        }
//
//        return keyPair;
//    }
//}

