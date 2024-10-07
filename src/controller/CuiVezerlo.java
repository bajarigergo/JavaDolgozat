package controller;

import modell.Ember;
import view.CuiNezet;

/**
 *
 * @author bajari.gergo
 */
public class CuiVezerlo {
    
    private Ember modell;
    private CuiNezet nezet;

    public CuiVezerlo(Ember modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    }
    public void start(){
        nezet.megjelenit(modell.bemutatkozik());
    }
    public void nyelvetTanult(){
        modell.nyelvTanulasa("angol");
        nezet.megjelenit(modell.bemutatkozik());
    }
    public void szuletesnapjaVolt(){
        modell.szuletesnap();
        nezet.megjelenit(modell.bemutatkozik());
    }
    
}
