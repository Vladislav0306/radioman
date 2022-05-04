import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStations;


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = numberOfRadioStations - 1;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > numberOfRadioStations - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setNumberOfRadioStations(int numberOfRadioStations) {
        int maxRadioStation = numberOfRadioStations - 1;
        this.numberOfRadioStations = maxRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }


    @Override
    public String toString() {
        return "Radio{" +
                "currentRadioStation=" + currentRadioStation +
                ", currentVolume=" + currentVolume +
                ", numberOfRadioStations=" + numberOfRadioStations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Radio radio = (Radio) o;
        return currentRadioStation == radio.currentRadioStation && currentVolume == radio.currentVolume && numberOfRadioStations == radio.numberOfRadioStations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentRadioStation, currentVolume, numberOfRadioStations);
    }
}

