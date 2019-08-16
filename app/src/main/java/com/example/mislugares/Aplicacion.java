package com.example.mislugares;

import android.app.Application;
import android.content.SharedPreferences;

public class Aplicacion extends Application {

    private int saldo;
    public RepositorioLugares lugares;

    @Override public void onCreate() {
        super.onCreate();
        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        lugares = new RepositorioLugares();
        saldo = pref.getInt("saldo_inicial", -1);
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
}
