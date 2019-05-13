/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.data.SymphonicSong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;

public class SymphonicSongCreator implements Creator<SymphonicSong> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public SymphonicSong create(List<String> data) {

        String name = data.get(2);
        int durationInSeconds = Integer.parseInt(data.get(3));
        BigDecimal cost = new BigDecimal(data.get(4));
        String country = data.get(5);
        int establishmentYear = Integer.parseInt(data.get(6));
        String compositorName = data.get(7);
        int orchestraAmount = Integer.parseInt(data.get(8));

        SymphonicSong symphonicSong = new SymphonicSong(name,durationInSeconds,cost,country,establishmentYear,
                compositorName, orchestraAmount);

        LOGGER.debug(symphonicSong + " was created");

        return  symphonicSong;
    }
}
