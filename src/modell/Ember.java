
package modell;

import java.util.ArrayList;

public class Ember {
    private int kor;
    private String nev;
    private ArrayList<String> nyelvek; 
    
    public Ember(String nev,int kor) {
        ArrayList<String> nyelvek = new ArrayList<>();
        this(nev, kor, nyelvek);
    }
        public Ember(String nev,int kor, ArrayList<String> nyelvek) {
        this.nev=nev;
        this.kor=kor;
        this.nyelvek=nyelvek;
    }
    
    
    public void nyelvTanulasa(String nyelv){
        nyelvek.add(nyelv);
    }
    public void szuletesnap(){
        this.kor++;
    }
    public String bemutatkozik(){
        String kimenet = "Szia "+nev+"-nek/nak hívnak, "+kor+" éves vagyok\n";
        if (nyelvek.size()>0){
            kimenet+="Következő nyelvet/nyelveket beszélem:\n";
            for (int i = 0; i < nyelvek.size(); i++) {
                kimenet+= "- "+nyelvek.get(i)+"\n";
            }
        }else{
            kimenet+="Sajnos csak az anyanyelvemet beszélem\n";
        }
        return kimenet;
    }
    

}
