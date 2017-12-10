package tests;

import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {

  private Time testTime;

  @Before
  public void setup() {
    testTime = new Time(10, 30);
  }

  @Test
  public void testGetTimeInTwelveHourFormatForAM() {
    Assert.assertEquals("10:30 AM", testTime.getTimeInTwelveHourFormat());
  }

  @Test
  public void testGetTimeInTwelveHourFormatDoubleDigit() {
    Time testTime2 = new Time(5, 5);
    Assert.assertEquals("05:05 AM", testTime2.getTimeInTwelveHourFormat());
  }

  @Test
  public void testGetTimeInTwelveHourFormatForPM() {
    Time testTime2 = new Time(22, 30);
    Assert.assertEquals("10:30 PM", testTime2.getTimeInTwelveHourFormat());
  }

  @Test
  public void testGetTimeInTwentyFourHourFormat() {
    Assert.assertEquals("10:30", testTime.getTimeInTwenthyFourHourFormat());
  }
}
