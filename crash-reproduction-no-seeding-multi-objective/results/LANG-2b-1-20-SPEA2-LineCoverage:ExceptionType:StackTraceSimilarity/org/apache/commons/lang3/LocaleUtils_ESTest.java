/*

 * Tue Apr 21 07:16:55 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      Locale locale1 = Locale.CANADA;
      LocaleUtils.localeLookupList(locale0, locale1);
      LocaleUtils.localeLookupList(locale1, locale0);
      LocaleUtils.availableLocaleSet();
      String string0 = "";
      LocaleUtils.languagesByCountry("");
      Locale locale2 = Locale.GERMAN;
      Locale locale3 = locale2.stripExtensions();
      LocaleUtils.localeLookupList(locale3);
      Locale locale4 = Locale.SIMPLIFIED_CHINESE;
      LocaleUtils.isAvailableLocale(locale4);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.localeLookupList(locale2, locale4);
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils.availableLocaleList();
      // Undeclared exception!
      LocaleUtils.toLocale("");
  }
}
