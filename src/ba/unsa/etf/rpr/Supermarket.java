package ba.unsa.etf.rpr;

public class Supermarket {
    private int broj_artikala;
    private Artikl[] artikli;

    public Supermarket ()
    {
        broj_artikala = 0;
        artikli = new Artikl [1000];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void dodajArtikl(Artikl a) {
        if (broj_artikala >= 1000)
        {
            return;
        }
        broj_artikala = broj_artikala + 1;
        artikli[broj_artikala - 1] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl();
        for (int i = 0; i < broj_artikala; i++)
        {
            if (artikli[i].getKod().equals(kod))
            {
                a = artikli[i];
                for (int j = i; j < broj_artikala; j++)
                {
                    artikli[j] = artikli[j + 1];
                }
                broj_artikala--;
                break;
            }
        }
        return a;
    }
}
