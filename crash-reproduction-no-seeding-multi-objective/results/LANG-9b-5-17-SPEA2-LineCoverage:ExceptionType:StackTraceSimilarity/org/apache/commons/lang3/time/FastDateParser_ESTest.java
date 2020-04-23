/*

 * Mon Apr 20 09:37:48 UTC 2020
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
      String string0 = "Invalid field value ";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      locale0.stripExtensions();
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("-3", timeZone0, locale1);
      fastDateParser0.hashCode();
      TimeZone.getDefault();
      Locale locale2 = Locale.ITALY;
      locale2.stripExtensions();
      Locale locale3 = FastDateParser.JAPANESE_IMPERIAL;
      String string1 = "GMT";
      FastDateParser fastDateParser1 = new FastDateParser("GMT", timeZone0, locale3);
  }
}
