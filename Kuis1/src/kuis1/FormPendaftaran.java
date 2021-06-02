/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author HP
 */
public class FormPendaftaran implements MenghitungBobot{
    protected String nama, nik;
    protected double tesTulis, tesCoding, tesWawancara;

    public FormPendaftaran(String nama, String nik, double tesTulis, double tesCoding, double tesWawancara) {
        this.nama = nama;
        this.nik = nik;
        this.tesTulis = tesTulis;
        this.tesCoding = tesCoding;
        this.tesWawancara = tesWawancara;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public double getTesTulis() {
        return tesTulis;
    }

    public void setTesTulis(double tesTulis) {
        this.tesTulis = tesTulis;
    }

    public double getTesCoding() {
        return tesCoding;
    }

    public void setTesCoding(double tesCoding) {
        this.tesCoding = tesCoding;
    }

    public double getTesWawancara() {
        return tesWawancara;
    }

    public void setTesWawancara(double tesWawancara) {
        this.tesWawancara = tesWawancara;
    }
    
    @Override
    public double android() {
        double t = ((double)20/100)*this.tesTulis;
        double c = ((double)50/100)*this.tesCoding;
        double w = ((double)30/100)*this.tesWawancara;
        
        return (t+c+w); 
    }

    @Override
    public double web() {
        double t = ((double)40/100)*this.tesTulis;
        double c = ((double)35/100)*this.tesCoding;
        double w = ((double)25/100)*this.tesWawancara;
        
        return t+c+w; 
    }
    
    
}
