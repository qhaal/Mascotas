package com.developer.albert.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;

    private RecyclerView listaMascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        listaMascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this,2);

        listaMascotasFavoritas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotasFavoritas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota_1,"Juan",0));
        mascotas.add(new Mascota(R.drawable.mascota_2,"Perez",0));
        mascotas.add(new Mascota(R.drawable.mascota_3,"Pawan",0));
        mascotas.add(new Mascota(R.drawable.mascota_4,"Pedro",0));
        mascotas.add(new Mascota(R.drawable.mascota_5,"Luis",0));
    }
}
