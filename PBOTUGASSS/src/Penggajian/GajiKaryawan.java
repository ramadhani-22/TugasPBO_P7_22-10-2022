
package Penggajian;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GajiKaryawan {
    String NIK;
    String nama;
    String jabatan;
    int gajipokok;

    public GajiKaryawan(String NIK, String nama, String jabatan, int gajipokok) {
        this.NIK = NIK;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    
    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGajipokok() {
        return gajipokok;
    }
    
    
    
    
    
    double getGajiPokok(){
        if(null == jabatan){
            gajipokok = 4000000;
        }
        else gajipokok = switch (jabatan) {
            case "Manager" -> 5000000;
            case "Admin" -> 4500000;
            default -> 4000000;
        };
        return gajipokok;
        }
    
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("Nomer Karyawan : "+ this.NIK);
        System.out.println("Nama Karyawan : "+ this.nama);
        System.out.println("Jabatan : "+ this.jabatan);
        System.out.println("Gaji Pokok : "+ df.format(getGajiPokok()));
    }
}

class newJavaFile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        GajiKaryawan gaji = new GajiKaryawan("K001", "Ahmad Ramadhani", "Manager", 5000000);
        
        System.out.print("Nomer Karyawan : ");
        gaji.NIK = sc.nextLine();
        
        System.out.print("Nama Karyawan : ");
        gaji.nama = sc.nextLine();

        System.out.print("Jabatan : ");
        gaji.jabatan = sc.nextLine();
        
        gaji.cetak();
    }
}
