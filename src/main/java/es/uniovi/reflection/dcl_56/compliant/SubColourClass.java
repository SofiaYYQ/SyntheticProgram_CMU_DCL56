package es.uniovi.reflection.dcl_56.compliant;

public class SubColourClass extends AbstractColourClass{
    public int getColourNumber(){
        return ordinal() + 1;
    }
}
