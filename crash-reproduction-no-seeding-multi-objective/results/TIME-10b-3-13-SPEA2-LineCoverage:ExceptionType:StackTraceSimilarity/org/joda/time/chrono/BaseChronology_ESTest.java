/*

 * Tue Apr 21 13:04:06 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      int int0 = 5;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null, 5);
      gregorianChronology0.weekOfWeekyear();
      MonthDay monthDay0 = new MonthDay((-3290L), (Chronology) null);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      islamicChronology0.set(monthDay0, 5);
  }
}
