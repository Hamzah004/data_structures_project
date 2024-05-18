public class WebBrowser {
    private PageRequestQueue pageRequestQueue;
    private HistoryStack historyStack;
    private  ForwardStack forwardStack;
    private BookmarksAndHistory bookmarksAndHistory;

    public WebBrowser(){
        pageRequestQueue = new PageRequestQueue();
        historyStack = new HistoryStack();
        forwardStack = new ForwardStack();
        bookmarksAndHistory = new BookmarksAndHistory();
    }
    public  void loadPage(String url){
        WebPageRequest pageRequest= new WebPageRequest(url);
        pageRequestQueue.addRequest(pageRequest);
        WebPageRequest nextRequest = pageRequestQueue.processNext();
        if(nextRequest != null){
            WebPage page = new WebPage(nextRequest.getUrl(), "content in "+nextRequest.getUrl());
            historyStack.pushPage(page);
            bookmarksAndHistory.addRecentHistory(page);
            System.out.println(page.getUrl()+" is loaded.");
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




}
