package Testpackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import mainpackage.Basepage;
import mainpackage.homepageobjects;

public class homepagetest  {
	

	homepageobjects homepage;
	Basepage bp;
	
	public homepagetest() {
		homepage =  new homepageobjects();		
		bp= new Basepage();
		}
	

		
		@Test
		public void verifyWomenTest() {
		Assert.assertTrue(homepage.womentab().isDisplayed());
		}
		
		@Test
		public void verifydressesTest() {
			Assert.assertTrue(homepage.Dressestab().isDisplayed());
		}
		
		@Test
		
		public void verifytShirtsTest() {
			Assert.assertTrue(homepage.tshirts().isDisplayed());
			
			
		
}	
		@Test
	public void verifynavpage() {
			Assert.assertEquals(homepage.navpage,homepage.navpage);
			
		}
			@Test
			public void verifynavdress() {
					Assert.assertEquals(homepage.navdress,homepage.dresses);
			
	}	
			@Test
			public void verifynavtshirt() {
					Assert.assertEquals(homepage.navtshirt,homepage.tshirts);
			
	}	
}
		
		












