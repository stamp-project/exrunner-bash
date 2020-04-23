/*

 * Tue Apr 21 06:17:20 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.indexOfAny("9&vk:&", "9&vk:&");
      StringUtils.mid("9&vk:&", 0, 0);
      StringUtils.stripToEmpty(":@x#wpdJF}R%KV7/4");
      StringUtils.trim(";");
      String[] stringArray0 = new String[9];
      stringArray0[0] = ":@x#wpdJF}R%KV7/4";
      stringArray0[1] = "";
      stringArray0[2] = ":@x#wpdJF}R%KV7/4";
      stringArray0[3] = "9&vk:&";
      stringArray0[4] = ":@x#wpdJF}R%KV7/4";
      stringArray0[5] = ";";
      Locale locale0 = Locale.ITALIAN;
      StringUtils.lowerCase(";", locale0);
      Locale.getISOCountries();
      StringUtils.getLevenshteinDistance("fd\"LX2", ";");
      String string0 = "S=Gb[";
      // Undeclared exception!
      StringUtils.replaceEach(";", stringArray0, stringArray0);
  }
}
