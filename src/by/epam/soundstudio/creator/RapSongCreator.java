/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.data.RapSong;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.math.BigDecimal;
import java.util.List;


public class RapSongCreator implements Creator<RapSong> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public RapSong create(List<String> data) {
        String name = data.get(1);
        int durationInSeconds = Integer.parseInt(data.get(2));
        BigDecimal cost = new BigDecimal(data.get(3));
        String country = data.get(4);
        int establishmentYear = Integer.parseInt(data.get(5));
        String beatmaker = data.get(6);
        String sampleSong = data.get(7);

        RapSong rapSong = new RapSong(name, durationInSeconds, cost, country, establishmentYear, beatmaker, sampleSong);

        LOGGER.debug(rapSong + " was created.");

        return rapSong;
    }
}
