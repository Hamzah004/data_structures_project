import java.util.LinkedList;
import java.util.Queue;
public class PageRequestQueue {
    private Queue<WebPageRequest> requestQueue;

    public PageRequestQueue() {
        requestQueue = new LinkedList<>();
    }
    public void addRequest(WebPageRequest request){
        requestQueue.add(request);
    }
    public WebPageRequest processNext(){
        return requestQueue.poll();
    }
    public boolean isEmpty(){
        return requestQueue.isEmpty();
    }
}
