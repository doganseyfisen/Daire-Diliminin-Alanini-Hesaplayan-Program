import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		
		int r, a;
		double pi = 3.14;
		double alan;
		Scanner input = new Scanner(System.in);
		System.out.print("Yarıçap değeri girin: ");
		r = input.nextInt();
		System.out.print("Merkez açı ölçüsü girin: ");
		a = input.nextInt();
		alan = (pi*(r*r)*a)/360;
		System.out.println("Daire diliminin alanı: "+alan);
		}
	}	
