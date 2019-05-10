/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 * DATA:  Rap Song Class
 */


package by.epam.soundstudio.data;

public class RapSong extends Song {

    private String beatmaker;
    private String sampleSong;


    public RapSong(String beatmaker, String sampleSong) {
        this.beatmaker = beatmaker;
        this.sampleSong = sampleSong;
    }

    public RapSong(String name, int durationInSeconds, double cost, String country,
                   int establishmentYear, String beatmaker, String sampleSong) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.beatmaker = beatmaker;
        this.sampleSong = sampleSong;
    }

    public String getBeatmaker() {
        return beatmaker;
    }

    public void setBeatmaker(String beatmaker) {
        this.beatmaker = beatmaker;
    }

    public String getSampleSong() {
        return sampleSong;
    }

    public void setSampleSong(String sampleSong) {
        this.sampleSong = sampleSong;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nRap Song: \n").append("Song title:  ").append(super.getName()).append
                ("\nBeatmaker: ").append(beatmaker).append("\nSample song: ").append(sampleSong).append
                ("\nDuration: ").append(super.getDurationInSeconds() / 60)
                .append(":").append(super.getDurationInSeconds() % 60).append("\nCost: ").append
                (super.getCost()).append("$").append("\nCountry: ").append(super.getCountry()).append("\nYear: ").append
                (super.getEstablishmentYear());
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return (super.getDurationInSeconds() / SECONDS_DIVISOR * super.getEstablishmentYear() % 10);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof RapSong)) {
            return false;
        }
        RapSong rapSong = (RapSong) obj;
        return (rapSong.getBeatmaker().equals(this.getBeatmaker()) && rapSong.getSampleSong()
                .equals(this.getSampleSong()) && rapSong.getCost() == this.getCost() &&
                rapSong.getCountry().equals(this.getCountry()) && rapSong.getDurationInSeconds() ==
                this.getDurationInSeconds() && rapSong.getEstablishmentYear() == this.getEstablishmentYear() &&
                rapSong.getName().equals(this.getName()));
    }
}
