package com.ceasar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CipherTest {
    Cipher cipher = new Cipher();
    @Test
    public void descriptadorTeste(){
        assertEquals("Teste", cipher.descriptar("Whvwh"));
        assertEquals("Lorem Ipsum", cipher.descriptar("Oruhp Lsvxp"));
        assertEquals("Alexandre", cipher.descriptar("Dohadqguh"));
    }
}
