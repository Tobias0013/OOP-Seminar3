package se.hkr.task2;

import java.io.Serializable;

public class Time implements Serializable {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int second) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = second;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecond(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTimeSum(){
        return ((this.seconds) + (this.minutes * 60) + (this.hours * 3600));
    }

    @Override
    public String toString() {
        return String.format("%s:%02d:%02d", this.hours, this.minutes, this.seconds);
    }

}
