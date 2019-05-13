/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.data.RockSong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;

public class RockSongCreator implements Creator<RockSong> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    //TODO
    public RockSong create(List<String> data) {
        String name = data.get(2);
        int durationInSeconds = Integer.parseInt(data.get(3));
        BigDecimal cost = new BigDecimal(data.get(3));
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
