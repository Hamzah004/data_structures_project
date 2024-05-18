import java.util.ArrayList;
import java.util.List;

public class Tab_Bar {
    ArrayList<WebPage> tabs;

    public Tab_Bar() {
        tabs = new ArrayList<>();
    }
    public void NewTab(WebPage page){
        tabs.add(page);
    }
    public void DeleteTab(WebPage page){
        tabs.remove(page);
    }
    public List<WebPage> viewTab(){
        return tabs;
    }


}
