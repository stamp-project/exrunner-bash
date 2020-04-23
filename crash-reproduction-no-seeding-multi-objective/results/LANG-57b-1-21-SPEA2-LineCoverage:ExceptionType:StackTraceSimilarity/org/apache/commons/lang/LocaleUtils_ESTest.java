/*

 * Tue Apr 21 06:18:21 UTC 2020
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
      Locale locale0 = Locale.ENGLISH;
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList(locale0, locale0);
      String string0 = "vjW9- bOS-8Y";
      LocaleUtils.languagesByCountry("vjW9- bOS-8Y");
      Locale locale1 = Locale.ROOT;
      LocaleUtils.localeLookupList(locale0, locale1);
      Locale locale2 = Locale.TRADITIONAL_CHINESE;
      LocaleUtils.isAvailableLocale(locale2);
      LocaleUtils.availableLocaleSet();
      // Undeclared exception!
      LocaleUtils.toLocale("vjW9- bOS-8Y");
  }
}
