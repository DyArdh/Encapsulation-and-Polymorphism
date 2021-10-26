package com.pbo.week9;

public class Novel extends Buku{
    public Novel(String newNama, int newKode) {
        super(newNama, newKode);
    }

    @Override
    public String infoBuku() {
        return "Novel ini berjudul " + nama;
    }

    public String infoBuku(String namaPengarang){
        return "Novel " + nama + " berkode " + kode + " karya " + namaPengarang;
    }
}