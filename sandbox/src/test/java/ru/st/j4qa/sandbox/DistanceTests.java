package ru.st.j4qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

        @Test
        public void testDistance()   {
            Point p1 = new Point(69,98);
            Point p2 = new Point(61,92);
            Assert.assertEquals(p1.distance(p2), 10);
        }

}
