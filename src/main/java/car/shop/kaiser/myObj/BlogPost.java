package car.shop.kaiser.myObj;

public class BlogPost {

    public BlogPost(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public BlogPost() {
    }

    private Long id;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }
}