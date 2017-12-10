package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Meeting extends Event {

 private ArrayList<String> attendeeEmails;

  public Meeting(Date date, Time time, String label, ArrayList<String> attendeeEmails) {
    super(date, time, label);
    this.attendeeEmails = attendeeEmails;
  }

  public ArrayList getAttendeeEmails() {
    return attendeeEmails;
  }

  public void add(String email) {
    attendeeEmails.add(email);
  }

  public void remove(String email) {
    attendeeEmails.remove(email);
  }

  public String sendInvites() {
    String invite = "Inviting: ";
    String emails = attendeeEmails.stream().collect(Collectors.joining(", "));
    System.out.println(invite + emails);
    return invite + emails;
  }
}
