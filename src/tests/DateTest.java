package tests;


import static org.junit.Assert.assertEquals;

import model.Date;
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
    assertEquals("03-04-2000", testDate.getShortDate("-"));
    assertEquals("03/04/2000", testDate.getShortDate("/"));
  }

  @Test
  public void testLongShortDate() {
    assertEquals("April 03, 2000", testDate.getLongdate());
  }
}
