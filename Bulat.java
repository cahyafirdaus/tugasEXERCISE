public class Bulat
{
	int jari;
	int diameter;

	public void CetakKeLayar()
	{
		System.out.println("Jari-Jari Bulat: " + jari);
		System.out.println("diameter Bulat: " + diameter);

	}

	public  void ubahProperty(int jariBaru, int diameterBaru)
	{
		jari = jariBaru;
		diameter = diameterBaru;
	
	}

	public double hitungLuasBulat()
	{
		double luas;
		luas = 3.14 * jari * jari;
		return luas;
	}

	public double hitungKelilingBulat()
	{
		double keliling;
		keliling = 3.14 * diameter;
		return keliling;
	}
}
