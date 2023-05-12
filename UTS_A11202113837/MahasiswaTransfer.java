public class MahasiswaTransfer extends MahasiswaBaru{
    String asalUniv;

    @Override
    public boolean ikutOspek(){
        return super.ikutOspek();
    }

    @Override
    public void infoMahasiswa(){
        System.out.print("Asal Universitas : " + this.asalUniv);
        super.infoMahasiswa();
    }
}
