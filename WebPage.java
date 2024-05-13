public class WebPage {
    private String url;
    private String content;

    public WebPage(String url, String content) {
        this.url = url;
        this.content = content;
    }
    @Override
    public String toString() {
        return "URL: "+url+"\tcontent: "+content;
    }
}
