package org.example;

import org.openqa.selenium.By;

public class Computers extends Utils{

    public void verifyDesktopURL(){
        driverWaitUrl("https://demo.nopcommerce.com/computers",5);
    }

    public void clickOnDesktopCategory(String name){
        driverClickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),\""+name+"\")]"));
    }

}
