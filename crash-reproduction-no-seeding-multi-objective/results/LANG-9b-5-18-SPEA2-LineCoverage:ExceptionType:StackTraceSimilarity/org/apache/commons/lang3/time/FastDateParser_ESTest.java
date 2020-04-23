/*

 * Mon Apr 20 09:38:02 UTC 2020
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "x7(E+0y";
      int int0 = 46;
      ParsePosition parsePosition0 = new ParsePosition(10);
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      locale0.getDisplayLanguage();
      TimeZone timeZone0 = TimeZone.getTimeZone("YB#Dd5xzpgZe1");
      FastDateParser fastDateParser0 = new FastDateParser("GMTCAT", timeZone0, locale0);
  }
}
