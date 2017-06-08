package com.ankit.random;

/**
 * Created by ankitgupta on 5/21/17.
 */
public interface Hockey extends Sports,Event {
    public void homeGoalScored(int goal);
    public void visitingGoalScored(int goal);
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
    public void show();
}
