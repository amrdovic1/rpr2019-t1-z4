package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl ()
    {
        naziv = null;
        cijena = 0;
        kod = null;
    }

    public Artikl (String name, int price, String code){
        naziv = name;
        cijena = price;
        kod = code;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
