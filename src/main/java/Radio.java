import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public int getRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > numberOfRadioStations - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
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

}
