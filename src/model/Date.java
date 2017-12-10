package model;

import java.util.Arrays;
import java.util.List;

public class Date {
  private String day;
  private String year;
  private String month;
  private List months = Arrays.asList("January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December");

  public Date(String day, String month, String year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getShortDate(String delimeter) {
    return day + delimeter + month + delimeter + year;
  }

  public String getLongdate() {
    int monthIndex = Integer.valueOf(month) - 1;
    String zeroRemovedDay = day.charAt(0) == '0' ? String.valueOf(day.charAt(1)) : day;
    return months.get(monthIndex) + " " + zeroRemovedDay + ", " + year;
  }
}
