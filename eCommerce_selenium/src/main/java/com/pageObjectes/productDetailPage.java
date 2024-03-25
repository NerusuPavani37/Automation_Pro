package com.pageObjectes;
import java.sql.SQLOutput;
import java.util.*;
import com.actionDriver.Action;
import com.baseClass.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.HashSet;

import static com.baseClass.base.driver;

public class productDetailPage {

    public productDetailPage(){
        PageFactory.initElements(driver,this);
    }
    Action action=new Action();

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCart;

    @FindBy(xpath = "//a[contains(text(),'Go to Cart')]")
    WebElement GoToCartButton;


 String title=driver.getTitle();



 public void productDetails() throws InterruptedException {
     System.out.println(title);

     Thread.sleep(2000);
//     action.click(driver,addToCart);
     addToCart.click();
     Thread.sleep(3000);
//     action.click(driver,GoToCartButton);
     GoToCartButton.click();
 }
}
