package tests;

import java.util.ArrayList;
import java.util.Arrays;
import model.Calendar;
import model.Date;
import model.Entry;
import model.Event;
import model.Meeting;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalendarTest {

  private Calendar calendar;

  @Before
  public void setup() {
    Date date = new Date("10", "12", "2017");
    calendar = new Calendar(date, "foo@mail.com");
  }

  @Test
  public void testAddEntry() {
    Entry entry = new Event(
        new Date("11", "12", "2017"),
        new Time(17, 30),
        "Workout"
    );
    calendar.addEntry(entry);
    Assert.assertEquals(entry.getLabel(), calendar.getRecentEntry());
  }

  @Test
  public void testRemoveEntry() {
    Entry entry = new Event(
        new Date("11", "12", "2017"),
        new Time(17, 30),
        "Workout"
    );
    calendar.addEntry(entry);
    Assert.assertEquals(entry.getLabel(), calendar.getRecentEntry());
    calendar.removeEntry(entry);
    Assert.assertEquals(null, calendar.getRecentEntry());
  }

  @Test
  public void testGetRecentEntry() {
    Entry entry = new Event(
        new Date("11", "12", "2017"),
        new Time(17, 30),
        "Workout"
    );
    Entry entry2 = new Event(
        new Date("11", "12", "2017"),
        new Time(17, 30),
        "Yoga"
    );
    calendar.addEntry(entry);
    calendar.addEntry(entry2);
    Assert.assertEquals(entry2.getLabel(), calendar.getRecentEntry());
  }

  @Test
  public void testGetRecentMeeting() {
    ArrayList<String> attendees =  new ArrayList<>(Arrays.asList("foo@mail.com", "bar@mail.com"));
    Entry entry = new Meeting(
        new Date("11", "12", "2017"),
        new Time(17, 30),
        "Systematic Program Design",
        attendees
    );
    Entry entry2 = new Meeting(
        new Date("12", "12", "2017"),
        new Time(17, 30),
        "Systematic Program Design Retro",
        attendees
    );
    Entry entry3 = new Event(
        new Date("12", "12", "2017"),
        new Time(17, 30),
        "Java webcast"
    );
    calendar.addEntry(entry);
    calendar.addEntry(entry2);
    calendar.addEntry(entry3);
    Assert.assertEquals(entry2.getLabel(), calendar.getRecentMeeting());
  }
}
