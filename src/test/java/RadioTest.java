import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void increaseVolume1() {
        Radio service = new Radio();
        int expected = 6;
        int actual = service.increaseVolume(5);
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume2() {
        Radio service = new Radio();
        int expected = 10;
        int actual = service.increaseVolume(10);
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume1() {
        Radio service = new Radio();
        int expected = 4;
        int actual = service.reduceVolume(5);
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume2() {
        Radio service = new Radio();
        int expected = 0;
        int actual = service.reduceVolume(0);
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation1() {
        Radio service = new Radio();
        int expected = 6;
        int actual = service.nextRadioStation(5);
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation2() {
        Radio service = new Radio();
        int expected = 0;
        int actual = service.nextRadioStation(9);
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation1() {
        Radio service = new Radio();
        int expected = 4;
        int actual = service.prevRadioStation(5);
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation2() {
        Radio service = new Radio();
        int expected = 9;
        int actual = service.prevRadioStation(0);
        assertEquals(expected, actual);
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