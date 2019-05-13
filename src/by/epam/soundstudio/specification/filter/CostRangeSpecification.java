/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;

import java.math.BigDecimal;

public class CostRangeSpecification implements Specification<Song> {

    private BigDecimal minCost;
    private BigDecimal maxCost;

    public CostRangeSpecification(BigDecimal minCost, BigDecimal maxCost) {
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    @Override
    public boolean test(Song song) {
        return (song.getCost().compareTo(minCost) - song.getCost().compareTo(maxCost) == 0);
    }
}
