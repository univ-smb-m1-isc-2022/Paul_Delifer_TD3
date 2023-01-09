package org.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinaisonTest {

    class deTest{
        private int valeur;

        public deTest(int valeur) {
            this.valeur = valeur;
        }

        public int getValeur() {
            return valeur;
        }
    }
    @Test
    void estUnDouble() {
        Combinaison combinaison = new Combinaison();
        combinaison.setDe1(1);
        combinaison.setDe2(1);
        assertTrue(combinaison.estUnDouble());
    }

    @Test
    void faitLaSomme() {
        Combinaison combinaison = new Combinaison();
        combinaison.lancer();
        assertTrue(combinaison.lancer() >= 2 && combinaison.lancer() <= 12);
    }

    @Test
    void lancer() {
        Combinaison combinaison = new Combinaison();
        combinaison.lancer();
        assertTrue(combinaison.lancer() >= 2 && combinaison.lancer() <= 12);
    }
}