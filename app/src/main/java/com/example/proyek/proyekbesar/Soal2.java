package com.example.proyek.proyekbesar;

/**
 * Created by bitComp on 11/29/2017.
 */

public class Soal2 {  //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
            "Jawab Dengan Benar",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "daunbayam",
            "guruhandal",
            "hartakarun",
            "hidupsenang",
            "hujanbadai",
            "ibukupandai",
            "jagungbakar",
            "jalanbecek",
            "kakikesemutan",
            "kapalkeruk",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "daun bayam",
            "guru handal",
            "harta karun",
            "hidup senang",
            "hujan badai",
            "ibuku pandai",
            "jagung bakar",
            "jalan becek",
            "kaki kesemutan",
            "kapal keruk",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
