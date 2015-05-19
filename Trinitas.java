public class Trinitas
{
	int alas;
	int tinggi;
	int sisimiring;

	public void CetakKeLayar()
	{
		System.out.println("Alas Trinitas: " + alas);
		System.out.println("Tinggi Trinitas: " + tinggi);
		System.out.println("Sisimiring Trinitas: " + sisimiring);

	}

	public  void ubahProperty(int alasBaru, int tinggiBaru, int sm)
	{
		alas = alasBaru;
		tinggi = tinggiBaru;
		sisimiring = sm;
	}

	public double hitungLuasTrinitas()
	{
		double luas;
		luas = ((0.5) * alas * tinggi);
		return luas;
	}

	public int hitungKelilingTrinitas()
	{
		int keliling;
		keliling = (alas + sisimiring + sisimiring);
		return keliling;
	}
}
