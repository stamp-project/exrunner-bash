/*

 * Mon Apr 20 09:20:43 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".Pfl@xk-@=";
      stringArray0[1] = "`b29Id*!";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("`b29Id*!", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      TimeZone timeZone1 = TimeZone.getDefault();
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser1 = new FastDateParser("`b29Id*!", timeZone1, locale1);
      fastDateParser0.isNextNumber();
      fastDateParser0.adjustYear(2040);
      FastDateParser fastDateParser2 = new FastDateParser(".Pfl@xk-@=", timeZone1, locale1);
      fastDateParser2.adjustYear(63);
      Locale.getDefault();
      FastDateParser fastDateParser3 = new FastDateParser("GMTNET", timeZone0, locale1);
  }
}
