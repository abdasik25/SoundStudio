/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.SymphonicSong;

public class OrchestraRangeSpecification implements Specification<SymphonicSong> {

    private int minOrchestraAmount;
    private int maxOrchestraAmount;

    public OrchestraRangeSpecification(int minOrchestraAmount, int maxOrchestraAmount) {
        this.minOrchestraAmount = minOrchestraAmount;
        this.maxOrchestraAmount = maxOrchestraAmount;
    }


    @Override
    public boolean test(SymphonicSong symphonicSong) {
        return (symphonicSong.getOrchestraAmount() > minOrchestraAmount
                && symphonicSong.getOrchestraAmount() < maxOrchestraAmount);
    }
}
