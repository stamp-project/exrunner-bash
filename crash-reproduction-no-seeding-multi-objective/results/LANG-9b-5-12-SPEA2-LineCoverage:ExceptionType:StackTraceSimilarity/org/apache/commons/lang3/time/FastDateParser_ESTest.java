/*

 * Mon Apr 20 09:31:49 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1578)).when(timeZone0).getOffset(anyLong());
      doReturn(14).when(timeZone0).getRawOffset();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "b";
      stringArray0[1] = "b";
      stringArray0[2] = "b";
      stringArray0[3] = "b";
      stringArray0[4] = "b";
      stringArray0[5] = "b";
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      Locale locale1 = Locale.UK;
      locale0.getDisplayScript();
      Locale.setDefault(locale1);
      locale0.clone();
      FastDateParser fastDateParser0 = new FastDateParser("GMTIST", timeZone0, locale0);
  }
}
