package tests;

import java.util.ArrayList;
import java.util.Arrays;
import model.Date;
import model.Meeting;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MeetingTest {

  Meeting meeting;

  @Before
  public void setup() {
    Date date = new Date("10", "12", "2017");
    Time time = new Time(15, 20);
    ArrayList<String> emails = new ArrayList<>();
    emails.add("foo@mail.com");
    this.meeting = new Meeting(date, time, "testMeeting", emails);
  }


  @Test
  public void testAdd() {
    ArrayList<String> currentAttendees = new ArrayList<>(Arrays.asList("foo@mail.com"));
    Assert.assertEquals(currentAttendees, meeting.getAttendeeEmails());

    meeting.add("bar@mail.com");

    ArrayList<String> expectedAttendees = new ArrayList<>(Arrays.asList("foo@mail.com", "bar@mail.com"));
    Assert.assertEquals(expectedAttendees, meeting.getAttendeeEmails());
  }

  @Test
  public void testRemove() {
    ArrayList<String> currentAttendees = new ArrayList<>(Arrays.asList("foo@mail.com"));
    Assert.assertEquals(currentAttendees, meeting.getAttendeeEmails());

    meeting.remove("foo@mail.com");
    ArrayList<String> expectedAttendees = new ArrayList<>();
    Assert.assertEquals(expectedAttendees, meeting.getAttendeeEmails());
  }

  @Test
  public void testSendInvites() {
    Assert.assertEquals("Inviting: foo@mail.com", meeting.sendInvites());

    meeting.add("bar@mail.com");
    Assert.assertEquals("Inviting: foo@mail.com, bar@mail.com", meeting.sendInvites());
  }
}

