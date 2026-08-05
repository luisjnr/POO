import java.util.Scanner;

public class Calculadora {
	
	public static int Interface(){
		System.out.println("1 - Soma\n2 - Multiplicação");
		Scanner scan = new Scanner(System.in);
		int opc = scan.nextInt();
		return opc; 
	}
	
    public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		do{
			switch (Interface()){
				case 1: System.out.println("NUM 1: ");
					x = scan.nextInt();
					System.out.println("NUM 2: ");
					y = scan.nextInt();
					System.out.println("Resultado: " + (x + y));
					break;
				case 2:
					System.out.println("NUM 1: ");
					x = scan.nextInt();
					System.out.println("NUM 2: ");
					y = scan.nextInt();
					System.out.println("Resultado: " + (x * y));		
					break;
				default:
				
			}
		} while (true);
    }

}
