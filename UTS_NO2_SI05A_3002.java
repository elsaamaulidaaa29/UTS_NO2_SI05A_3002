/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum1.uts_no2_si05a_3002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * ELSAMAULIDA_21103002
 */
public class UTS_NO2_SI05A_3002 {
    public static void main(String[] args) {
        SalariedEmployee_3002 Se = new SalariedEmployee_3002();
        CommissionEmployee_3002 Ce = new CommissionEmployee_3002();
        ProjectPlanner_3002 Pp = new ProjectPlanner_3002();
        System.out.println();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            Se.nama_3002 = "Elsa";
            Se.nip_3002 = 3001;
            Se.gaji_3002 = 2500000;
            
            Ce.nama_3002 = "Anna";
            Ce.nip_3002 = 3002;
            Ce.gaji_3002 = 3000000;
            Ce.komisi_3002 = 250000;
            Ce.penjualan_3002 = 25;
            
            Pp.nama_3002 = "Brian";
            Pp.nip_3002 = 1003;
            Pp.gaji_3002 = 2800000;
            Pp.komisi_3002 = 300000;
            Pp.proyek_3002 = 7;
            
            Se.tampilDataSalariedEmployee_3002();
            System.out.println("");
            Ce.tampilDataCommissionEmployee_3002();
            System.out.println("");
            Pp.tampilDataProjectPlanner_3002();
            System.out.println("");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
