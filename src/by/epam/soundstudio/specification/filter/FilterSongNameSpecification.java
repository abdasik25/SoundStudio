/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;

public class FilterSongNameSpecification implements Specification<Song> {

    private String author;

    public FilterSongNameSpecification(String author) {
        this.author = author;
    }

    @Override
    public boolean test(Song song) {
        return (song.getName().equals(author));
    }
}
