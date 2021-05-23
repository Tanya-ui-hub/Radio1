package ru.netology.domain;

public class Radio {
    private int currentRadioStation = 1;
    private int minRadioStation = 0;
    private int maxRadioStation;
    private int volume = 100;
    private int minVolume = 0;
    private int maxVolume = 100;

    /**
     * Default constructor.
     */
    public Radio() {
        this.maxRadioStation = 10;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMaxRadioStation() {
        return this.maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == maxVolume) {
            this.volume = volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolume) {
            this.volume = volume;
        }
        if (volume > minVolume) {
            this.volume--;
        }
    }

}


