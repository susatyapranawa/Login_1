package com.example.login.Model;

public class m_barang {
    String nama_barang;
    int img;

    public m_barang(String nama_barang, int img) {
        this.nama_barang = nama_barang;
        this.img = img;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
