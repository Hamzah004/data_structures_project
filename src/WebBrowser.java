public class WebBrowser {
    private PageRequestQueue pageRequestQueue;
    private HistoryStack historyStack;
    private  ForwardStack forwardStack;
    private BookmarksAndHistory bookmarksAndHistory;
    private Tab_Bar tab_bar;

    public WebBrowser(){
        pageRequestQueue = new PageRequestQueue();
        historyStack = new HistoryStack();
        forwardStack = new ForwardStack();
        bookmarksAndHistory = new BookmarksAndHistory();
        tab_bar = new Tab_Bar();
    }
    public  void loadPage(String url){
        WebPageRequest pageRequest= new WebPageRequest(url);
        pageRequestQueue.addRequest(pageRequest);
        WebPageRequest nextRequest = pageRequestQueue.processNext();
        if(nextRequest != null){
            WebPage page = new WebPage(nextRequest.getUrl(), "content in "+nextRequest.getUrl());
            tab_bar.NewTab(nextRequest);
            System.out.println(nextRequest.getUrl()+" has been added to the Tab_Bar.");
            historyStack.pushPage(page);
            bookmarksAndHistory.addRecentHistory(page);
            System.out.println("page is loaded.");
        }else System.out.println("invalid page request");
    }
    public void navigateBack(){
        if(!historyStack.isEmpty()){
            WebPage currentPage = historyStack.popPage();
            forwardStack.pushPage(currentPage);
        }
        if(!historyStack.isEmpty()){
            WebPage previousPage = historyStack.popPage();
            System.out.println("navigated back to: "+previousPage);
        }
        else System.out.println("History is Empty.");
    }
    public void navigateForward(){
        if(!forwardStack.isEmpty()){
        WebPage nextPage = forwardStack.popPage();

        historyStack.pushPage(nextPage);
        System.out.println("navigated forward to: "+nextPage);
        }
        else System.out.println("Forward History is Empty.");
    }
    public void addBookmark(String url){
        WebPage page = new WebPage(url,"content for "+url);
        bookmarksAndHistory.addBookmark(page);
    }
    public void viewHistory(){
        System.out.println("Recent History: "+bookmarksAndHistory.viewRecentHistory());
    }
    public void viewBookmarks(){
        System.out.println("Bookmarks: "+bookmarksAndHistory.viewBookmarks());
    }

    public void viewTabs(){
        System.out.println("Tabs opened: "+tab_bar.viewTab());
    }


    public WebPageRequest retainPrevWebPage(WebPageRequest p)
    {
         WebPageRequest page=tab_bar.retainTab(p);
        return page;
    }
    public WebPageRequest deleteTab(WebPageRequest p){
        WebPageRequest page = tab_bar.DeleteTab(p);
        return page;
    }

}
