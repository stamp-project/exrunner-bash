/*

 * Tue Apr 21 06:18:13 UTC 2020
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
      Locale locale0 = Locale.GERMANY;
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry("");
      Locale locale1 = new Locale("");
      LocaleUtils.isAvailableLocale(locale1);
      Locale locale2 = locale0.stripExtensions();
      LocaleUtils.localeLookupList(locale1, locale2);
      // Undeclared exception!
      LocaleUtils.toLocale(".");
  }
}
