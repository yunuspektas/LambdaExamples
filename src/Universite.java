public class Universite {
    private String Universite;
    private String bolum;
    private int ogrcSayisi;
    private int notOrt;

    public Universite() {
    }

    public Universite(String universite, String bolum, int ogrcSayisi, int notOrt) {
        Universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return Universite;
    }

    public void setUniversite(String universite) {
        Universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }
}
