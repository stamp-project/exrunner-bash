/*

 * Tue Apr 21 07:33:41 UTC 2020
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
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.TAIWAN;
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.availableLocaleSet();
      Locale locale1 = Locale.getDefault();
      locale1.getUnicodeLocaleAttributes();
      Locale locale2 = Locale.ENGLISH;
      locale2.getScript();
      locale2.getDisplayScript(locale1);
      Locale.getISOLanguages();
      String string0 = "+p%:):";
      LocaleUtils.availableLocaleSet();
      LocaleUtils.availableLocaleSet();
      LocaleUtils.availableLocaleSet();
      LocaleUtils.availableLocaleSet();
      Locale.forLanguageTag("sk");
      Locale locale3 = Locale.CHINESE;
      LocaleUtils.isAvailableLocale(locale3);
      // Undeclared exception!
      LocaleUtils.toLocale("cu_Tsf?'?|");
  }
}
