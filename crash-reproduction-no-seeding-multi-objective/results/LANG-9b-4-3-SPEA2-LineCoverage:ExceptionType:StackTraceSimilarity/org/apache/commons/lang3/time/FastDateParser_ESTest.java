/*

 * Mon Apr 20 09:21:08 UTC 2020
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
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string0 = "dgx\\\"qdS~ox";
      Locale locale0 = new Locale("", "dgx\"qdS~ox", "(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|");
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", timeZone0, locale1);
  }
}
