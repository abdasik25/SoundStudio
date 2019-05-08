package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.Specification;

public class FilterCountrySpecification implements Specification<Song> {

    private String country;

    public FilterCountrySpecification(String author) {
        this.country = author;
    }

    @Override
    public boolean test(Song song) {
        return song.getCountry().equals(country);
    }
}
