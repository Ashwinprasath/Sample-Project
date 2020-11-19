package org.sample;

import java.util.*;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Day1_Task extends LibGlobal {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		openBrowser();

		getUrl("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell inspiron" + Keys.ENTER);

		List l = new LinkedList<String>();
		List<WebElement> products = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(products.size());
		for (WebElement x : products) {
			String a = x.getText();
			System.out.println(a);
			String data = a.substring(0, 18);
			String last = data.toUpperCase();
			l.add(last);
		}
		Set s = new LinkedHashSet<String>();
		s.addAll(l);
		System.out.println(s);
	}
}
