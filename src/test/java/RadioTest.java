import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void increaseVolume1() {
        Radio service = new Radio();
        service.setVolume(5);
        service.increaseVolume();
        assertEquals(6, service.getVolume());
    }

    @Test
    void increaseVolume2() {
        Radio service = new Radio();
        service.setVolume(10);
        service.increaseVolume();
        assertEquals(10, service.getVolume());
    }

    @Test
    void reduceVolume1() {
        Radio service = new Radio();
        service.setVolume(5);
        service.reduceVolume();
        assertEquals(4, service.getVolume());
    }

    @Test
    void reduceVolume2() {
        Radio service = new Radio();
        service.setVolume(0);
        service.reduceVolume();
        assertEquals(0, service.getVolume());
    }

    @Test
    void nextRadioStation1() {
        Radio service = new Radio();
        service.setRadioStation(5);
        service.nextRadioStation();
        assertEquals(6, service.getRadioStation());
    }

    @Test
    void nextRadioStation2() {
        Radio service = new Radio();
        service.setRadioStation(9);
        service.nextRadioStation();
        assertEquals(0, service.getRadioStation());
    }

    @Test
    void prevRadioStation1() {
        Radio service = new Radio();
        service.setRadioStation(5);
        service.prevRadioStation();
        assertEquals(4, service.getRadioStation());
    }

    @Test
    void prevRadioStation2() {
        Radio service = new Radio();
        service.setRadioStation(0);
        service.prevRadioStation();
        assertEquals(9, service.getRadioStation());
    }

    @Test
    void setRadioStation1() {
        Radio service = new Radio();
        service.setRadioStation(5);
        int expected = 5;
        int actual = service.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation2() {
        Radio service = new Radio();
        service.setRadioStation(-1);
        int expected = 0;
        int actual = service.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation3() {
        Radio service = new Radio();
        service.setRadioStation(10);
        int expected = 0;
        int actual = service.getRadioStation();
        assertEquals(expected, actual);
    }
}