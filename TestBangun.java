public class TestBangun
{
	public static void main(String[] args)
	{
        Trinitas bangun_Trinitas = new Trinitas();
		Bulat bangun_Bulat = new Bulat();
		
		bangun_Trinitas.alas = 12;
		bangun_Trinitas.tinggi = 12;
		bangun_Trinitas.sisimiring = 20;
		bangun_Bulat.jari= 12;
		bangun_Bulat.diameter= 20;
				
		bangun_Bulat.CetakKeLayar();
		System.out.println("Luas Lingkaran: " + bangun_Bulat.hitungLuasBulat());
		System.out.println("Keliling Lingkarang: " + bangun_Bulat.hitungKelilingBulat());

		bangun_Trinitas.CetakKeLayar();
		System.out.println("Luas Trinitas: " + bangun_Trinitas.hitungLuasTrinitas());
		System.out.println("Keliling Trinitas: " + bangun_Trinitas.hitungKelilingTrinitas());
		}

}