package se.iths;

public class Album {
    private final long id;
    private String title;

    public Album(long id, String title){
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return String.format("%d %s", id, title);
    }
}