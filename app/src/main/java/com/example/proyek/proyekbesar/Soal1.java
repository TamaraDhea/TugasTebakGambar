package com.example.proyek.proyekbesar;

/**
 * Created by Hudha on 11/17/2017.
 */

public class Soal1 {
        //membuat array untuk pertanyaan
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
                "ceritacinta",
                "cakarberuang",
                "pertamab",
                "anakautis",
                "anakmandiri",
                "ayamrebus",
                "bisapusing",
                "buahbibir",
                "buahtangan",
                "airkeras",
        };

        //membuat array jawaban benar
        private String jawabanBenar[] = {
                "cerita cinta",
                "cakar beruang",
                "obat nyamuk",
                "anak autis",
                "anak mandiri",
                "ayam rebus",
                "bisa pusing",
                "buah bibir",
                "buah tangan",
                "air keras",
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

