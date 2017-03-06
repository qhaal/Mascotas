package com.developer.albert.mascotas;

/**
 * Created by Albert on 5/03/2017.
 */

public class Mascota {

    private int foto;
    private String nombreMascota;
    private int puntuacion;

    public Mascota(int foto, String nombreMascota, int puntuacion) {
        this.foto = foto;
        this.nombreMascota = nombreMascota;
        this.puntuacion = puntuacion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
