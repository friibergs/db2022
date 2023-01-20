package se.iths;

import java.util.ArrayList;
import java.util.Collection;

public class Artist {
    private final long id;
    private String name;
    private Collection<Album> albums = new ArrayList<>();

    public Artist(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Album album){
        albums.add(album);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder(String.valueOf(id));
        builder.append(": ");
        builder.append(name);
        builder.append("\nAlbums:\n");
        for(Album album : albums){
            builder.append("\t");
            builder.append(album);
            builder.append("\n");
        }
        return builder.toString();
    }
}
