package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class ContactsOptimized {
	private static final Logger log = Logger.getLogger(Contacts.class.getName());

	private static final Scanner scanner = new Scanner(System.in);
	private static Map<String, Integer> contactMap = new HashMap();
	private static Map<Character, LinkedList> nodeMap = new HashMap();
	private static List<String> findList = new ArrayList();

	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList();

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		boolean unique = true;

		for (int nItr = 0; nItr < n; nItr++) {
			String[] opContact = scanner.nextLine().split(" ");

			String op = opContact[0];
			String contact = opContact[1];
			if (op.equals("add")) {

				addToNode(nodeMap, contact);

			} else {

				// findAndPrint
				findAndPrint(nodeMap, contact);
			}
		}

		scanner.close();
		System.out.println(nodeMap);

	}

	private static void addToNode(Map<Character, LinkedList> nodeMap, String contact) {
		char start = contact.toCharArray()[0];
		// traverse through the node tree to find the characters of contact string. if
		// its not inside, add it

		for (char c : contact.toCharArray()) {

			if (nodeMap.get(start) != null) {
				if((char)nodeMap.get(start).getFirst()!=c) {
					
					
				}

			} else {

				LinkedList list = new LinkedList();
				nodeMap.put(c, list);
				list.add(c);

			}
		}

	}

	private static void checkUniqueSubstringAndUpdateMAp(Map<String, Integer> contactMap, String contact) {
		// TODO Auto-generated method stub

		Iterator it = contactMap.keySet().iterator();
		while (it.hasNext()) {
			String subString = (String) it.next();
			// if contact is a substring of usubstring or if usubstring is a substring of
			// contact
			if (subString.substring(0, contact.length()).equals(contact)) {
				// update counter for this key
				int stored = contactMap.get(subString);
				contactMap.remove(subString);
				contactMap.put(contact, ++stored);
			}
			// if subString is a substring of contact
			if (contact.substring(0, subString.length()).equals(subString)) {
				int stored = contactMap.get(subString);
				contactMap.put(subString, ++stored);
			}

		}

		if (contactMap.isEmpty()) {
			contactMap.put(contact, 1);
		}

	}

	private static void findAndPrint(Map<Character, LinkedList> nodeMap2, String contact) {

	}

}

class Node {

	char character;
	Node next;

	public Node(char character, Node next) {

		this.character = character;
		this.next = next;
	}

	public char getData() {

		return character;
	}

	public Node getNext() {

		return next;
	}

}
