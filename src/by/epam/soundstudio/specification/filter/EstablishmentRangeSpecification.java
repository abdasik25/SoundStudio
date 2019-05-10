/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.Specification;

public class EstablishmentRangeSpecification implements Specification<Song> {

    private int minEstablishmentYear;
    private int maxEstablishmentYear;

    public EstablishmentRangeSpecification(int minEstablishmentYear, int maxEstablishmentYear) {
        this.minEstablishmentYear = minEstablishmentYear;
        this.maxEstablishmentYear = maxEstablishmentYear;
    }

    @Override
    public boolean test(Song song) {
        return (song.getEstablishmentYear() > minEstablishmentYear
                && song.getEstablishmentYear() < maxEstablishmentYear);
    }
}
