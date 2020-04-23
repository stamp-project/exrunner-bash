/*

 * Mon Apr 20 09:38:46 GMT+00:00 2020
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
      String string0 = "FastDateZarser[";
      String string1 = "gO+";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1626), "gO+");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      SimpleTimeZone simpleTimeZone1 = new SimpleTimeZone((-1626), "Js6");
      Locale locale1 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", simpleTimeZone1, locale0);
  }
}
