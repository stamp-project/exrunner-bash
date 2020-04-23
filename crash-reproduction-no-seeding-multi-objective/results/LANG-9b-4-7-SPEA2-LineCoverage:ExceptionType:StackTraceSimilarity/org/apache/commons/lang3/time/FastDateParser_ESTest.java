/*

 * Mon Apr 20 09:26:24 UTC 2020
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
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      locale0.stripExtensions();
      String string0 = "GMTMIT";
      Locale locale1 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("GMTMIT", timeZone0, locale1);
      String string1 = null;
      Locale locale2 = Locale.GERMAN;
      FastDateParser fastDateParser1 = new FastDateParser("GMTMIT", timeZone0, locale1);
      ParsePosition parsePosition0 = null;
      Locale locale3 = Locale.JAPANESE;
      ParsePosition parsePosition1 = new ParsePosition((-2571));
      FastDateParser fastDateParser2 = new FastDateParser("GMTNST", timeZone0, locale0);
  }
}
