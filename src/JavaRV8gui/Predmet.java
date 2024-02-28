/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRV8gui;

/**
 *
 * @author uporabnik
 */
public class Predmet {

    private String kodaPredmeta;
    private String imePredmeta;
    private String imeNosilca;
    private int letnik;
    private String semester;
    private int ECTS;
    private int stObveznosti;
    private String imeObveznosti;
    private int utezObveznosti;
    private double ocenaObveznosti;
    private int koncnaOcena;
    public Obveznosti[] poljeObveznosti;
    
    public Predmet() {
        this.kodaPredmeta = " ";
        this.imePredmeta = " ";
        this.imeNosilca = " ";
        this.letnik = 0;
        this.semester = " ";
        this.ECTS = 0;
        this.stObveznosti = 0;
        this.koncnaOcena = 0;
        this.poljeObveznosti = new Obveznosti[10];
        for (int i = 0; i < 10; i++) {
            poljeObveznosti[i] = new Obveznosti();
            poljeObveznosti[i].setImeObveznosti("");
            poljeObveznosti[i].setUtezObveznosti(0);
            poljeObveznosti[i].setOcenaObveznosti(0.0);
            poljeObveznosti[i].setPovezanostOcene(0);
            
        }
    }

    // Getter and setter methods for the array
    public String getKodaPredmeta() {
        return kodaPredmeta;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public String getImeNosilca() {
        return imeNosilca;
    }

    public int getLetnik() {
        return letnik;
    }

    public String getSemester() {
        return semester;
    }

    public int getECTS() {
        return ECTS;
    }

    public int getStObveznosti() {
        return stObveznosti;
    }

    public int getKoncnaOcena() {
        return koncnaOcena;
    }

    

    public void setKodaPredmeta(String kodaPredmeta) {
        this.kodaPredmeta = kodaPredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public void setImeNosilca(String imeNosilca) {
        this.imeNosilca = imeNosilca;
    }

    public void setLetnik(int letnik) {
        this.letnik = letnik;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public void setStObveznosti(int stObveznosti) {
        this.stObveznosti = stObveznosti;
    }

    public void setKoncnaOcena(int koncnaOcena) {
        this.koncnaOcena = koncnaOcena;
    }
    public class Obveznosti {
    private String imeObveznosti;
    private int utezObveznosti;
    private double ocenaObveznosti;
    private int povezanostOcene;

    // Constructor for Obveznost
    public Obveznosti() {
        this.imeObveznosti = "";
        this.utezObveznosti = 0;
        this.ocenaObveznosti = 0.0;
        this.povezanostOcene = 0;
    }

    public String getImeObveznosti() {
        return imeObveznosti;
    }

    public void setImeObveznosti(String imeObveznosti) {
        this.imeObveznosti = imeObveznosti;
    }

    public int getUtezObveznosti() {
        return utezObveznosti;
    }

    public void setUtezObveznosti(int utezObveznosti) {
        this.utezObveznosti = utezObveznosti;
    }

    public double getOcenaObveznosti() {
        return ocenaObveznosti;
    }

    public void setOcenaObveznosti(double ocenaObveznosti) {
        this.ocenaObveznosti = ocenaObveznosti;
    }

    public int getPovezanostOcene() {
        return povezanostOcene;
    }

    public void setPovezanostOcene(int povezanostOcene) {
        this.povezanostOcene = povezanostOcene;
    }
    
}
    public void setImeObveznosti(int index, String imeObveznosti) {
        if (index >= 0 && index < poljeObveznosti.length) {
            poljeObveznosti[index].setImeObveznosti(imeObveznosti);
        }
    }
    public void setOcenaObveznosti(int index, double ocenaObveznosti) {
        if (index >= 0 && index < poljeObveznosti.length) {
            poljeObveznosti[index].setOcenaObveznosti(ocenaObveznosti);
        }
    }
    public void setUtezObveznosti(int index, int utezObveznosti) {
        if (index >= 0 && index < poljeObveznosti.length) {
            poljeObveznosti[index].setUtezObveznosti(utezObveznosti);
        }
    }
    public void setPovezanostOcene(int index, int povezanostOcene) {
        if (index >= 0 && index < poljeObveznosti.length) {
            poljeObveznosti[index].setPovezanostOcene(povezanostOcene);
        }
    }

}
