/*

 * Mon Apr 20 09:44:37 GMT+00:00 2020
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
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("w,Bm'_e6>w>Ll8", timeZone0, locale0);
      fastDateParser0.isNextNumber();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "w,Bm'_e6>w>Ll8");
      Locale locale1 = Locale.TAIWAN;
      FastDateParser fastDateParser1 = new FastDateParser(">5kHI]W3=x|%", timeZone0, locale0);
      fastDateParser0.isNextNumber();
      StringBuilder stringBuilder1 = new StringBuilder((CharSequence) "w,Bm'_e6>w>Ll8");
      TimeZone.getTimeZone(",");
      Locale locale2 = Locale.CHINESE;
      Locale locale3 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser2 = new FastDateParser("GMTIET", timeZone0, locale3);
  }
}
