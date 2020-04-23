/*

 * Mon Apr 20 09:49:59 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
      TimeZone.getDefault();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      Locale locale1 = Locale.ITALIAN;
      locale0.getDisplayScript(locale1);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      ZoneOffset zoneOffset1 = ZoneOffset.MIN;
      zoneOffset1.getRules();
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset1);
      Locale locale2 = Locale.FRANCE;
      Locale locale3 = Locale.ROOT;
      Locale locale4 = Locale.SIMPLIFIED_CHINESE;
      locale4.getDisplayVariant(locale2);
      Locale locale5 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMT", timeZone0, locale5);
  }
}
