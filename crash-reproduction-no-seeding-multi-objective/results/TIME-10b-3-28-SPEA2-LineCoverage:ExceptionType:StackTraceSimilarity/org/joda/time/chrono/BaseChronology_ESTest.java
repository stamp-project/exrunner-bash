/*

 * Tue Apr 21 13:08:54 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      JulianChronology julianChronology0 = new JulianChronology(ethiopicChronology0, ethiopicChronology0, 1);
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone((String) null);
      MonthDay monthDay0 = new MonthDay(0L, (Chronology) julianChronology0);
      MonthDay monthDay1 = monthDay0.withDayOfMonth(1);
      int int0 = 1;
      MonthDay monthDay2 = new MonthDay((long) (-637));
      monthDay0.compareTo((ReadablePartial) monthDay1);
      // Undeclared exception!
      julianChronology0.set(monthDay2, 1L);
  }
}
