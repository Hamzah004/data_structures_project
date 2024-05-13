import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebPageRequest p = new WebPageRequest("google.com");
        WebBrowser browser = new WebBrowser();
        browser.loadPage("webPage1");
        browser.loadPage("webPage2");
        browser.loadPage(p.getUrl());
        browser.navigateBack();
        browser.navigateForward();
        browser.addBookmark("webPage1");
        browser.viewHistory();
        browser.viewBookmarks();
        browser.viewTabs();
        browser.deleteTab(p);
        browser.viewTabs();
        browser.retainPrevWebPage(p);
        browser.viewTabs();
   }
}