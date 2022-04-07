/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_7_22;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menampilkan aksesoris
        System.out.println("Nama Hewan :");
        //C2.Hewan di ambil dari method abstarct C1
      C2.Hewan();
      //Membuat objek untuk tipe data void
      C2 obj = new C2();
      //Menampilkan aksesoris
        System.out.println("Makanan :");
        //Objek di ambil dari method class C2
      obj.Makanan();
      //Menampilkan aksesoris
        System.out.println("Berkembang Biak :");
        //Objek di ambil dari method class C2
        obj.BerkembangBiak();
        //Menampilkan aksesoris
        System.out.println("Berat Badan :");
        //Objek di ambil dari method class C2
        obj.Berat();
    }
}
