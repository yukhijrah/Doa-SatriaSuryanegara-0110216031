package saha.app.kumpulandoa.model;

public class Doa {
    private String judul;
    private String ayat;
    private String arti;

    public Doa(String judul, String ayat, String arti) {
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }
}


