/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 * DATA: Rock Song Class
 */


package by.epam.soundstudio.data;

public class RockSong extends Song {

    private boolean hasSolo;
    private int soloDurationInSeconds;


    public RockSong(boolean hasSolo, int soloDurationInSeconds) {
        this.hasSolo = hasSolo;
        if (hasSolo) {
            this.soloDurationInSeconds = soloDurationInSeconds;
        } else {
            this.soloDurationInSeconds = 0;
        }
    }

    public RockSong(String name, int durationInSeconds, double cost,
                    String country, int establishmentYear, boolean hasSolo, int soloDurationInSeconds) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.hasSolo = hasSolo;
        if (hasSolo) {
            this.soloDurationInSeconds = soloDurationInSeconds;
        } else {
            this.soloDurationInSeconds = 0;
        }
    }

    public boolean isHasSolo() {
        return hasSolo;
    }

    public void setHasSolo(boolean hasSolo) {
        this.hasSolo = hasSolo;
    }

    public int getSoloDuration() {
        return soloDurationInSeconds;
    }

    public void setSoloDuration(int soloDuration) {
        this.soloDurationInSeconds = soloDuration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nRock Song: \n").append("Song title:  ").append(super.getName()).append
                ("\nHas solo?:").append(hasSolo ? " Yes" : " No").append
                (hasSolo ? ("\nSolo duration: " + soloDurationInSeconds / SECONDS_DIVISOR + ":" +
                        super.getDurationInSeconds() % SECONDS_DIVISOR) : "").append("\nDuration: ")
                .append(super.getDurationInSeconds() / SECONDS_DIVISOR).append(":")
                .append(super.getDurationInSeconds() % SECONDS_DIVISOR)
                .append("\nCost: ").append(super.getCost()).append("$").append("\nCountry: ").append
                (super.getCountry()).append("\nYear: ").append(super.getEstablishmentYear());
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return (soloDurationInSeconds / 20 + super.getDurationInSeconds() / SECONDS_DIVISOR *
                super.getEstablishmentYear() % 10);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof RockSong)) {
            return false;
        }
        RockSong rockSong = (RockSong) obj;
        return (rockSong.hasSolo == hasSolo && rockSong.soloDurationInSeconds == soloDurationInSeconds && rockSong.getCost()
                == this.getCost() && rockSong.getCountry().equals(this.getCountry()) &&
                rockSong.getDurationInSeconds() == this.getDurationInSeconds() &&
                rockSong.getEstablishmentYear() == this.getEstablishmentYear() && rockSong.getName()
                .equals(this.getName()));
    }
}
