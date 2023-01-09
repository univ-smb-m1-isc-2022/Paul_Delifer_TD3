package org.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeTest {

    @Test
    void lancer() {
        De de = new De();
        de.lancer();
        assertTrue(de.getValeur() >= 1 && de.getValeur() <= 6);
    }
}