/**
 * Created by Alexander Lomat on 08.05.19.
 * Version 0.0.1
 * DATA: Symphonic Song Class
 */

package by.epam.soundstudio.data;

import java.math.BigDecimal;

public class SymphonicSong extends Song {

    private String compositorName;
    private int orchestraAmount;


    public SymphonicSong(String compositorName, int orchestraAmount) {
        this.compositorName = compositorName;
        this.orchestraAmount = orchestraAmount;
    }

    public SymphonicSong(String name, int durationInSeconds, BigDecimal cost, String country, int establishmentYear,
                         String compositorName, int orchestraAmount) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.compositorName = compositorName;
        this.orchestraAmount = orchestraAmount;
    }

    public String getCompositorName() {
        return compositorName;
    }

    public void setCompositorName(String compositorName) {
        this.compositorName = compositorName;
    }

    public int getOrchestraAmount() {
        return orchestraAmount;
    }

    public void setOrchestraAmount(int orchestraAmount) {
        this.orchestraAmount = orchestraAmount;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nSymphonic Song: \n").append
                ("Song title:  ").append(super.getName()).append("\nCompositor name: ").append(compositorName).append
                ("\nDuration: ").append(super.getDurationInSeconds() / SECONDS_DIVISOR).append(":")
                .append(super.getDurationInSeconds()  % SECONDS_DIVISOR).append("\nOrchestra amount:")
                .append(orchestraAmount).append("\nCost: ").append(super.getCost()).append("$")
                .append("\nCountry: ").append(super.getCountry()).append("\nYear: ")
                .append(super.getEstablishmentYear());
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return (orchestraAmount / 2 + super.getDurationInSeconds() / SECONDS_DIVISOR *
                super.getEstablishmentYear()) % 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SymphonicSong)) {
            return false;
        }
        SymphonicSong symphonicSong = (SymphonicSong) obj;

        return (symphonicSong.orchestraAmount == orchestraAmount && symphonicSong.compositorName
                .equals(compositorName) && symphonicSong.getCost()
                == this.getCost() && symphonicSong.getCountry().equals(this.getCountry()) &&
                symphonicSong.getDurationInSeconds() == this.getDurationInSeconds()
                && symphonicSong.getEstablishmentYear() == this.getEstablishmentYear() &&
                symphonicSong.getName().equals(this.getName()));
    }


}
