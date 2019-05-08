package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.Specification;

public class FilterAuthorSpecification implements Specification<Song> {

    private String author;

    public FilterAuthorSpecification(String author) {
        this.author = author;
    }

    @Override
    public boolean test(Song song) {
       return song.getName().equals(author);
    }
}
