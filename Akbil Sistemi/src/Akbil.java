import java.util.Scanner;


public class Akbil {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);//kullan�c�dan de�er almay� sa�layan nesneyi burada �a�r�yoruz
	String tur;//metinsel bir ifade oldu�u i�in string ile tan�mlad�k
	String onay;//metinsel bir ifade oldu�u i�in string ile tan�mlad�k
	System.out.println("Hangi akbil t�r�n� ��kartcaks�n?");
	System.out.println("Tam,��renci,Engelli,Gazi"); //Burada akbilin hangi t�r olaca���n� sorguluyoruz
	tur = scan.nextLine(); //Girilen metinsel ifadeyi tur de�i�ken�ne aktar�yoruz
	switch(tur)
	{
	case "Tam"://E�er kullan�c� tam akbil doldurmak isterse program tam adl� case'e giriyo
		System.out.println("Tam akbil ��kartma �creti 13 TL'dir onay veriyor musunuz?");//Onay verip vermedi�ini soruyoruz
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay de�i�ken�ne aktar�yoruz
		if(onay.equals("evet"))//e�er girilen metinsel ifade "evet" ise ko�ulu yerine getiriyor
		{
			System.out.println("Ba�ar�yla Tam akbil ��kartt�n�z....");
		}
		else//de�ilse ko�ul sa�lanm�yor ve direk else blo�una ge�i� yap�l�yor
		{
			System.out.println("��lem iptal edildi...");
		}
		break;//Burda case blo�unu bitiryoruz
	case "��renci"://E�er kullan�c�  ��renci t�r� akbil doldurmak isterse program ��renci adl� case'e giriyo
		System.out.println("��renci akbili ��kartma �creti 20'TL dir onay veriyor musunuz?");
				onay = scan.nextLine();//Girilen metinsel ifadeyi onay de�i�ken�ne aktar�yoruz
				if(onay.equals("evet"))//e�er girilen metinsel ifade "evet" ise ko�ulu yerine getiriyor
				{
					System.out.println("Ba�ar�yla ��renci akbili ��kartt�n�z....");
				}
				else//de�ilse ko�ul sa�lanm�yor ve direk else blo�una ge�i� yap�l�yor
				{
					System.out.println("��lem iptal edildi...");
				}
				break;//Burda case blo�unu bitiryoruz
	case "Engelli":
		System.out.println("Engelli akbili ��kartma �creti 20'TL dir onay veriyor musunuz?");
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay de�i�ken�ne aktar�yoruz
		if(onay.equals("evet"))//e�er girilen metinsel ifade "evet" ise ko�ulu yerine getiriyor
		{
			System.out.println("Ba�ar�yla Engelli akbili ��kartt�n�z....");
		}
		else//de�ilse ko�ul sa�lanm�yor ve direk else blo�una ge�i� yap�l�yor
		{
			System.out.println("��lem iptal edildi...");
		}
		break;
	case "Gazi":
		System.out.println("Gazi akbili ��kartma �creti �cretsiz'dir onay veriyor musunuz?");
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay de�i�ken�ne aktar�yoruz
		if(onay.equals("evet"))//e�er girilen metinsel ifade "evet" ise ko�ulu yerine getiriyor
		{
			System.out.println("Ba�ar�yla Gazi akbili ��kartt�n�z....");
			System.out.println("Bu vatan size minnettar");//Burda gazilere �zel bir te�ekk�r mesaj� b�rakt�m.
		}
		else//de�ilse ko�ul sa�lanm�yor ve direk else blo�una ge�i� yap�l�yor
		{
			System.out.println("��lem iptal edildi...");
		}
		break;
	}
    
}
}
