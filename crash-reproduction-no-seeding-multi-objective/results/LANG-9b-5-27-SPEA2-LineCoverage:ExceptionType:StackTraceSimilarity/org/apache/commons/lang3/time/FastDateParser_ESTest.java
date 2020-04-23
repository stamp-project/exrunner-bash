/*

 * Mon Apr 20 09:48:25 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.chrono.MinguoChronology;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Invalid pattern";
      int int0 = 234;
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      Clock clock0 = Clock.systemUTC();
      minguoChronology0.dateNow(clock0);
      String string1 = "GMTCTT";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMTCTT", timeZone0, locale0);
  }
}
