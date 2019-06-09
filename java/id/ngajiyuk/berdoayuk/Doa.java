package id.ngajiyuk.berdoayuk;

public class Doa {

    private String Title;
    private String Doa;
    private String Latin;
    private String Terjemah;
    private int Gambar;

    public Doa(){
    }

    public Doa(String title, String doa, String latin, String terjemah, int gambar) {
        Title = title;
        Doa = doa;
        Latin = latin;
        Terjemah = terjemah;
        Gambar = gambar;
    }

    public String getTitle() {
        return Title;
    }

    public String getDoa() {
        return Doa;
    }

    public String getLatin() {
        return Latin;
    }

    public String getTerjemah() {
        return Terjemah;
    }

    public int getGambar() {
        return Gambar;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDoa(String doa) {
        Doa = doa;
    }

    public void setLatin(String latin) {
        Latin = latin;
    }

    public void setTerjemah(String terjemah) {
        Terjemah = terjemah;
    }

    public void setGambar(int gambar) {
        Gambar = gambar;
    }
}
