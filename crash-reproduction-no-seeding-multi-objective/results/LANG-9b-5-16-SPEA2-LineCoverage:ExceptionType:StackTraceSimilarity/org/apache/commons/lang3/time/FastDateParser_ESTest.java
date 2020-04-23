/*

 * Mon Apr 20 09:36:20 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      String string0 = "";
      String string1 = "";
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      String string2 = "GMTECT";
      FastDateParser fastDateParser0 = new FastDateParser("GMTECT", timeZone0, locale0);
  }
}
