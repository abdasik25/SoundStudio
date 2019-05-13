/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;

public class DurationRangeSpecification implements Specification<Song> {

    private int minDuration;
    private int maxDuration;

    public DurationRangeSpecification(int minDuration, int maxDuration) {
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
    }

    @Override
    public boolean test(Song song) {
        return (song.getDurationInSeconds() > minDuration && song.getDurationInSeconds() < maxDuration);
    }
}
