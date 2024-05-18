public class Main {
    public static void main(String[] args) {
       WebBrowser browser = new WebBrowser();
        browser.loadPage("Web Page1");
        browser.loadPage("Web Page2");
        browser.loadPage("Web Page3");
        browser.viewBookmarks();
        browser.viewHistory();
        browser.viewTabs();
        browser.addBookmark("Web Page1");
        browser.addBookmark("Web Page2");
        browser.viewBookmarks();
        browser.navigateBack();
        browser.navigateForward();
    }
}