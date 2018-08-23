package pl.com.sages.maven.hello;

public class Book2 {
    private String title;
    private int pageCount;

    public Book2(String t, int p)
    {
        title = t;
        pageCount = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


}