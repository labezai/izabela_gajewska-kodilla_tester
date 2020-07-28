package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int size;
    private String stamped;

    public Stamp(String stampName, int size, String  stamped) {
        this.stampName = stampName;
        this.size = size;
        this.stamped = stamped;
    }

    public int getSize() {
        return size;
    }

    public String getStampName() {
        return stampName;
    }

    public String isStamped() {
        return stamped;

    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", size=" + size +
                ", stamped='" + stamped + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return getSize() == stamp.getSize() &&
                Objects.equals(getStampName(), stamp.getStampName()) &&
                Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getSize(), stamped);
    }


}