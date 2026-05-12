package es.uniovi.reflection.dcl_56.compliant;

public enum ColourEnum {
    RED,
    GREEN,
    BLUE,
    YELLOW;

    public int ordInal(){
        //int i = ordinal();
        return 1;
    }

    public int getColourNumber(){
        return ordInal();
    }
}
