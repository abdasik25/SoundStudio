/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.counter;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.repository.SoundStudioRepository;

import java.util.function.Function;

public class TotalDurationCounter implements Function<SoundStudioRepository, Integer> {

    private static final int SECONDS_TO_MINUTES_DIVISOR = 60;

    @Override
    public Integer apply(SoundStudioRepository soundStudioRepository) {
        int result = 0;
        Song[] songs = new Song[]{};
        songs = soundStudioRepository.getSongList().toArray(songs);
        for (int i = 0; i < songs.length; i++) {
            result += songs[i].getDurationInSeconds();
        }
        return result / SECONDS_TO_MINUTES_DIVISOR;
    }
}
