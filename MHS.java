
public class MHS  {
    private String nama;
    private int umur;
    public MHS(String n,int u){
        nama = n;
        umur = u;
    }
    public void tampilkanBiodata(){
        System.out.println("===Biodata===");
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int u) {
        this.umur = u;
    }
}