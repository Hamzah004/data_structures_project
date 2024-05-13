import java.util.ArrayList;
import java.util.List;
public class BookmarksAndHistory {
    private List<WebPage> recentHistory;
    private List<WebPage> bookMarks;

    public BookmarksAndHistory() {
        recentHistory = new ArrayList<>();
        bookMarks = new ArrayList<>();
    }
     public void addBookmark(WebPage page){
        bookMarks.add(page);
    }
 public void addRecentHistory(WebPage page){
        recentHistory.add(page);
    }
    public List<WebPage> viewRecentHistory(){
        return recentHistory;
    }
    public  List<WebPage> viewBookmarks(){
        return bookMarks;
    }
}