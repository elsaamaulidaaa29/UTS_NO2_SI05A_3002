/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.uts_no2_si05a_3002;

/**
 *
 * @author ASUS
 * ELSAMAULIDA_21103002
 */
public class SalariedEmployee_3002 {
    String nama_3002;
    int nip_3002;
    double upah_3002, gaji_3002;
    
    public double gaji_3002(){
        gaji_3002 = upah_3002;
        return gaji_3002;
    }
    
    public void tampilDataSalariedEmployee_3002(){
        System.out.println("Nama               : " + nama_3002);
        System.out.println("NIP                : " + nip_3002);
        System.out.println("Upah Mingguan      : " + gaji_3002);
    }
}    
