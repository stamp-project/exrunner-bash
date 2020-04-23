/*

 * Tue Apr 21 13:02:58 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.TestMutableInterval_Constructors;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("");
      TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
      Chronology chronology0 = testMutableInterval_Constructors_MockInterval0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 5, chronology0);
      int[] intArray0 = new int[9];
      intArray0[0] = 2380;
      Partial partial1 = new Partial(partial0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial1);
  }
}
