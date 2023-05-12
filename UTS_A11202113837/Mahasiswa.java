import java.util.Scanner;

public class Mahasiswa {
    Scanner input = new Scanner(System.in);
    String nim, nama;
    String[] krs;
    Scanner inputKRS = new Scanner(System.in);
    int semester, usia, loop;
    float rata, totalIPK;
    public String asalSekolah;
    public int tahunWisuda;
    public String asalUniv;
    private static final int MAKSKRS = 8;

    
    public float hitungRataNilai(){
        this.totalIPK = 0;
        int[] nilai = new int[this.loop+1];
        for(int i = 0; i <= this.loop; i++){
            System.out.print("Masukan nilai " + krs[i] + " : ");
            nilai[i] = input.nextInt();
        }
        int total = 0;
        for(int i = 0; i <= this.loop; i++){
            total += nilai[i];
        }
        for(int i = 0; i<=this.loop; i++){
            if(nilai[i]>=80 && nilai[i]<=100){
                float nilaiIPK = 4.0f;
                totalIPK += nilaiIPK;
            }else if(nilai[i]>=70 && nilai[i]<=79){
                float nilaiIPK = 3.0f;
                totalIPK += nilaiIPK;
            }else if(nilai[i]>=60 && nilai[i]<=69){
                float nilaiIPK = 2.0f;
                totalIPK += nilaiIPK;
            }else if(nilai[i]>=50 && nilai[i]<=59){
                float nilaiIPK = 1.0f;
                totalIPK += nilaiIPK;
            }else if(nilai[i]>=0 && nilai[i]<=49){
                float nilaiIPK = 0.0f;
                totalIPK += nilaiIPK;
            }else{
                return totalIPK;
            }
        }
        this.rata = (float) total / (this.loop+1);
        return rata;
    }

    public void infoMahasiswa(){
        System.out.println("Nama " + this.nama);
        System.out.println("NIM " + this.nim);
        System.out.println("Semester " + this.semester);
        System.out.println("Usia " + this.usia);
        System.out.println("Rata Rata " + this.rata);
        if(this instanceof MahasiswaTransfer){
           System.out.print(((MahasiswaTransfer)this).ikutOspek());
        }else if(this instanceof MahasiswaBaru){
            System.out.print(((MahasiswaBaru)this).ikutOspek());
        }
    }

    public void inputKrs(){
        System.out.println("Isi KRS :");
        this.krs = new String[MAKSKRS];
        for(int i = 0; i<MAKSKRS; i++){
            System.out.println("Mata Kuliah " + (i+1) + " : ");
            this.krs[i] = inputKRS.nextLine();
            if(i>=4){
                System.out.print("Sudah? (Y/N)");
                String sudah = inputKRS.nextLine();
                if(sudah.equals("Y")|| sudah.equals("N")){
                    this.loop = i;
                    break;
                }
            }
            this.loop = i;
        }
    }

    public void infoKrsMahasiswa(){
        System.out.print("KRS Mahasiswa NIM" + this.nim + ": ");
        for(int i = 0; i <=this.loop; i++){
            if(krs[i] == null){
                break;
            }
            System.out.println("- " + this.krs[i]);
        }
    }
}
