import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    void increaseVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(5);
        service.increaseVolume();
        assertEquals(6, service.getCurrentVolume());
    }

    @Test
    void increaseVolume2() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.increaseVolume();
        assertEquals(100, service.getCurrentVolume());
    }

    @Test
    void reduceVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(5);
        service.reduceVolume();
        assertEquals(4, service.getCurrentVolume());
    }

    @Test
    void reduceVolume2() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.reduceVolume();
        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    void nextRadioStation1() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(5);
        service.nextRadioStation();
        assertEquals(6, service.getCurrentRadioStation());
    }

    @Test
    void nextRadioStation2() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(9);
        service.nextRadioStation();
        assertEquals(0, service.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation1() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(5);
        service.prevRadioStation();
        assertEquals(4, service.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation2() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(0);
        service.prevRadioStation();
        assertEquals(9, service.getCurrentRadioStation());
    }

    @Test
    void setRadioStation1() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(5);
        int expected = 5;
        int actual = service.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation2() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation3() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(10);
        int expected = 0;
        int actual = service.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(5);
        int expected = 5;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolume2() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolume3() {
        Radio service = new Radio();
        service.setCurrentVolume(101);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void maxRadioStation() {
        Radio service = new Radio();
        service.setNumberOfRadioStations(10);
        int expected = 9;
        int actual = service.getNumberOfRadioStations();
        assertEquals(expected, actual);
    }

    @Test
    void equals1() {
        Radio radio1 = new Radio(9, 10, 10);
        Radio radio2 = new Radio(radio1.getCurrentRadioStation(), radio1.getCurrentVolume(), radio1.getNumberOfRadioStations());
        assertTrue(radio1.equals(radio2));
    }

    @Test
    void equals2() {
        Radio radio1 = new Radio(9, 10, 10);
        Radio radio2 = new Radio();
        assertFalse(radio1.equals(radio2));
    }

    @Test
    void equals3() {
        Radio radio1 = new Radio(9, 10, 10);
        Object o = null;
        assertFalse(radio1.equals(o));
    }

    @Test
    void equals4() {
        Radio radio1 = new Radio(9, 10, 10);
        Object o = radio1;
        assertTrue(radio1.equals(o));
    }

    @Test
    void equals5() {
        Radio radio1 = new Radio(9, 10, 10);
        Object o = radio1;
        assertSame(radio1, o);
    }

    @Test
    void equals6() {
        Radio radio1 = new Radio(9, 10, 10);
        Radio radio2 = new Radio(radio1.getCurrentRadioStation(), radio1.getCurrentVolume(), radio1.getNumberOfRadioStations());
        assertTrue(radio1.getClass() == radio2.getClass());
    }


    @Test
    void hashCode1() {
        Radio radio1 = new Radio(9, 10, 10);
        Radio radio2 = new Radio(radio1.getCurrentRadioStation(), radio1.getCurrentVolume(), radio1.getNumberOfRadioStations());
        assertTrue(radio1.hashCode() == radio2.hashCode());
    }
}