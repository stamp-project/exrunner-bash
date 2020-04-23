/*

 * Tue Apr 21 13:08:29 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Calendar calendar0 = Calendar.getInstance();
      Date date0 = calendar0.getTime();
      date0.clone();
      int int0 = 86399999;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.calculateFirstDayOfYearMillis(2057);
      LocalDateTime localDateTime0 = new LocalDateTime((-611L));
      LocalDateTime localDateTime1 = localDateTime0.withMillisOfDay(2493);
      LocalDateTime localDateTime2 = localDateTime1.plusSeconds(0);
      // Undeclared exception!
      islamicChronology0.set(localDateTime2, 1);
  }
}
