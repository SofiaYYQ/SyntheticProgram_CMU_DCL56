package es.uniovi.reflection.dcl_56.noncompliant;

public enum Colour {
    RED,
    GREEN,
    BLUE,
    YELLOW;

    Colour() {
        int i = ordinal();
    }

    public void printColourNumber(){
        System.out.println(ordinal());
    }
}
