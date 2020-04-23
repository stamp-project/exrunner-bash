/*

 * Mon Apr 20 09:20:46 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-3727), ")wCXs9'6]\"aOf&");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getTimeZone("N+C^;UZcZK#");
      ParsePosition parsePosition0 = new ParsePosition((-3727));
      FastDateParser fastDateParser0 = new FastDateParser("GMTNST", timeZone0, locale0);
  }
}
