/*

 * Wed Apr 22 19:51:55 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = (-61L);
      int int0 = 0;
      MockZone mockZone0 = new MockZone((-61L), 0, 0);
      mockZone0.hashCode();
      int int1 = 578;
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 578);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 578
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}
