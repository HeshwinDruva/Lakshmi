import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class practicePrograms {
	@Test
	public void descendingOrder() {
		Integer[] a = { 1, 9, 0, 4, 1, 2 };
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
	}

	@Test
	public void reverseOrder() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Ruby"));
		Collections.reverse(a);
		System.out.println(a);
	}

	@Test
	public void removeDuplicate() {
		String name = "India Malaysia India London Thailand London";
		String[] words = name.split(" ");
		HashSet<String> word = new HashSet<String>();
		for (String wd : words) {
			word.add(wd);
		}
		Iterator it = word.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

	@Test
	public void printOccurenceOfEachCharacter() {
		String name = "My name is Lakshmi Prasanna";
		char[] ch = name.toCharArray();
		int count;
		for (int i = 0; i <= name.length() - 1; i++) {
			count = 1;
			for (int j = i + 1; j <= name.length() - 1; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0') {
				System.out.println(ch[i] + " : " + count);
			}

		}

	}

	@Test
	public void swapTwoNumbers() {
		int a = 5;
		int b = 6;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

	}

	@Test
	public void polindrome() {
		String a = "ABCCBA";
		String reverseWord = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + a.charAt(i);
		}
		if (reverseWord.equals(a)) {
			System.out.println("polindrome");
		} else
			System.out.println("Not polindrome");
	}

	@Test
	public void anagram() {
		String a = "Lakshmi";
		String b = "imhksla";
		char[] c = a.toLowerCase().toCharArray();
		char[] d = a.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if (c.length != d.length) {
			System.out.println("Not anagram");
			System.exit(0);
		}
		for (int i = 0; i <= a.length() - 1; i++) {
			if (c[i] == d[i]) {
				System.out.println("anagram");
				break;
			}

		}
	}
	@Test
	public void firstNonRepeatingCharacter()
	{
		String name="AAPPLE";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			boolean unique=true;
			for(int j=0;j<=name.length()-1;j++)
			{
				if(name.charAt(i)==name.charAt(j) && i!=j)
				{
					unique=false;
					break;
					
				}
			}
			if(unique)
			{
				System.out.println(name.charAt(i));
				break;
			}
			
		}
	}
	
	@Test
	public void pyramid()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void hashMap()
	{
		HashMap<String, Integer> a = new HashMap<String,Integer>();
		a.put("Lakshmi", 1);
		a.put("prasanna", 2);
		for(Map.Entry<String, Integer> entry:a.entrySet())
		{
			System.out.println(entry.getKey()+ "-"+ entry.getValue());
		}
	}
	@Test
	public void countSpecialCharacters()
	{
		String name="She is a singer & dancer as well.?";
		String specialCharacters = name.replaceAll("[A-Za-z0-9 ]", "");
		System.out.println(specialCharacters+ " - "+specialCharacters.length());
	}
	
	@Test
	public void countVowels()
	{
		String name =" The quick brown fox jumps over the lazy dog";
		String Name= name.toLowerCase();
		int count=0;
		for(int i=0;i<=Name.length()-1;i++)
		{
			char wd = Name.charAt(i);
			if(wd == 'a' || wd=='e' || wd=='i' || wd=='o' ||wd=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	@Test
	public void hashsetdescdndingOrder()
	{
		HashSet<String> a = new HashSet<String>();
		a.add("lak");
		a.add("pra");
		a.add("druva");
		TreeSet<String>b = new TreeSet<String>(Collections.reverseOrder());
		b.addAll(a);
		System.out.println(b);
	}
	
	@Test
	public void digit()
	{
		String name="ID: 1234";
		for(int i=0;i<=name.length()-1;i++)
		{
			if(Character.isDigit(name.charAt(i)))
			{
				System.out.print(name.charAt(i));
			}
		}
	}
	@Test
	public void letters()
	{
		String name="ID: 1234";
		for(int i=0;i<=name.length()-1;i++)
		{
			if(Character.isAlphabetic(name.charAt(i)))
			{
				System.out.print(name.charAt(i));
			}
		}
	}
	
	@Test
	public void compareTwoArrays()
	{
		int[] a = {1,2,3,4};
		int[] b= {1,2,3,4};
		if(Arrays.equals(a, b))
		{
			System.out.println("equals");
		}
		else
			System.out.println("Not equals");
					
	}
	
	
}
