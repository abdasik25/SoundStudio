package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;

public class FilterAuthorSpecification implements Specification<Song> {

    private String author;

    public FilterAuthorSpecification(String author) {
        this.author = author;
    }

    @Override
    public boolean test(Song song) {
        return (song.getName().equals(author));
    }
}
