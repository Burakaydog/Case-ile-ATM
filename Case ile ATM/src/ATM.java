import java.util.Scanner;
public class ATM {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Yapılcak işlemi seçiniz: parayükleme,paraçekme,paragörünteleme,paragönderme");
    String x = scan.nextLine();
    int py;
    int py2;
    String hesapnumara;
    int bakiye = 5850;
    switch(x)
    {
    case "parayükleme":
        System.out.println("Para yüklenicek hesabın adını giriniz");
        hesapnumara = scan.nextLine();
    	System.out.println("Yüklencek tutarı giriniz");
    	py = scan.nextInt();
    	{
    	System.out.println(hesapnumara  +"  " +  Adlı "Hesabınıza" + " " + py + " " + "TL yüklenecektir Onaylamak için 1'i, iptal etmek için 2yi tuşlayın");
    	py2 = scan.nextInt();
    	if(py2 == 1)
    	{
    		System.out.println("Hesabınıza" + " " + py + " " + "TL yüklenilmiştir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("Yükleme iptal edildi");
    	}
    	}
    	break;
    case "paraçekme":
    	System.out.println("Çekilecek tutarı giriniz");
    	py = scan.nextInt();
    	if(py >= bakiye)
    	{
    		System.out.println("Yetersiz bakiye");
    	}
    	else{
    	System.out.println("Hesabınızdan" + " " + py + " " + "TL Çekilcektir Onaylamak için 1'i, iptal etmek için 2yi tuşlayın");
    	py2 = scan.nextInt();
    	
    	if(py2 == 1)
    	{
    		System.out.println("Hesabınızdan" + " " + py + " " + "TL Çekilmiştir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("Çekim iptal edildi");
    	}
    	}
    	break;
    case "paragörüntüleme":
    	System.out.println("Hesabınızda toplam" + " " + bakiye + " " + "TL vardır" );
    	break;
    case "paragönderme":
    	System.out.println("Para gönderilcek hesabın adını giriniz:");
    	hesapnumara = scan.nextLine();
        System.out.println("Gönderilcek tutarı giriniz:");
        py = scan.nextInt();
        if(py >= bakiye)
        {
        System.out.println("yetersiz bakiye");
        }
        else{
        System.out.println(hesapnumara + " " + "Adlı  hesaba" + " " + py + " " + "TL yüklenecektir Onaylamak için 1'i, iptal etmek için 2yi tuşlayın"  );
        py2 = scan.nextInt();
        if (py2 == 1)
        {
        System.out.println(hesapnumara + " " + "Adlı hesaba" + " " + py + " " + "TL yüklenmiştir");
        }
        if(py2 == 2)
        {
        	System.out.println("İşlem iptal edilmiştir");
        }
        }
        break;
    }
	
}
}
