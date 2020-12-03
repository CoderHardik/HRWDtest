package com.hackerrank.selenium;

import org.openqa.selenium.WebDriver;

public class OnlineSurvey {

    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));
         Select year=new Select(driver.findElement(By.id("year")));
        month.selectByValue("January");
        day.selectByValue("10");
        year.selectByValue("2020");
    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        
         List<WebElement> language = driver.findElements(By.name("favorite_language"));
        for(int i=0; i<language.size(); i++) {
            String val = language.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Java")){
                language.get(i).click();
                break;
            }
        }

        List<WebElement> os = driver.findElements(By.name("favorite_os"));
        for(int i=0; i<os.size(); i++) {
            String val = os.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Windows")){
                os.get(i).click();
                break;
            }
        }

        List<WebElement> ide = driver.findElements(By.name("favorite_language"));
        for(int i=0; i<ide.size(); i++) {
            String val = ide.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Eclipse IDE")){
                ide.get(i).click();
                break;
            }
        }  
       
    }
}
