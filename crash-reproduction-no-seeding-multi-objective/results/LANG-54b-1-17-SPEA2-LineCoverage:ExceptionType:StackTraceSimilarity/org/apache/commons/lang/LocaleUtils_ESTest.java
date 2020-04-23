/*

 * Tue Apr 21 07:32:02 UTC 2020
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
      Locale locale0 = LocaleUtils.toLocale("nu");
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.countriesByLanguage("xB^3d'");
      String string0 = "zsOw0TRU~BWZ";
      Locale locale1 = LocaleUtils.toLocale("nu");
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.localeLookupList(locale1, locale1);
      LocaleUtils.countriesByLanguage("xB^3d'");
      // Undeclared exception!
      LocaleUtils.toLocale("ab_;8gF");
  }
}
