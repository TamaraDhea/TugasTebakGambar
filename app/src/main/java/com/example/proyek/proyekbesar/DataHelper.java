package com.example.proyek.proyekbesar;

/**
 * Created by Hudha on 1/17/2018.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DataHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "soal.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
// TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
// TODO Auto-generated method stub
        String sql = "create table soal(no integer primary key, nama text null, soal text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO soal (no, nama, soal) VALUES ('1001', 'Fathur', 'jin dan nasi');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
// TODO Auto-generated method stub
    }
}
