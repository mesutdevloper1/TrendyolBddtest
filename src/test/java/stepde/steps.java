package stepde;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;

import java.sql.DriverManager;
import java.util.Random;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class steps<CommonSteps> {
    public steps(WebDriver driver, CommonSteps commonSteps){

        this.driver=driver;
        this.commonSteps = commonSteps;
    }
     WebDriver driver;
    private final CommonSteps commonSteps;

    @Given("^(?:I) click browser$")
    public void user_click_link()throws Exception {
        //System.setProperties("webdriver.chrome.driver","chromedriver.exe");
        // driver .get("http://www.trendyol.com");
        driver =new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(250,);
        //driver.findElement(By.xpath("http://www.trendyol.com"));
       // driver.findElement(By.linkText("http://www.trendyol.com"));

        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.trendyol.com");
      throw new io.cucumber.java.PendingException();
    }

    @When("(?:I) see login page")
   // public void user_see_login_page() {
      // @When("^(?:I )?do click (\\w+(?: \\w+)*) and see (\\w+(?: \\w+)*) element$")
       public void buttonControl(String element,String element2) throws Exception {


            try {

                driver.findElement(By.id(element)).click();
                commonSteps.wait(2);
                if(driver.findElement(By.id(element2)).isDisplayed())
                {
                    LOGGER.info("element is displayed");
                }
                else{
                    Assert.fail("element is not displayed");
                }

            } catch (Exception e) {
                LOGGER.info("There is an error in buttonControl function!");
            }
    }

   @When("(?:I) click  login button")
    public void click_button(){
        driver.findElement(By.id("Giriş Yap"));

    }


            @When("^(?:I) see basket$")
            public void keyboardCheck() throws Exception {


                driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/section/section[1]/div[2]/div/div/div[2]/div[2]/a/p[1]")

                if(driver instanceof WebDriver){
                    ((WebDriver) driver).findElement(By.id("SEPET"));
                    LOGGER.info("sepet sayfasındayız");
                }else{
                    throw new Exception();
                }
            }
@Then("^(?:I) verify page number (-?\\d+)$")
    public void pagesearch(int sayı)throws Exception {
int i;
        for (i=0;i<sayı;i++){
            String tab="sub-nav-";
             // 9tane tabı i++ şeklinde gezecek
            driver.findElement(By.id(tab+str(i))).click();

        }
        if(sayı==i){
            LOGGER.info("9 tane başlık  vardır");

        }

    }

    @Then("^(?:I) go random seller page (-?\\d+)$")
    public void random_page(int sayı){
        int i;
        Random r=new Random();
            i=r.nextInt(9);
            String tab="sub-nav-";

            // 9tane tabı i++ şeklinde gezecek
            driver.findElement(By.id(tab+str(i))).click();

        }

    @Then("^(?:I )?control with (\\w+(?: \\w+)*) text in (\\w+(?: \\w+)*) element$")
    public boolean withCharacter(String text, String getElement) {


        driver.getTitle(By.id("KADIN)");

        String assertText = driver.findElement(By.id(getElement)).getText();

        if (assertText.contains(text)) {

            return true;

        } else {

            Assert.fail("Girilen karakterler eşleşmiyor.");
        }
        return false;
    }

@When("^I click (\\w+(?: \\w+)*) element$")
public void click_somthınk(String element) throws Exception{
driver.findElement(By.id(element)).click();
    LOGGER.info("element is tap);

}
}



