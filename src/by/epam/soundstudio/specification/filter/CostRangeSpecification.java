/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.Specification;

public class CostRangeSpecification implements Specification<Song> {

    private double minCost;
    private double maxCost;

    public CostRangeSpecification(double minCost, double maxCost) {
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    @Override
    public boolean test(Song song) {
        return song.getCost() > minCost && song.getCost() < maxCost;
    }
}
