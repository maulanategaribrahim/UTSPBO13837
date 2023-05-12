public class MahasiswaBaru extends Mahasiswa{
    String asalSekolah;

    public boolean ikutOspek(){
        if(semester == 1){
            System.out.println("Wajib ikut Ospek");
            return true;
        }else{
            System.out.println("Sudah ikut Ospek");
            return false;
        }
    }

    @Override
    public void infoMahasiswa(){
        System.out.print("Asal Sekolah :" + this.asalSekolah);
        super.infoMahasiswa();
    }
}
