package saha.app.kumpulandoa.model;

public class Jadwal {

    private String nama;
    private String waktu;

    public Jadwal(String nama, String waktu) {
        this.nama = nama;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public String getWaktu() {
        return waktu;
    }

}
