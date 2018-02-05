package com.example.proyek.proyekbesar;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static android.provider.CalendarContract.CalendarCache.URI;


public class Selfie extends AppCompatActivity {
    Button mButtonPicture;
    ImageView mImageView;
    File mFileURI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfie);

        mButtonPicture = (Button) findViewById(R.id.btnCapture);
        mImageView = (ImageView) findViewById(R.id.imgPreview);
        mButtonPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captureImage();
            }
        });
// Checking camera availability
        if (!isDeviceSupportCamera()) {
            Toast.makeText(getApplicationContext(), "Camera di device anda tidak tersedia",
                    Toast.LENGTH_LONG).show();
            finish();
        }
    }
    /*
    * Capturing Camera Image will lauch camera app requrest image capture
    */
    private void captureImage() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            mFileURI = getMediaFileName();
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, URI.fromFile(mFileURI));
            startActivityForResult(takePictureIntent, 100);
        }
    }
    /**
     * activity result akan dipanggi setelah camera ditutup
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && resultCode == RESULT_OK) {
            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
// rescale bitmap jika aplikasi force close
// semakin besar ukuran rescale maka image/gambar yang ditampilkan semakin kecil
            bmOptions.inSampleSize = 4;
            Bitmap bitmap = BitmapFactory.decodeFile(mFileURI.getPath(), bmOptions);
            mImageView.setVisibility(View.VISIBLE);
            mImageView.setImageBitmap(bitmap);
        }
    }
    /**
     * mengecek pada perangkat mobile memiliki kamera atau tidak
     * */
    private boolean isDeviceSupportCamera() {
        if (getApplicationContext().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA)) {
// this device has a camera
            return true;
        } else {
// no camera on this device
            return false;
        }
    }
    private static File getMediaFileName() {
// Lokasi External sdcard
        File mediaStorageDir = new
                File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                "CameraDemo");
// Buat directori tidak direktori tidak eksis
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                Log.d("CameraDemo", "Gagal membuat directory"+ "CameraDemo");
                return null;
            }
        }
// Membuat nama file
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(new Date());
        File mediaFile = null;
        mediaFile = new File(mediaStorageDir.getPath() + File.separator + "IMG_" + timeStamp +
                ".jpg");
        return mediaFile;
    }
}