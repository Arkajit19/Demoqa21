package Demoqa43.executor;

import Demoqa43.pages.Siteactions;

public class Base {

    public static void main(String[] args) {

        Siteactions stact2=new Siteactions();
        Browser browser=new Browser();
        browser.init("chrome");
        browser.navigateto("https://demoqa.com/alerts");
        stact2.ClickButtontoseealert();

    }
}
