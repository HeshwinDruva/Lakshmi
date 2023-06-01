import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Interview {

	@Test
	public void colour() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();

		WebElement a = driver.findElement(By.cssSelector("[value=\"Check Your Refund\"]"));
		String b = a.getCssValue("background");
		System.out.println(b);

	}

	@Test
	public void newtab() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//span[text()='Features']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Flights Module']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(ele).click().build().perform();

	}

	@Test
	public void practice() {
		Integer[] a = { 10, 34, 56, 12, 14 };
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(a1, Collections.reverseOrder());

		System.out.println(a1.get(1));

	}

	@Test
	public void newWindow() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//span[text()='Features']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Flights Module']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
		action.keyDown(Keys.SHIFT).moveToElement(ele).click().keyUp(Keys.SHIFT).perform();

	}

	@Test
	public void brokenlinks() throws MalformedURLException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("http://www.zlti.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
		}

	}

	@Test
	public void WindowHandles() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//span[text()='Features']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Flights Module']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
		action.keyDown(Keys.CONTROL).moveToElement(ele).click().keyUp(Keys.CONTROL).perform();
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getCurrentUrl());

	}

	@Test
	public void webTable() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakshmi.bangaru\\eclipse-workspace\\Practice1\\src\\chromedriver.exe");
		driver.get("https://www.oanda.com/currency-converter/en/?from=EUR&to=USD&amount=1");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class=\"MuiTable-root ts8\"]/tbody/tr"));

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> columss = driver
					.findElements(By.xpath("//table[@class=\"MuiTable-root ts8\"]/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= columss.size(); j++) {

				WebElement elements = driver.findElement(
						By.xpath("//table[@class=\"MuiTable-root ts8\"]/tbody/tr[" + i + "]/td[" + j + "]"));
				String words = elements.getText();
				System.out.println(words);

			}

		}

	}

	@Test
	public void compareTwoIndexes() {
		int[] i = { 1, 4, 5, 7 };
		int[] j = { 1, 4, 5, 7 };
		int[] k = { 1, 4, 5, 7 };

		if (Arrays.equals(i, j) == true && Arrays.equals(i, k) == true && Arrays.equals(j, k)) {

			System.out.println(true);
		}

	}

	@Test
	public void compareThreeArrays() {
		Scanner src = new Scanner(System.in);

		int[] a = new int[5];
		int[] b = new int[3];
		int[] c = new int[2];
		for(int m=0;m<=a.length-1;m++)
		{
			System.out.println("Enter number  "+ (m+1) +" is : ");
			a[m] = src.nextInt();
			
		}
		for(int n=0;n<=b.length-1;n++)
		{
			System.out.println("Enter number  "+ (n+1) +" is : ");
			b[n] = src.nextInt();
			
		}
		for(int p=0;p<=c.length-1;p++)
		{
			System.out.println("Enter number  "+ (p+1) +" is : ");
			c[p] = src.nextInt();
			
		}
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			
			for (int j = 0; j <= b.length - 1; j++) {
				b[j] = src.nextInt();
				for (int k = 0; k <= c.length - 1; k++) {
					c[k] = src.nextInt();
					if (a[i] == b[j] && a[i] == c[k] && b[j] == c[k]) {
						a1.add(a[i]);
					}
				}
			}
		}
		Object[] obj = a1.toArray();
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
	}

	@Test
	public void wdspace() {
		String name = " My name is Lakshmi Prasanna ";
		String name1 = name.replaceAll(" ", "");
		System.out.println(name1);
		/*
		 * String nam1=name.trim(); System.out.println(nam1);
		 */
	}
}
