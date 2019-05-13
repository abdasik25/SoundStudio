/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.RockSong;

public class SoloRangeSpecification implements Specification<RockSong> {

    private int minSoloDuration;
    private int maxSoloDuration;

    public SoloRangeSpecification(int minSoloDuration, int maxSoloDuration) {
        this.minSoloDuration = minSoloDuration;
        this.maxSoloDuration = maxSoloDuration;
    }

    @Override
    public boolean test(RockSong rockSong) {
        return (rockSong.getSoloDuration() > minSoloDuration && rockSong.getSoloDuration() < maxSoloDuration);
    }
}
