package proje;

public class LoginBilgileri {
    private String adSoyad;
    private String kullaniciAdi;
    private String eMail;
    private String sifre;

    public LoginBilgileri(String adSoyad, String kullaniciAdi, String eMail, String sifre) {
        this.adSoyad = adSoyad;
        this.kullaniciAdi = kullaniciAdi;
        this.eMail = eMail;
        this.sifre = sifre;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "LoginBilgileri{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", eMail='" + eMail + '\'' +
                ", sifre='" + sifre + '\'' +
                '}';
    }

    public LoginBilgileri() {
    }
}
