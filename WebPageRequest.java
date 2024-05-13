public class WebPageRequest {
private String url;

    public WebPageRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    @Override
    public String toString() {
        return "URL: "+url;
    }

}
