package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {

    Radioman radioman = new Radioman(0, 100, 50, 0, 10, 5, true);

    @Test
    void shouldAllArgumentsConstructor() {
        Radioman radioman = new Radioman(0, 100, 50, 0, 10, 5,true);
        assertEquals(0, radioman.getMinVolume());
        assertEquals(100, radioman.getMaxVolume());
        assertEquals(50, radioman.getCurrentVolume());
        assertEquals(0, radioman.getMinRadioStation());
        assertEquals(10, radioman.getMaxRadioStation());
        assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void increaseVolume() {
        Radioman radioman = new Radioman();
        radioman.increaseVolume();
        assertEquals(51, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.increaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }

    @Test
    public void increaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.increaseVolume();

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.decreaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }


    @Test
    public void decreaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.decreaseVolume();

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        Radioman radioman = new Radioman();
        radioman.decreaseVolume();

        assertEquals(49, radioman.getCurrentVolume());
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

        assertEquals(50, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        Radioman radioman = new Radioman();

        assertEquals(50, radioman.getCurrentVolume());
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
        Radioman radioman = new Radioman();
        radioman.nextRadioStation();

        assertEquals(6, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radioman radioman = new Radioman();
        radioman.prevRadioStation();

        assertEquals(4, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radioman radioman = new Radioman();
        radioman.setCurrentRadioStation(5);
        assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMin() {
        Radioman radioman = new Radioman();
        radioman.prevRadioStation();

        assertEquals(4, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMax() {
        Radioman radioman = new Radioman();
        radioman.nextRadioStation();

        assertEquals(6, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        Radioman radioman = new Radioman();
        radioman.nextRadioStation();

        assertEquals(6, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {
        Radioman radioman = new Radioman();
        radioman.prevRadioStation();

        assertEquals(4, radioman.getCurrentRadioStation());
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

