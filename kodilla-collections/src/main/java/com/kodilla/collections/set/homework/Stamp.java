package com.kodilla.collections.set.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double widthStamp;
    private double heightStamp;
    private String stampStamp;

    public Stamp(String stampName, double widthStamp, double heightStamp, String stampStamp) {
        this.stampName = stampName;
        this.widthStamp = widthStamp;
        this.heightStamp = heightStamp;
        this.stampStamp = stampStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getWidthStamp() {
        return widthStamp;
    }

    public double getHeightStamp() {
        return heightStamp;
    }

    public String getStampStamp() {
        return stampStamp;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", widthStamp=" + widthStamp +
                ", heightStamp=" + heightStamp +
                ", stampStamp='" + stampStamp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.widthStamp, widthStamp) == 0 &&
                Double.compare(stamp.heightStamp, heightStamp) == 0 &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampStamp, stamp.stampStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, widthStamp, heightStamp, stampStamp);
    }
}
