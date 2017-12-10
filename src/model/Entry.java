package model;

public abstract class Entry {

  private Date date;
  private Time time;
  private String label;
  private int intervalOfRepetition;
  private boolean isRepeating;

  public Entry(Date date, Time time, String label) {
    this.date = date;
    this.time = time;
    this.label = label;

  }

  public int getIntervalOfRepetition() {
    return intervalOfRepetition;
  }

  public void setIntervalOfRepetition(int intervalOfRepetition) {
    this.intervalOfRepetition = intervalOfRepetition;
  }

  public boolean isRepeating() {
    return isRepeating;
  }

  public Date getDate() {
    return date;
  }

  public Time getTime() {
    return time;
  }

  public String getLabel() {
    return label;
  }
}
