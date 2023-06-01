import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.TreeSet;
import java.sql.*;
import org.testng.annotations.Test;

public class JavaPrograms {
	@Test
	public void descendingOrder() {
		int[] a = { 8, 5, 4, 9 };
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i : a) {
			num.add(i);
		}
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
	}

	@Test
	public void descendingOrder1() {
		Integer[] a = { 1, 6, 2, 3 };
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
	}

	@Test
	public void reverseNumber() {
		ArrayList<String> num = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Ruby"));
		Collections.reverse(num);
		System.out.println(num);
	}

	@Test
	public void removeDuplicates() {
		String sentence = "India Malaysia India London Thailand London";
		// ArrayList<String> sentence1=new ArrayList<String>(Arrays.asList(""))
		String[] words = sentence.split(" ");
		HashSet<String> word = new HashSet<String>();
		for (String wd : words) {
			word.add(wd);
		}
		// System.out.println(word);
		Iterator it = word.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

	@Test
	public void printOccurenceOfEachCharacter() {
		String name = "Apple ebe";
		int count;
		char[] ch = name.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			count = 1;
			for (int j = i + 1; j <= ch.length - 1; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count >= 1 && ch[i] != '0' &&ch[i]!=' ') {
				System.out.println(ch[i] + "-" + count);
			}

		}

	}

	@Test
	public void swapVariables() {
		int a = 2;
		int b = 3;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);

	}

	@Test
	public void polindrome() {
		String name = "abccba";
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}
		if (name.equals(reverseString)) {
			System.out.println("polindrome");
		} else
			System.out.println("Not polindrome");
	}

	@Test
	public void pyramid() {
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	@Test
	public void Anagram() {
		String s1 = "Lakshmi";
		String s2 = "imhskaL";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i <= ch1.length - 1; i++) {
			if (ch1[i] == ch2[i]) {
				System.out.println("ANAGRAM");
				System.exit(0);
			} else
				System.out.println("Not Anagram");
			System.exit(0);
		}

	}

	@Test
	public void hashmap() {
		HashMap<String, Object> a = new HashMap<String, Object>();
		a.put("Selenium", 3.141);
		a.put("Testing", 2.141);
		a.put("ecl", 2.141);
		for (Map.Entry<String, Object> entry : a.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	@Test
	public void printFirstNonRepeatingCharacter() {
		String name = "nnaamme";

		for (int i = 0; i <= name.length() - 1; i++) {
			boolean unique = true;
			for (int j = 0; j <= name.length() - 1; j++) {
				if (name.charAt(i) == name.charAt(j) && i != j) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(name.charAt(i));
				break;
			}
		}
	}

	@Test
	public void countSpecialCharacters() {
		String name = "She is a singer & dancer as well.";
		String specialCharacters = name.replaceAll("[A-Za-z0-9 ]", "");
		System.out.println(specialCharacters);
		System.out.println(specialCharacters.length());
	}

	@Test
	public void countVowels() {
		String sentence = "aaeeooo";
		int count = 0;
		String str = sentence.toLowerCase();
		for (int i = 0; i <= str.length() - 1; i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

			}

		}
		System.out.println(count);
	}

	@Test
	public void printNumbercharacters() {
		String name = "lakshmi9854548*";
		int count = 0;
		String digit = "";
		for (int i = 0; i <= name.length() - 1; i++) {

			if (Character.isDigit(name.charAt(i))) {
				count++;
				digit = digit + name.charAt(i);
			}

		}
		System.out.print(digit + " " + count);

	}

	@Test
	public void printcharacters() {
		String name = "MacPro 2012 model";
		int count = 0;
		String digit = "";
		for (int i = 0; i <= name.length() - 1; i++) {

			if (Character.isAlphabetic(name.charAt(i))) {
				count++;
				digit = digit + name.charAt(i);
			}

		}
		System.out.print(digit + " " + count);

	}

	@Test
	public void compareTwoGivenArrays() {
		int[] a = { 1, 3, 2, 4, 5 };
		int[] b = { 1, 3, 2, 4, 5 };
		if (Arrays.equals(a, b)) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");
	}

	@Test
	public void hashmapSortingValues() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Lakshmi", 1);
		map.put("prasanna", 2);
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}

		});
		for (Map.Entry<String, Integer> e : list) {
			System.out.println(e.getKey() + "=" + e.getValue());

		}
	}

	@Test
	public void hashsetDescendingOrder() {
		HashSet<String> a = new HashSet<String>();
		a.add("Lakshmi");
		a.add("Lokesh");
		a.add("Heshwin");
		a.add("Druva");
		TreeSet<String> a1 = new TreeSet<String>(Collections.reverseOrder());
		a1.addAll(a);
		System.out.println(a1);
	}
	
	@Test
	public void JDBCConnection() throws SQLException, ClassNotFoundException
	{
		   String url
           = "jdbc:mysql://localhost:3306/table_name"; // table details
       String username = "rootgfg"; // MySQL credentials
       String password = "gfg123";
       String query
           = "select *from students"; // query to be run
       Class.forName(
           "com.mysql.cj.jdbc.Driver"); // Driver name
       Connection con = DriverManager.getConnection(
           url, username, password);
       System.out.println(
           "Connection Established successfully");
       Statement st = con.createStatement();
       ResultSet rs
           = st.executeQuery(query); // Execute query
       rs.next();
       String name
           = rs.getString("name"); // Retrieve name from db

       System.out.println(name); // Print result on console
       st.close(); // close statement
       con.close(); // close connection
       System.out.println("Connection Closed....");
   }
	

}
