package upacademy.HelloWorld;

public class HelloWorld {
	
	public static void main (String []args) {
		ScannerUtils scan = new ScannerUtils ();
		
		System.out.println ("Hello! What is your name?");
		String name = scan.getText();
		System.out.println ("What is you age,"+ name + "?");
		int age = scan.getInt();
		System.out.println ("Your age is:" + age);
	}

}
