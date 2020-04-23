/*

 * Tue Apr 21 13:06:53 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      ReadableInstant readableInstant0 = null;
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      gJChronology0.months();
      gJChronology0.hours();
      gJChronology0.secondOfDay();
      gJChronology0.hourOfDay();
      gJChronology0.weekyearOfCentury();
      gJChronology0.weekOfWeekyear();
      MonthDay monthDay0 = new MonthDay();
      MockZone mockZone0 = new MockZone((-123L), (-856), 0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) mockZone0);
      MonthDay monthDay1 = new MonthDay((long) (-856));
      // Undeclared exception!
      copticChronology0.set(monthDay1, (-1118L));
  }
}
