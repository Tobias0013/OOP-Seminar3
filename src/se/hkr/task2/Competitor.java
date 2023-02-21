package se.hkr.task2;

import java.io.Serializable;

public class Competitor implements Serializable, Comparable<Competitor> {
    private String name;
    private int age;
    private String gender;
    private Time time;

    public Competitor(String name, int age, String gender, Time time) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.time = time;
    }


    @Override
    public int compareTo(Competitor o) {
        if (this.time.getTimeSum() == o.time.getTimeSum())
            return 0;
        else if (this.time.getTimeSum() > o.time.getTimeSum())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", this.time, this.name);
    }
}
