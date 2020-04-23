/*

 * Tue Apr 21 07:32:00 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale.forLanguageTag("ms");
      Locale locale0 = Locale.ENGLISH;
      Locale.forLanguageTag("NL");
      Locale.forLanguageTag("g&k@U6hB'arX$fjk%");
      LocaleUtils.isAvailableLocale(locale0);
      Locale locale1 = Locale.ENGLISH;
      Locale locale2 = Locale.forLanguageTag("Invalid locale format: ");
      LocaleUtils.isAvailableLocale(locale1);
      locale0.getDisplayLanguage(locale2);
      // Undeclared exception!
      LocaleUtils.toLocale("ef_H=cG");
  }
}
