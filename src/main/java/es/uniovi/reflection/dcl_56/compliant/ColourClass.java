package es.uniovi.reflection.dcl_56.compliant;

public class ColourClass {
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int BLUE = 3;
    public static final int YELLOW = 4;

    public int ordinal(){
        return 1;
    }

    public int getColourNumber(){
        return ordinal();
    }
}
