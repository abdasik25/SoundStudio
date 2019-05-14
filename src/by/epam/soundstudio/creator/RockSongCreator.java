/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.data.RockSong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class RockSongCreator implements Creator<RockSong> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public RockSong create(List<String> data) {
        String name = data.get(1);
        int durationInSeconds = Integer.parseInt(data.get(2));
        double cost = Double.parseDouble(data.get(3));
        String country = data.get(4);
        int establishmentYear = Integer.parseInt(data.get(5));
        boolean hasSolo = Integer.parseInt(data.get(6)) == 1 ? true : false;
        int soloDurationInSeconds = Integer.parseInt(data.get(7));

        RockSong rockSong = new RockSong(name, durationInSeconds, cost, country, establishmentYear, hasSolo,
                durationInSeconds);

        LOGGER.debug(rockSong + " was created");

        return rockSong;
    }
}
