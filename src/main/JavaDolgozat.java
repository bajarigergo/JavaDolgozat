package main;

import controller.CuiVezerlo;
import modell.Ember;
import view.CuiNezet;

public class JavaDolgozat {

    public static void main(String[] args) {
        Ember ember = new Ember("Béla", 22);
        CuiNezet nezet = new CuiNezet();
        CuiVezerlo cuiVezerlo = new CuiVezerlo(ember, nezet);
        
        cuiVezerlo.start();
        cuiVezerlo.nyelvetTanult();
        cuiVezerlo.szuletesnapjaVolt();
    }
    
}
