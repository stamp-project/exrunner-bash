/*

 * Tue Apr 21 13:05:36 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.year();
      LocalDateTime localDateTime0 = new LocalDateTime(1023L);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-956));
      LocalDateTime localDateTime2 = localDateTime0.minusMinutes(2870);
      LocalDateTime localDateTime3 = localDateTime0.withFields(localDateTime1);
      localDateTime3.minusHours(2870);
      // Undeclared exception!
      islamicChronology0.set(localDateTime2, 299L);
  }
}
