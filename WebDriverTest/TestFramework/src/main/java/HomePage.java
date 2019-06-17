public class HomePage {

    static String url = "https://bing.com";
    static String title = "Bing";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
