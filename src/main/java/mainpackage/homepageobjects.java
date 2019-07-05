package mainpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends Basepage{
	

	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="SHWETA2001(//a[text()='Dresses'])[2]")
	public WebElement dresses;
	

	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	public WebElement tshirts;
	
	@FindBy(xpath="//*[@class='navigation_page']")
	
	public WebElement navpage;
	
 @FindBy(xpath="//*[@class='category-name']")
	
	public WebElement navdress;
 
 @FindBy(xpath="(//*[@title='Tops'])[1]")
	
	public WebElement navtshirt;


	public homepageobjects() {
		PageFactory.initElements(driver,this);
	}	
		public WebElement womentab() {
			return women;
		}

		public WebElement Dressestab() {
			return dresses;
			
		}
		public WebElement tshirts() {
			return tshirts;
		}
		
		public WebElement navpage() {
					women.click();
					return navpage;
					}
		public WebElement navdress() {
			dresses.click();
			return navdress;
			}
		public WebElement navshirt() {
			navtshirt.click();
			return navtshirt;
				
			}
			
		}