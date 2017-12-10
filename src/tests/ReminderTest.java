package tests;

import model.Date;
import model.Reminder;
import model.Time;
import org.junit.Assert;
import org.junit.Test;

public class ReminderTest {

  @Test
  public void testGetNote() {
    Reminder reminder = new Reminder(
        new Date("12", "12", "2017"),
        new Time(8, 0),
        "Shopping"
    );
    reminder.setNote("Buy Milk");

    Assert.assertEquals("Buy Milk", reminder.getNote());
  }

  @Test
  public void testSetNote() {
    Reminder reminder = new Reminder(
        new Date("12", "12", "2017"),
        new Time(8, 0),
        "Shopping"
    );
    reminder.setNote("Buy Milk");
    reminder.setNote("Buy Bread and Milk");

    Assert.assertEquals("Buy Bread and Milk", reminder.getNote());
  }
}
