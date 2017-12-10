package main;

import java.util.ArrayList;
import java.util.Arrays;
import model.Calendar;
import model.Date;
import model.Entry;
import model.Event;
import model.Meeting;
import model.Reminder;
import model.Time;

public class Main {

  public static void main(String[] args) {
    Calendar calendar = new Calendar(
        new Date("11", "12", "2017"),
        "peckles@mycal.com"
    );

    Event entry1 = new Event(
        new Date("12", "12", "2017"),
        new Time(8, 0),
        "Cleaner"
    );

    Entry entry2 = new Event(
        new Date("15", "12", "2017"),
        new Time(18, 0),
        "Star Wars Movie"
    );
    Meeting entry3 = new Meeting(
        new Date("12", "12", "2017"),
        new Time(18, 0),
        "Holodeck",
        new ArrayList<>(Arrays.asList("peckles@mycal.com", "seven_of_nine@mycal.com"))
    );
    Entry entry4 = new Event(
        new Date("18", "12", "2017"),
        new Time(07, 0),
        "Workout"
    );

    Reminder entry1Reminder = new Reminder(
        new Date("12", "12", "2017"),
        new Time(7, 30),
        "Cleaner is coming in 30 minutes"
    );
    entry1Reminder.setNote("Find apartment key");
    entry1.setReminder(entry1Reminder);

    System.out.println(entry1.getReminder().getLabel() + " " + entry1Reminder.getNote());

    entry2.setIntervalOfRepetition(2);

    System.out.println("entry2 repetition: " + entry2.getIntervalOfRepetition());

    calendar.addEntry(entry1);
    calendar.addEntry(entry2);
    calendar.addEntry(entry3);
    calendar.addEntry(entry4);

    entry3.sendInvites();

    System.out.println("Recent Meeting " + calendar.getRecentMeeting());
    System.out.println("Recent Entry " + calendar.getRecentEntry());


  }
}
