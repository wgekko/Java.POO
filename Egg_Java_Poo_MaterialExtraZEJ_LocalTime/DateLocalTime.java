/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg_Java_Poo_MaterialExtraZEJ_LocalTime;

/**
 *
 * @author WALTER GOMEZ
 */
public class DateLocalTime {
    
    private int dia, mes, anio;

    public DateLocalTime() {
        dia=0; mes=0; anio=0;
    }

    public DateLocalTime(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "DateLocalTime{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
}
