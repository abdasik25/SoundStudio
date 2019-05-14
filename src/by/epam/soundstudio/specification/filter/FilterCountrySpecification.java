/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;

public class FilterCountrySpecification implements Specification<Song> {

    private String country;

    public FilterCountrySpecification(String author) {
        this.country = author;
    }

    @Override
    public boolean test(Song song) {
        return (song.getCountry().equals(country));
    }
}
