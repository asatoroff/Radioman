package ru.netology.domain;

public class Radioman {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentRadioStation;
    private boolean on;

    public Radioman(int minVolume, int maxVolume, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public Radioman(int maxRadioStation, int currentRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
    }


    public Radioman() {
    }

    public int getMinVolume() {

        return minVolume;
    }

    /*public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    */

    public int getMaxVolume() {
        return maxVolume;
    }

    /*public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
     */

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    /*public int getMinRadioStation() {
        return minRadioStation;
    }
    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
     */

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    /*public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
     */

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;

    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
}