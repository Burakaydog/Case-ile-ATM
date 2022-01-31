import java.util.Scanner;
public class ATM {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Yapýlcak iþlemi seçiniz: parayükleme,paraçekme,paragörünteleme,paragönderme");
    String x = scan.nextLine();
    int py;
    int py2;
    int hesapnumara;
    int bakiye = 5850;
    switch(x)
    {
    case "parayükleme":
    	System.out.println("Yüklencek tutarý giriniz");
    	py = scan.nextInt();
    	{
    	System.out.println("Hesabýnýza" + " " + py + " " + "TL yüklenecektir Onaylamak için 1'i, iptal etmek için 2yi tuþlayýn");
    	py2 = scan.nextInt();
    	if(py2 == 1)
    	{
    		System.out.println("Hesabýnýza" + " " + py + " " + "TL yüklenilmiþtir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("Yükleme iptal edildi");
    	}
    	}
    	break;
    case "paraçekme":
    	System.out.println("Çekilecek tutarý giriniz");
    	py = scan.nextInt();
    	if(py >= bakiye)
    	{
    		System.out.println("Yetersiz bakiye");
    	}
    	else{
    	System.out.println("Hesabýnýzdan" + " " + py + " " + "TL Çekilcektir Onaylamak için 1'i, iptal etmek için 2yi tuþlayýn");
    	py2 = scan.nextInt();
    	
    	if(py2 == 1)
    	{
    		System.out.println("Hesabýnýzdan" + " " + py + " " + "TL Çekilmiþtir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("Çekim iptal edildi");
    	}
    	}
    	break;
    case "paragörüntüleme":
    	System.out.println("Hesabýnýzda toplam" + " " + bakiye + " " + "TL vardýr" );
    	break;
    case "paragönderme":
    	System.out.println("Para gönderilcek hesabýn numarasýný giriniz:");
    	hesapnumara = scan.nextInt();
        System.out.println("Gönderilcek tutarý giriniz:");
        py = scan.nextInt();
        if(py >= bakiye)
        {
        System.out.println("yetersiz bakiye");
        }
        else{
        System.out.println(hesapnumara + " " + "numaralý hesaba" + " " + py + " " + "TL yüklenecektir Onaylamak için 1'i, iptal etmek için 2yi tuþlayýn"  );
        py2 = scan.nextInt();
        if (py2 == 1)
        {
        System.out.println(hesapnumara + " " + "numaralý hesaba" + " " + py + " " + "TL yüklenmiþtir");
        }
        if(py2 == 2)
        {
        	System.out.println("Ýþlem iptal edilmiþtir");
        }
        }
        break;
    }
	
}
}
