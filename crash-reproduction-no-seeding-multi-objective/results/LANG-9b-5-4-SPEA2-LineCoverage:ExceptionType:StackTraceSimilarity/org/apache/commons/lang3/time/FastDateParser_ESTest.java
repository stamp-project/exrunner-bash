/*

 * Mon Apr 20 09:21:23 UTC 2020
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
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Locale locale1 = new Locale("r?6r1k8;Ts)19", "", "oq6]nfD$|W:p|'.");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      locale1.toLanguageTag();
      Locale.setDefault(locale_Category0, locale1);
      Locale locale2 = FastDateParser.JAPANESE_IMPERIAL;
      locale1.getDisplayCountry(locale2);
      Locale.forLanguageTag("r?6r1k8;Ts)19");
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("GMTPRT", timeZone0, locale2);
  }
}
