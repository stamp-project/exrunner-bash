/*

 * Tue Apr 21 06:18:17 UTC 2020
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
      Locale locale0 = Locale.GERMAN;
      LocaleUtils.localeLookupList(locale0, locale0);
      Locale locale1 = Locale.PRC;
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.isAvailableLocale(locale1);
      LocaleUtils.availableLocaleList();
      LocaleUtils.localeLookupList(locale1, locale0);
      LocaleUtils.toLocale((String) null);
      LocaleUtils.isAvailableLocale(locale1);
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.toLocale((String) null);
      LocaleUtils.languagesByCountry("");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.languagesByCountry("Invalid locale format: ");
      LocaleUtils.availableLocaleList();
      LocaleUtils.isAvailableLocale(locale1);
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils.localeLookupList(locale0);
      // Undeclared exception!
      LocaleUtils.toLocale("<iW-N7AkIOc\"+");
  }
}
