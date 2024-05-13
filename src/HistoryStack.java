import java.util.Stack;

public class HistoryStack {
    private Stack<WebPage> history;

    public HistoryStack() {
        history = new Stack<>();
    }
    public void pushPage(WebPage page){
    history.push(page);
    }
    public WebPage popPage(){
        return history.isEmpty() ? null : history.pop();
    }
    public boolean isEmpty(){
       return history.isEmpty();
    }
}
