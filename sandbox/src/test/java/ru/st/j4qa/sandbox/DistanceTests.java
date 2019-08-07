package ru.st.j4qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

        @Test
        public void testDistance()   {
            TwoPoints tp = new TwoPoints(69,98,61,92);
            Assert.assertEquals(tp.distance(), 10);
        }

}
