/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium2go;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Thúy Bắc
 */
public class Selenium2Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testGoogleSearchWithAkeyword();
    }
    public static void testGoogleSearchWithAkeyword(){
        //ta khai báo việc sẽ dùng webdriver để điều khiển trình duyệt
        //~ như khai báo chơi với SQL server 
        String webDriverPath = "chromedriver.exe";
        
        //Nói với máy ảo Java sẽ dùng thằng này để kết nối với trình duyệt
        
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        
        //gọi trình duyệt lên 
        WebDriver myBrowser = new ChromeDriver();
        
        //trình duyệt Chrome lúc này chính là đc trỏ bởi biến myBrowser
        //mình muốn trình duyệt làm gì, mình chấm
        //gọi Google lên
        myBrowser.get("http://google.com");
        
        //mỗi tag trong trình duyệt đc xem là  1 object thuộc class
        //WebElement 
        WebElement keyword = myBrowser.findElement(By.name("q"));
        keyword.sendKeys("ahihi");
        keyword.submit();
    }
    
}
