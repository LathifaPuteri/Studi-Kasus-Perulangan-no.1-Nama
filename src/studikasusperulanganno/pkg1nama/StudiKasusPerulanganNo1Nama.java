/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulanganno.pkg1nama;

/**
 *
 * @author MOKLET-2
 */
public class StudiKasusPerulanganNo1Nama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        String Nama = "aisyah anaya umami";
        char huruf = 'a';
        int counter = 0;
        
        //looping ke setiap huruf di variabel nama
        for (int i = 0; i<Nama.length(); i++){
            //cek apakah huruf ke-i = huruf yang dicari
            if(Nama.charAt(i)== huruf){
                 //jika iya maka dihitung satu
                counter++;
        }
            }
           //menampilkan hasil perhitungan
       System.out.println("Jumlah huruf a : "+counter);
    }
    
}
