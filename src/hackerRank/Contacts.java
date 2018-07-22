package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Contacts {
	
	 private static final Logger log = Logger.getLogger(Contacts.class.getName());

	private static final Scanner scanner = new Scanner(System.in);
	private static List<String> contactList = new ArrayList();
	private static List<String> findList = new ArrayList();

	public static void main(String[] args) {
		
		 
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int nItr = 0; nItr < n; nItr++) {
			String[] opContact = scanner.nextLine().split(" ");
            
			
			String op = opContact[0];
			String contact = opContact[1];
			if(op.equals("add")) {
			
				contactList.add(contact);
			
			} else {
				
				 findList.add(contact);
			}
		}

		scanner.close();
		
		findAndPrint(contactList,findList);
	}

	private static void findAndPrint(List<String> contactList, List<String> findList) {
		// look through the contact list
	    //if any of the elements has a substring that equals to findString, then add counter
		
		for(String findString : findList) {
			int counter=0;
			for(String contactString : contactList) {
				log.info("subString is :"+contactString.substring(0, findString.length()));
				log.info("findString is :"+findString);
				if(contactString.substring(0, findString.length()).equals(findString)) {
					counter++;	
				}				
			}
			System.out.println(counter);			
		}		
	}

	

	
}
