package tests;

import model.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTest {

  private Date testDate;

  @Before
  public void setup() {
    testDate = new Date("03","04","2000");
  }

  @Test
  public void testGetShortDate() {
    Assert.assertEquals("03-04-2000", testDate.getShortDate("-"));
    Assert.assertEquals("03/04/2000", testDate.getShortDate("/"));
  }

  @Test
  public void testGetLongDate() {
    Date testDate2 = new Date("13","04","2000");
    Assert.assertEquals("April 13, 2000", testDate2.getLongdate());
  }

  @Test
  public void testGetLongDateRemovesLeadingZeroInDay() {
    Assert.assertEquals("April 3, 2000", testDate.getLongdate());
  }
}
