import java.util.Scanner;


public class Akbil {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);//kullanýcýdan deðer almayý saðlayan nesneyi burada çaðrýyoruz
	String tur;//metinsel bir ifade olduüu için string ile tanýmladýk
	String onay;//metinsel bir ifade olduüu için string ile tanýmladýk
	System.out.println("Hangi akbil türünü çýkartcaksýn?");
	System.out.println("Tam,Öðrenci,Engelli,Gazi"); //Burada akbilin hangi tür olacaðýýný sorguluyoruz
	tur = scan.nextLine(); //Girilen metinsel ifadeyi tur deðiþkenþne aktarýyoruz
	switch(tur)
	{
	case "Tam"://Eðer kullanýcý tam akbil doldurmak isterse program tam adlý case'e giriyo
		System.out.println("Tam akbil çýkartma ücreti 13 TL'dir onay veriyor musunuz?");//Onay verip vermediðini soruyoruz
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay deðiþkenþne aktarýyoruz
		if(onay.equals("evet"))//eðer girilen metinsel ifade "evet" ise koþulu yerine getiriyor
		{
			System.out.println("Baþarýyla Tam akbil çýkarttýnýz....");
		}
		else//deðilse koþul saðlanmýyor ve direk else bloðuna geçiþ yapýlýyor
		{
			System.out.println("Ýþlem iptal edildi...");
		}
		break;//Burda case bloðunu bitiryoruz
	case "Öðrenci"://Eðer kullanýcý  öðrenci türü akbil doldurmak isterse program Öürenci adlý case'e giriyo
		System.out.println("Öðrenci akbili çýkartma ücreti 20'TL dir onay veriyor musunuz?");
				onay = scan.nextLine();//Girilen metinsel ifadeyi onay deðiþkenþne aktarýyoruz
				if(onay.equals("evet"))//eðer girilen metinsel ifade "evet" ise koþulu yerine getiriyor
				{
					System.out.println("Baþarýyla Öðrenci akbili çýkarttýnýz....");
				}
				else//deðilse koþul saðlanmýyor ve direk else bloðuna geçiþ yapýlýyor
				{
					System.out.println("Ýþlem iptal edildi...");
				}
				break;//Burda case bloðunu bitiryoruz
	case "Engelli":
		System.out.println("Engelli akbili çýkartma ücreti 20'TL dir onay veriyor musunuz?");
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay deðiþkenþne aktarýyoruz
		if(onay.equals("evet"))//eðer girilen metinsel ifade "evet" ise koþulu yerine getiriyor
		{
			System.out.println("Baþarýyla Engelli akbili çýkarttýnýz....");
		}
		else//deðilse koþul saðlanmýyor ve direk else bloðuna geçiþ yapýlýyor
		{
			System.out.println("Ýþlem iptal edildi...");
		}
		break;
	case "Gazi":
		System.out.println("Gazi akbili çýkartma ücreti ücretsiz'dir onay veriyor musunuz?");
		onay = scan.nextLine();//Girilen metinsel ifadeyi onay deðiþkenþne aktarýyoruz
		if(onay.equals("evet"))//eðer girilen metinsel ifade "evet" ise koþulu yerine getiriyor
		{
			System.out.println("Baþarýyla Gazi akbili çýkarttýnýz....");
			System.out.println("Bu vatan size minnettar");//Burda gazilere özel bir teþekkür mesajý býraktým.
		}
		else//deðilse koþul saðlanmýyor ve direk else bloðuna geçiþ yapýlýyor
		{
			System.out.println("Ýþlem iptal edildi...");
		}
		break;
	}
    
}
}
