import java.util.Stack;

public class ForwardStack {
    private Stack<WebPage> forwardHistory;

    public ForwardStack() {
        forwardHistory = new Stack<>();
    }
    public void pushPage(WebPage page){
        forwardHistory.push(page);
    }
    public WebPage popPage(){
        return forwardHistory.isEmpty() ? null : forwardHistory.pop();
    }
    public boolean isEmpty(){
        return forwardHistory.isEmpty();
    }
}
