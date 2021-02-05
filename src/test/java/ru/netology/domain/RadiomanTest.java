package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radioman;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {

    @Test
    public void increaseVolume() {

        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(7);
        radioman.increaseVolume();
        int expected = 8;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {

        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(7);
        radioman.decreaseVolume();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMin() {

        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMax() {

        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {

        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(5);
        radioman.nextRadioStation();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {

        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(5);
        radioman.prevRadioStation();
        int expected = 4;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {

        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {

        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentStationOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(13);
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);;
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentVolumeOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(11);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }
}
