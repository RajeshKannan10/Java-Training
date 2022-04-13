package webAutomate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Amazonsite {
	
	WebDriver driver = null;

	public void broswerlunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void Home() {
		
		List<WebElement> homepage = driver.findElements(By.tagName("a"));
		
		int linkcounts = homepage.size();
		System.out.println("Total links are:"+linkcounts);
		
		for (int i = 0; i < homepage.size(); i++) {
			WebElement element= homepage.get(i);
			String url  = element.getAttribute("href");
			//System.out.println(url);
			if(url == null || url.isEmpty()) {
				System.out.println("URL is Empty");
				continue;
			}
			
			try {
				HttpsURLConnection link =  (HttpsURLConnection) new URL(url).openConnection();
				link.connect();
				if(link.getResponseCode() >= 400) {
					System.out.println(url+"is broken");
				}else {
					System.out.println(url+ " --is valid");
				}
//				List<String> broken = new ArrayList<String>();
//				broken.add(url);
//				for (String brokenlinks : broken) {
//					System.out.println(brokenlinks);
//				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//driver.close();
	}
	
//	public void search() {
//		
//		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
//		searchbar.click();
//		searchbar.sendKeys("Iphone"+Keys.ENTER);
//	}
//	
//	public void searchitems() {
//		
//		List<WebElement> searchresult = driver.findElements(By.xpath
//				("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		
//		System.out.println(searchresult.getClass().getSimpleName());
//		
//		for (WebElement listofElements : searchresult) {
//		String modles = listofElements.getText();
//		System.out.println(modles);
//	}
//		driver.quit();
//	}
	
}


//String list = searchitem.toString();
//String [] modle = new String[searchitem.size()];
//for (int i = 0; i < modle.length; i++) {
//	modle[i] = list;
//	System.out.println(modle[i]);
//}

//String[] modle = ArrayUtils.toArray(list);
//int i =0;
//String [] modles = new String[searchitem.size()];
//for (String phonelist : modle) {
//	modles[i] = phonelist.ge
//	System.out.println(phonelist);
//}
