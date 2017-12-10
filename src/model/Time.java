package model;

public class Time {

  private int hours;
  private int minutes;

  private final String AM = "AM";
  private final String PM = "PM";

  public Time(int hours, int minutes) {
    this.hours = hours;
    this.minutes = minutes;
  }

  private String getDoubleDigit(int time) {
    if (time < 10) {
      return "0" + time;
    }
    return Integer.toString(time);
  }

  public String getTimeInTwelveHourFormat() {
    if (hours >= 12) {
      return getDoubleDigit(hours % 12) + ":" + getDoubleDigit(minutes) + " " + PM;
    }

    return getDoubleDigit(hours) + ":" + getDoubleDigit(minutes) + " " + AM;
  }

  public String getTimeInTwenthyFourHourFormat() {  return getDoubleDigit(hours) + ":" + getDoubleDigit(minutes); }
}
