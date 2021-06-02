/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, nik;
        double tesTulis, tesCoding, tesWawancara;
        int jenisForm;
        Scanner inputUse = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        System.out.println("--PILIHAN PENDAFTARAN--");
        System.out.println("1. ANDROID");
        System.out.println("2. WEB");
        System.out.print("Pilih Jenis Form: ");
        jenisForm = inputUse.nextInt();
        
        
        System.out.println("\n--FORM PENDAFTARAN--");
        System.out.print("Nama: ");   
        nama = input.nextLine();
        System.out.print("Nik: ");
        nik = input.next();
        System.out.print("Nilai Tes Tulis: ");
        tesTulis = input.nextDouble();
        System.out.print("Nilai Tes Coding: ");
        tesCoding = input.nextDouble();
        System.out.print("Nilai Tes Wawancara: ");
        tesWawancara = input.nextDouble();
        
        FormPendaftaran daftar = new FormPendaftaran(nama, nik, tesTulis, tesCoding, tesWawancara);
        
        do{
            Scanner menu = new Scanner(System.in);
            System.out.println("\n---- Menu ----");
            System.out.println("1. EDIT");
            System.out.println("2. TAMPILKAN");
            System.out.println("3. Exit");
            System.out.print("PILIH = ");
            int pilih=menu.nextInt();
            switch(pilih){
                case 1:                      
                    nama = daftar.nama;                  
                    nik = daftar.nik;
                    System.out.print("Nilai Tes Tulis: ");
                    tesTulis = input.nextDouble();
                    System.out.print("Nilai Tes Coding: ");
                    tesCoding = input.nextDouble();
                    System.out.print("Nilai Tes Wawancara: ");
                    tesWawancara = input.nextDouble();
                    
                    daftar = new FormPendaftaran(nama, nik, tesTulis, tesCoding, tesWawancara);
                    break;
                case 2:
                    if(jenisForm==1){
                        System.out.println("\nNilai akhir : "+ daftar.android());
                        if(daftar.android()>=85){
                            System.out.println("Keterangan : LULUS");
                            System.out.println("Selamat "+daftar.nama+" diterima sebagai android dev");
                        } else {
                            System.out.println("Keterangan : TIDAK LULUS");
                            System.out.println("Maaf "+daftar.nama+" ditolak sebagai android dev");
                        }
                            
                    }else if(jenisForm==2){
                        System.out.println("\nNilai akhir : "+ daftar.web());
                        if(daftar.web()>=85){
                            System.out.println("Keterangan : LULUS");
                            System.out.println("Selamat "+daftar.nama+" diterima sebagai web dev");
                        } else {
                            System.out.println("Keterangan : TIDAK LULUS");
                            System.out.println("Maaf "+daftar.nama+" ditolak sebagai web dev");
                        }
                    }
                    break;
                case 3:
                    exit=true;
                    break;
            }
            System.out.print("\n");
        } while(!exit);
          
    }
    
}
