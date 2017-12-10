package tests;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.Assert;
import org.junit.Test;

public class EventTest {

  @Test
  public void testGetReminder() {
    Reminder reminder = new Reminder(
        new Date("12", "12", "2017"),
        new Time(8, 0),
        "Go shopping"
    );
    Event event = new Event(
        new Date("12", "12", "2017"),
        new Time(18, 0),
        "Dinnery Party"
    );
    event.setReminder(reminder);

    Assert.assertEquals(reminder, event.getReminder());
  }

  @Test
  public void testSetNote() {
    Reminder reminder = new Reminder(
        new Date("12", "12", "2017"),
        new Time(8, 0),
        "Go shopping"
    );
    Reminder reminder2 = new Reminder(
        new Date("10", "12", "2017"),
        new Time(8, 0),
        "Invite people"
    );
    Event event = new Event(
        new Date("12", "12", "2017"),
        new Time(18, 0),
        "Dinnery Party"
    );
    event.setReminder(reminder);
    event.setReminder(reminder2);

    Assert.assertEquals(reminder2, event.getReminder());
  }
}
