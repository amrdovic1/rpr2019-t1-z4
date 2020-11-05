package ba.unsa.etf.rpr;

public class Korpa {
    private int broj_artikala;
    private Artikl[] artikli;

    public Korpa ()
    {
        broj_artikala = 0;
        artikli = new Artikl[50];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }


    public int dajUkupnuCijenuArtikala ()
    {
        int suma = 0;
        for (Artikl a : artikli)
        {
            if (a != null)
            {
                suma += a.getCijena();
            }
        }
        return suma;
    }

    public Artikl izbaciArtiklSaKodom (String code)
    {
        Artikl a = new Artikl();
        for (int i = 0; i < broj_artikala; i++)
        {
            if (artikli[i].getKod().equals(code))
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

    public boolean dodajArtikl(Artikl a) {
        if (broj_artikala >= 50)
        {
            return false;
        }
        if (a == null)
        {
            System.out.println("Nema tog artikla u supermarketu ili je vec u korpi.");
            return false;
        }
        broj_artikala = broj_artikala + 1;
        artikli[broj_artikala - 1] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        return true;
    }
}
