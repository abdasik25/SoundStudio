/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.counter;

import by.epam.soundstudio.data.Song;

import java.util.function.Function;

public class TotalDurationCounter implements Function <Song, Integer> {

    private static final int SECONDS_DIVISOR = 60;

    @Override
    public Integer apply(Song song) {
        return song.getDurationInSeconds() / SECONDS_DIVISOR;
    }
}
