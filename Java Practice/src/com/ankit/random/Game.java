package com.ankit.random;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class Game implements Hockey {

    String eventName;
    String eventPlace;
    String homeTeam;
    String visitingTeam;
    int homeGoal;
    int visitingGoal;
    int endOfPeriod;

    public String getEventPlace() {
        return eventPlace;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeGoal() {
        return homeGoal;
    }

    public int getVisitingGoal() {
        return visitingGoal;
    }

    public int getEndOfPeriod() {
        return endOfPeriod;
    }

    public boolean isOverTimePeriod() {
        return overTimePeriod;
    }

    boolean overTimePeriod;

    public String getEventName() {
        return eventName;
    }

    @Override
    public void setEventName(String name) {
        this.eventName = name;
    }

    @Override
    public void setEventPlace(String name) {
        this.eventPlace = name;
    }

    @Override
    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        this .visitingTeam = name;
    }

    @Override
    public void homeGoalScored(int goal) {
        this.homeGoal = goal;
    }

    @Override
    public void visitingGoalScored(int goal) {
        this.visitingGoal = goal;
    }

    @Override
    public void endOfPeriod(int period) {
        this.endOfPeriod = period;
    }

    @Override
    public void overtimePeriod(int ot) {

    }

    public static void main(String[] args) {
        Game gm = new Game();
        gm.setEventName("Super Bowl");
        gm.setEventPlace("Levis Stadium");
        gm.setHomeTeam("Golden Warriors");
        gm.setVisitingTeam("Cleveland");
        gm.homeGoalScored(10);
        gm.visitingGoalScored(7);
        gm.endOfPeriod(3);

        System.out.println(gm.getEventName());
        System.out.println(gm.getEventPlace());
        System.out.println(gm.getHomeTeam());
        System.out.println(gm.getVisitingTeam());
        System.out.println(gm.getHomeGoal());
        System.out.println(gm.getVisitingGoal());
        System.out.println(gm.getEndOfPeriod());
    }
}
