package aDmin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh M\\Downloads\\chromedriver\\chromedriver-win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 
		 try {
			 
			// Maximize the window
	            driver.manage().window().maximize();

	            // Set implicit wait
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
	            driver.get("https://mdfrontend.jierp.in/admin/login");
	   		 
	   		 System.out.println("Page Title: " + driver.getTitle());
	            
	   		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div/div[5]/div/div/div/div/button"));  // Adjust locator
            loginButton.click();
            
	            Thread.sleep(5000); // Wait for 5 seconds
	            
	            WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"email_help\"]/div"));
	            
	         // Print the error message to console
	            System.out.println("Error Message: " + errorMessage.getText());

	            // Verify if the expected error message appears
	            if (errorMessage.getText().contains("Please enter your email.")) {
	                System.out.println("Test 1 Passed: Error message displayed correctly.");
	            } else {
	                System.out.println("Test 1 Failed: Unexpected error message.");
	            }
	            
	            Thread.sleep(7000);
	            
	            WebElement errorMessage2 = driver.findElement(By.xpath("//*[@id=\"password_help\"]/div"));
	            
		         // Print the error message to console
		            System.out.println("Error Message2: " + errorMessage2.getText());

		            // Verify if the expected error message appears
		            if (errorMessage2.getText().contains("Please enter Password")) {
		                System.out.println("Test 2 Passed: Error message displayed correctly.");
		            } else {
		                System.out.println("Test 2 Failed: Unexpected error message.");
		            }
		            
		            driver.navigate().refresh();
		            
		            Thread.sleep(7000);
		            
		            WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));  // Adjust the locator as per the website
		            emailField.sendKeys("dongmail.com");
		            
		            // Find the password input field and enter password
		            WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));  // Adjust the locator
		            passwordField.sendKeys("12345");

		            WebElement loginButton2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div/div[5]/div/div/div/div/button"));  // Adjust locator
		            loginButton2.click();
		            
		            WebElement errorMessage3 = driver.findElement(By.xpath("//*[@id=\"email_help\"]/div"));
		            
			         // Print the error message to console
			            System.out.println("Error Message3: " + errorMessage3.getText());

			            // Verify if the expected error message appears
			            if (errorMessage3.getText().contains("Please enter a valid email address")) {
			                System.out.println("Test 3 Passed: Error message displayed correctly.");
			            } else {
			                System.out.println("Test 3 Failed: Unexpected error message.");
			            }
			            
			            driver.navigate().refresh();
			            
			            WebElement emailField1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));  // Adjust the locator as per the website
			            emailField1.sendKeys("admin@gmail.com");
			            
			            // Find the password input field and enter password
			            WebElement passwordField1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));  // Adjust the locator
			            passwordField1.sendKeys("12345");

			            WebElement loginButton3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div/div[5]/div/div/div/div/button"));  // Adjust locator
			            loginButton3.click();
			            
			            WebElement errorMessage4 = driver.findElement(By.xpath("//*[@id=\"password_help\"]/div"));
			            
				         // Print the error message to console
				            System.out.println("Error Message4: " + errorMessage4.getText());

				            // Verify if the expected error message appears
				            if (errorMessage4.getText().contains("Invalid password")) {
				                System.out.println("Test 4 Passed: Error message displayed correctly.");
				            } else {
				                System.out.println("Test 4 Failed: Unexpected error message.");
				            }
				            
				            driver.navigate().refresh();
				            
				            WebElement emailField2 = driver.findElement(By.xpath("//*[@id=\"email\"]"));  // Adjust the locator as per the website
				            emailField2.sendKeys("ad@gmail.com");
				            
				            // Find the password input field and enter password
				            WebElement passwordField2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));  // Adjust the locator
				            passwordField2.sendKeys("admin12");

				            WebElement loginButton4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div/div[5]/div/div/div/div/button"));  // Adjust locator
				            loginButton4.click();
				            
				            WebElement errorMessage5 = driver.findElement(By.xpath("//*[@id=\"email_help\"]/div"));
				            
					         // Print the error message to console
					            System.out.println("Error Message5: " + errorMessage5.getText());

					            // Verify if the expected error message appears
					            if (errorMessage5.getText().contains("user not found")) {
					                System.out.println("Test 5 Passed: Error message displayed correctly.");
					            } else {
					                System.out.println("Test 5 Failed: Unexpected error message.");
					            }
					            
					            driver.navigate().refresh();
					            
					            
					            WebElement emailField3 = driver.findElement(By.xpath("//*[@id=\"email\"]"));  // Adjust the locator as per the website
					            emailField3.sendKeys("admin@gmail.com");
					            
					            // Find the password input field and enter password
					            WebElement passwordField3 = driver.findElement(By.xpath("//*[@id=\"password\"]"));  // Adjust the locator
					            passwordField3.sendKeys("admin123");

					            WebElement loginButton5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div/div[5]/div/div/div/div/button"));  // Adjust locator
					            loginButton5.click();
			            
		            
					         // Wait for login confirmation (replace with WebDriverWait if needed)
					            Thread.sleep(7000);

					            // Find the success message or dashboard element
					            WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"PING_IFRAME_FORM_DETECTION\"]"));  // Adjust locator
					            System.out.println("Message: " + successMessage.getText());

					            // Verify if login was successful
					            if (successMessage.getText().contains("Login Successfully")) {
					                System.out.println("✅ Test Passed: Login was successful!");
					            } else {
					                System.out.println("❌ Test Failed: Login success message not found.");
					            }

					            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        // driver.quit();
	

	}

}
