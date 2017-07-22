package ru.academitschool.lesson7.tasks.homework.range;

// 7.50
public class Range {
    private double from;
    private double to;
    private double intervalLength;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
        this.intervalLength = to-from;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getIntervalLength() {
        return intervalLength;
    }

    public void setIntervalLength(double intervalLength) {
        this.intervalLength = intervalLength;
    }
}
