
import java.util.*;
import Account.Acount;
public class BankMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Acount> list = new ArrayList<>();
	
		while(true) {		
			System.out.println("=================================");
			BankingApplication.menuInfo();
			System.out.println("=================================");
			System.out.printf("�޴� �Է�: ");
			String str = scan.nextLine();
			str.toLowerCase();
			char n = str.charAt(0);
			switch(n) {
				case '1':
					BankingApplication.createId(list);
					break;
				case '2':
					BankingApplication.deposit(list);
					break;
				case '3':
					BankingApplication.withdraw(list);
					break;
				case '4':
					BankingApplication.previousTransaction(list);
					break;
				case '5':					
					System.exit(0);
					scan.close();
					break;
			}
		}
	}
}
