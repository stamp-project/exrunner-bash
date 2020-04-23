/*

 * Tue Apr 21 13:02:44 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      int[] intArray0 = new int[7];
      testPreciseDateTimeField_MockStandardDateTimeField0.getDifference((-1887), 7L);
      intArray0[5] = (-1887);
      Duration duration0 = Duration.ZERO;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int int0 = 1;
      Integer integer0 = new Integer(2086);
      buddhistChronology0.getZone();
      GJChronology.getInstanceUTC();
      Period.minutes((-1887));
      intArray0[5] = (-1887);
      BuddhistChronology.getInstance();
      Integer integer1 = new Integer(0);
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      buddhistChronology0.minutes();
      Locale locale0 = Locale.CHINESE;
      testPreciseDateTimeField_MockStandardDateTimeField0.getAsText(0L, locale0);
      Integer integer2 = new Integer(0);
      Integer integer3 = new Integer(2086);
      long long0 = (-3087L);
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set(1L, (-1887));
  }
}
