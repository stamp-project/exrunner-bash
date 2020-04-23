/*

 * Mon Apr 20 09:31:25 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.LinkedList;
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
      int int0 = 0;
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      TimeZone.getTimeZone((ZoneId) zoneOffset0);
      String string0 = "K{G6 YyOD";
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      locale0.stripExtensions();
      locale0.getDisplayScript();
      FastDateParser fastDateParser0 = new FastDateParser("K{G6 YyOD", timeZone0, locale0);
  }
}
