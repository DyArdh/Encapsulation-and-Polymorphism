package com.pbo.week9;

public class Buku {
    public String nama;
    private String genre;
    protected int kode;

    public Buku(String newNama, int newKode) {
        nama = newNama;
        kode = newKode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Overriding
    public String infoBuku(){
        return "Nama buku ini adalah " + nama;
    }

    public String infoBuku(String namaPengarang){
        return "Buku " + nama + " memiliki kode " + kode + " nama pengarangnya adalah " + namaPengarang;
    }
    //Overloading
    public void bookInfo(String nama){
        System.out.println("Buku " + nama);
    }

    public void bookInfo(String nama, int kode){
        System.out.println("Buku " + nama + "(" + kode + ") bergenre " + getGenre());
    }

    public String infoBook(){
        return "Buku " + nama + "(" + kode + ") bergenre ";
    }
}
