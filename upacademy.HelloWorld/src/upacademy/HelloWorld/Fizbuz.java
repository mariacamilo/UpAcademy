package upacademy.HelloWorld;

public class Fizbuz  {
	public static void main (String[] args) {
		  ScannerUtils su = new ScannerUtils () ;
		  System.out.println ("Digite um número entre 1 e 40...");
		  int userValue = su.getInt(1, 40);
		  int i = 0;
		  while (i <= userValue) {
			  if (i%3 == 0 && i % 5 == 0) {
				  System.out.println ("FizBuz");
				  i++;
				  
			  } else if (i%3==0) {
				  System.out.println ("Fiz");
				  i++;
				  
			  }else if (i%5 == 0) {
				  System.out.println ("Buz");
				  i++;
			  }
			  else  {
				  System.out.println (i);
				  i++;
				  
			  }
		  }
	}
}
