import java.util.Scanner;
public class ATM {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Yap�lcak i�lemi se�iniz: paray�kleme,para�ekme,parag�r�nteleme,parag�nderme");
    String x = scan.nextLine();
    int py;
    int py2;
    int hesapnumara;
    int bakiye = 5850;
    switch(x)
    {
    case "paray�kleme":
    	System.out.println("Y�klencek tutar� giriniz");
    	py = scan.nextInt();
    	{
    	System.out.println("Hesab�n�za" + " " + py + " " + "TL y�klenecektir Onaylamak i�in 1'i, iptal etmek i�in 2yi tu�lay�n");
    	py2 = scan.nextInt();
    	if(py2 == 1)
    	{
    		System.out.println("Hesab�n�za" + " " + py + " " + "TL y�klenilmi�tir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("Y�kleme iptal edildi");
    	}
    	}
    	break;
    case "para�ekme":
    	System.out.println("�ekilecek tutar� giriniz");
    	py = scan.nextInt();
    	if(py >= bakiye)
    	{
    		System.out.println("Yetersiz bakiye");
    	}
    	else{
    	System.out.println("Hesab�n�zdan" + " " + py + " " + "TL �ekilcektir Onaylamak i�in 1'i, iptal etmek i�in 2yi tu�lay�n");
    	py2 = scan.nextInt();
    	
    	if(py2 == 1)
    	{
    		System.out.println("Hesab�n�zdan" + " " + py + " " + "TL �ekilmi�tir" );
    	}
    	if(py2 == 2)
    	{
    		System.out.println("�ekim iptal edildi");
    	}
    	}
    	break;
    case "parag�r�nt�leme":
    	System.out.println("Hesab�n�zda toplam" + " " + bakiye + " " + "TL vard�r" );
    	break;
    case "parag�nderme":
    	System.out.println("Para g�nderilcek hesab�n numaras�n� giriniz:");
    	hesapnumara = scan.nextInt();
        System.out.println("G�nderilcek tutar� giriniz:");
        py = scan.nextInt();
        if(py >= bakiye)
        {
        System.out.println("yetersiz bakiye");
        }
        else{
        System.out.println(hesapnumara + " " + "numaral� hesaba" + " " + py + " " + "TL y�klenecektir Onaylamak i�in 1'i, iptal etmek i�in 2yi tu�lay�n"  );
        py2 = scan.nextInt();
        if (py2 == 1)
        {
        System.out.println(hesapnumara + " " + "numaral� hesaba" + " " + py + " " + "TL y�klenmi�tir");
        }
        if(py2 == 2)
        {
        	System.out.println("��lem iptal edilmi�tir");
        }
        }
        break;
    }
	
}
}
