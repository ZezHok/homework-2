package ru.stqa.homework.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Yulia on 27.02.2016.
 */
public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(7, 8);

    assert p1.distance(p2) == 2.8284271247461903;
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }
}
