package firma.entity;
// Generated May 10, 2020 9:30:02 PM by Hibernate Tools 4.3.1



/**
 * Zaposleni generated by hbm2java
 */
public class Zaposleni  implements java.io.Serializable {


     private Integer id;
     private String imeIPrezime;
     private String adresa;
     private int starost;
     private int zarada;

    public Zaposleni() {
    }

    public Zaposleni(String imeIPrezime, String adresa, int starost, int zarada) {
       this.imeIPrezime = imeIPrezime;
       this.adresa = adresa;
       this.starost = starost;
       this.zarada = zarada;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getImeIPrezime() {
        return this.imeIPrezime;
    }
    
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getAdresa() {
        return this.adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public int getStarost() {
        return this.starost;
    }
    
    public void setStarost(int starost) {
        this.starost = starost;
    }
    public int getZarada() {
        return this.zarada;
    }
    
    public void setZarada(int zarada) {
        this.zarada = zarada;
    }
}


