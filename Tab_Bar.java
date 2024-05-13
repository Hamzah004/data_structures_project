import java.util.ArrayList;
import java.util.List;

public class Tab_Bar {
    ArrayList<WebPageRequest> tabs;

    public Tab_Bar() {
        tabs = new ArrayList<>();
    }
    public void NewTab(WebPageRequest page){
        tabs.add(page);
    }
    public WebPageRequest DeleteTab(WebPageRequest page){
        WebPageRequest p=page;
        tabs.remove(page);
        return p;
    }
    public WebPageRequest retainTab(WebPageRequest page){
        WebPageRequest page1=DeleteTab(page);
        tabs.add(page1);
        return page1;
    }
    public List<WebPageRequest> viewTab(){
        return tabs;
    }


}
