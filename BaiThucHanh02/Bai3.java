import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		int nam=0;
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nhap ten: ");
		String ten = sc.nextLine();

		System.out.println("nhap nam sinh:");
		nam = sc.nextInt();
		
		if((2023-nam)<16){
			System.out.println( ten + " o do tuoi vi 	thanh nien");

		}
		else if((2023-nam)>=16 && (2023-nam)<18) {
			System.out.println( ten +" o do tuoi truong thanh");

			
		}
		else if((2023-nam)>=18) {
			System.out.println( ten + " da gia");

		}
		

	}

}
