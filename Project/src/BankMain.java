
import java.util.*;
import Account.Acount;
public class BankMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String,String> map = new HashMap<>();
	
		while(true) {		
			System.out.println("=================================");
			BankingApplication.menuInfo();
			System.out.println("=================================");
			System.out.printf("메뉴 입력: ");
			String str = scan.nextLine();
			str.toLowerCase();
			char n = str.charAt(0);
			switch(n) {
				case '1':
					BankingApplication.createId(map);
					break;
				case '2':
					BankingApplication.deposit();
					break;
				case '3':
					BankingApplication.withdraw();
					break;
				case '4':
					BankingApplication.previousTransaction();
					break;
			}
		}
	}
}
