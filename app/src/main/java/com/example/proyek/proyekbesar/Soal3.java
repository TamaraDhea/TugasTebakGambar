package com.example.proyek.proyekbesar;

/**
 * Created by bitComp on 12/6/2017.
 */

public class Soal3 {
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
            "kataburuk",
            "keongracun",
            "kerasukan",
            "kesurupan",
            "kitabaik",
            "kolamikan",
            "kritiktajam",
            "kurangbaik",
            "kuranggemuk",
            "leptoplelet",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "kata buruk",
            "keong racun",
            "kerasukan",
            "kesurupan",
            "kita baik",
            "kolam ikan",
            "kritik tajam",
            "kurang baik",
            "kurang gemuk",
            "leptop lelet",
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
