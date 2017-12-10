package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Calendar {

  private Date date;
  private String email;
  private ArrayList<Entry> entries;

  public Calendar(Date date, String email) {
    this.date = date;
    this.email = email;
    this.entries = new ArrayList<>();
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addEntry(Entry entry) {
    entries.add(entry);
  }

  public void removeEntry(Entry entry) {
    entries.remove(entry);
  }

  public String getRecentEntry() {
    int size = entries.size();
    if (size == 0) {
      return null;
    }
    return entries.get(size - 1).getLabel();
  }

  public String getRecentMeeting() {
    ArrayList<Entry> meetings = entries.stream()
        .filter(entry -> entry.getClass() == Meeting.class)
        .collect(Collectors.toCollection(ArrayList::new));

    int size = meetings.size();
    if (size == 0) {
      return null;
    }
    return meetings.get(size - 1).getLabel();
  }
}
