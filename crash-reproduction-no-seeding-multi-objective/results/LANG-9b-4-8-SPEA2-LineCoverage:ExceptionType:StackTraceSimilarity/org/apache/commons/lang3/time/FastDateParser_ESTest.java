/*

 * Mon Apr 20 09:27:34 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.Category locale_Category1 = Locale.Category.DISPLAY;
      Locale locale0 = Locale.getDefault(locale_Category1);
      int int0 = 8;
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(8, "T");
      FastDateParser fastDateParser0 = new FastDateParser("GMTART", simpleTimeZone0, locale0);
  }
}
