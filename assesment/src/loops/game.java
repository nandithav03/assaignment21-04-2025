package loops;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("enter your choice");
			System.out.println("1.call of warfare-1500");
			System.out.println("2.Speeds Racers-1200");
			System.out.println("3.Mystery Mansion-1000");
			System.out.println("4.Pixel Adventure-800");
			System.out.println("5.Puzel main-500");
			System.out.println("6.Checkout /exit");
			int choice = scanner.nextInt();
			if(choice==6) {
				System.out.println("exiting...");
				break;
			}
			if(choice>6 || choice<=0) {
				System.out.println("enter valid option");
			}
			int sum = 0;
			switch (choice) {
			case 1: {
				System.out.println("call of warfare-1500");
				System.out.println("enter the quantity ");
				int quantity = scanner.nextInt();
				sum = quantity * 1500;
				System.out.println("cost is" + sum);
				
			}
			case 2: {
				System.out.println("2.Speeds Racers-1200");
				System.out.println("enter the quantity ");
				int quantity = scanner.nextInt();
				sum = quantity * 1200;

				System.out.println("cost is" + sum);
			}
			case 3: {
				System.out.println("3.Mystery Mansion-1000");
				System.out.println("enter the quantity ");
				int quantity = scanner.nextInt();
				sum = quantity * 1000;
				System.out.println("cost is" + sum);
			}
			case 4: {
				System.out.println("4.Pixel Adventure-800");
				System.out.println("enter the quantity ");
				int quantity = scanner.nextInt();
				sum = quantity * 800;
				System.out.println("cost is :" + sum);
			}
			case 5: {
				System.out.println("5.Puzel main-500");
				System.out.println("enter the quantity ");
				int quantity = scanner.nextInt();
				sum = quantity * 500;

				System.out.println("cost is" + sum);
			}
			}
		}
	}
}
