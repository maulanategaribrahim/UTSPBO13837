import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilih;
        System.out.print("Masukan jumlah mahasiswa: ") ;
        int jumlahMahasiswa = input.nextInt();

        while(true){
            System.out.println("== Pilih jenis mahasiswa: ==");
            System.out.println("1. Mahasiswa Aktif");
            System.out.println("2. Mahasiswa Baru");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("Pilih nomer : ");
            pilih = input.nextInt();
            if(pilih == 2){
                System.out.println("1. Mahasiswa Baru");
                System.out.println("2. Mahasiswa Transfer");
                pilih = input.nextInt();
                if (pilih == 1) {
                    pilih = 2;
                }else if (pilih ==2){
                    pilih = 4;
                }
            }
            switch(pilih) {
                case 1:
                    for(int i = 0; i < jumlahMahasiswa; i++){
                        Mahasiswa mahasiswa = new Mahasiswa();
                        System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                        System.out.print("Nama :");
                        mahasiswa.nama = input.next();
                        System.out.print("NIM :");
                        mahasiswa.nim = input.next();
                        System.out.print("Semester :");
                        mahasiswa.semester = input.nextInt();
                        System.out.print("Usia :");
                        mahasiswa.usia = input.nextInt();
                        mahasiswa.inputKrs();
                        mahasiswa.hitungRataNilai();
                        daftarMahasiswa.add(mahasiswa);
                    }
                    break;
                case 2:
                    for(int i = 0; i < jumlahMahasiswa; i++){
                        MahasiswaBaru mhsBaru = new MahasiswaBaru();
                        System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                        System.out.print("Nama :");
                        mhsBaru.nama = input.next();
                        System.out.print("NIM :");
                        mhsBaru.nim = input.next();
                        System.out.print("Semester :");
                        mhsBaru.semester = input.nextInt();
                        System.out.print("Usia :");
                        mhsBaru.usia = input.nextInt();
                        System.out.print("Asal Sekolah :");
                        mhsBaru.asalSekolah = input.next();
                        mhsBaru.inputKrs();
                        mhsBaru.hitungRataNilai();
                        daftarMahasiswa.add(mhsBaru);
                    }
                    break;
                case 3:
                    for(int i = 0; i < jumlahMahasiswa; i++){
                        MahasiswaLulus mhsLulus = new MahasiswaLulus();
                        System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                        System.out.print("Nama :");
                        mhsLulus.nama = input.next();
                        System.out.print("NIM :");
                        mhsLulus.nim = input.next();
                        System.out.print("Semester :");
                        mhsLulus.semester = input.nextInt();
                        System.out.print("Usia :");
                        mhsLulus.usia = input.nextInt();
                        System.out.print("Tahun Masuk :");
                        mhsLulus.tahunWisuda = input.nextInt();
                        mhsLulus.inputKrs();
                        mhsLulus.hitungRataNilai();
                        daftarMahasiswa.add(mhsLulus);
                    }
                    break;
                case 4:
                    for(int i = 0; i < jumlahMahasiswa; i++){
                        MahasiswaTransfer mhsTransfer = new MahasiswaTransfer();
                        System.out.println("Data Mahasiswa ke " + (i+1) + "-");
                        System.out.print("Nama :");
                        mhsTransfer.nama = input.next();
                        System.out.print("NIM :");
                        mhsTransfer.nim = input.next();
                        System.out.print("Semester :");
                        mhsTransfer.semester = input.nextInt();
                        System.out.print("Usia :");
                        mhsTransfer.usia = input.nextInt();
                        System.out.print("Asal Universitas :");
                        mhsTransfer.asalUniv = input.next();
                        mhsTransfer.inputKrs();
                        mhsTransfer.hitungRataNilai();
                        daftarMahasiswa.add(mhsTransfer);
                    }
                    break;
                   
            }
            for (int i = 0; i< daftarMahasiswa.size(); i++){
                System.out.println("\nData Mahasiswa ke " + (i+1) + "-");
                daftarMahasiswa.get(i).infoMahasiswa();
                daftarMahasiswa.get(i).infoKrsMahasiswa();
            }
            
           
        }
    } 
}
