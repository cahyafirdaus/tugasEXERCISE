
public class TestMahasiswa {
    public static void main(String[] args) {
        MHS mhs = new MHS("Cahya Firdaus Putra",21);
        mhs.tampilkanBiodata();
        System.out.println();
        mhs.setUmur(30);
        mhs.tampilkanBiodata();
    }
}