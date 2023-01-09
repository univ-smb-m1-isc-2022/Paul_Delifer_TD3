package org.monopoly;

public class Combinaison {

    private De de1;
    private De de2;

    public Combinaison() {
        de1 = new De();
        de2 = new De();
    }
    protected boolean estUnDouble() {     // test si c'est un double
        return (de1.getValeur() == de2.getValeur());
    }

    public int faitLaSomme() {    // calcul le total du lancer
        return (de1.getValeur() + de2.getValeur());
    }
    public int lancer(){
        de1.lancer();
        de2.lancer();
        return (de1.getValeur() + de2.getValeur());
    }

    public De getDe1() {
        return de1;
    }

    public De getDe2() {
        return de2;
    }

    public void setDe1(int de1) {
        this.de1.setValeur(de1);
    }

    public void setDe2(int de2) {
        this.de2.setValeur(de2);
    }
}



