package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {


    @Test
    public void increaseVolume() {
        Radioman radioman = new Radioman(0, 100, 5);
        radioman.increaseVolume();
        assertEquals(6, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.increaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }

    @Test
    public void increaseVolumeMax() {
        Radioman radioman = new Radioman(0, 100, 100);
        radioman.increaseVolume();

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMin() {
        Radioman radioman = new Radioman(0, 100, 0);
        radioman.decreaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }


    @Test
    public void decreaseVolumeMax() {
        Radioman radioman = new Radioman(0, 100, 100);
        radioman.decreaseVolume();

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        Radioman radioman = new Radioman(0, 100, 5);
        radioman.decreaseVolume();

        assertEquals(4, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(50);

        assertEquals(50, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMin() {
        Radioman radioman = new Radioman();

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        Radioman radioman = new Radioman(0, 100, 100);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnder() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOver() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(115);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {
        Radioman radioman = new Radioman(10, 6);
        radioman.nextRadioStation();

        assertEquals(7, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radioman radioman = new Radioman(10, 6);
        radioman.prevRadioStation();

        assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radioman radioman = new Radioman();
        radioman.setCurrentRadioStation(5);
        assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMin() {
        Radioman radioman = new Radioman(10, 0);
        radioman.prevRadioStation();

        assertEquals(10, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMax() {
        Radioman radioman = new Radioman(10, 10);
        radioman.nextRadioStation();

        assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        Radioman radioman = new Radioman(10, 10);
        radioman.nextRadioStation();

        assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {
        Radioman radioman = new Radioman(10, 0);
        radioman.prevRadioStation();

        assertEquals(10, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationUnder() {
        Radioman radioman = new Radioman();
        radioman.setCurrentRadioStation(-1);

        assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationOver() {
        Radioman radioman = new Radioman();
        radioman.setCurrentRadioStation(15);

        assertEquals(10, radioman.getCurrentRadioStation());
    }
}
