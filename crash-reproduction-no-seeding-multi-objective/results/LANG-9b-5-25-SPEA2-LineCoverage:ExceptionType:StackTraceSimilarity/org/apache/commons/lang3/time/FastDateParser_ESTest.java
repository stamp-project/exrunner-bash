/*

 * Mon Apr 20 09:45:39 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      String string0 = "Invalid IOCase name: ";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-664), "\"KN%m23)Y?tnq");
      TimeZone.getDefault();
      String string1 = "Bu<o4wxGHA";
      Locale locale0 = new Locale("]", "]");
      String string2 = "GMTART";
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMTART", simpleTimeZone0, locale1);
  }
}
