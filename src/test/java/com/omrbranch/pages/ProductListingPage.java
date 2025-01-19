package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass1;

public class ProductListingPage extends BaseClass1{
     //click add
	// click variant
	// click go to cart
	
	
	public ProductListingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add'])[1]")
	
	private WebElement productClick;
	
	@FindBy(id="cart-22")
	private WebElement clickAdd;
	
	@FindBy(xpath = "//a[text()=' Go To Cart ']")
	private WebElement clickGotoCart;
	
	@FindBy(xpath="//h5[text()='Search Result - nuts']")
	private WebElement getSearchProduct;
	

	public WebElement getGetSearchProduct() {
		return getSearchProduct;
	}

	public WebElement getProductClick() {
		return productClick;
	}

	public WebElement getClickAdd() {
		return clickAdd;
	}

	public WebElement getClickGotoCart() {
		return clickGotoCart;
	}
	
	public void goToCart() throws InterruptedException {
		elementClick(productClick);
		elementClick(clickAdd);
		
		Thread.sleep(3000);
		elementClick(clickGotoCart);

	}
	
	public String getSearchProductMessage() {
		String elementGetText = elementGetText(getSearchProduct);
		return elementGetText;

	}
	
	
	
	
}
