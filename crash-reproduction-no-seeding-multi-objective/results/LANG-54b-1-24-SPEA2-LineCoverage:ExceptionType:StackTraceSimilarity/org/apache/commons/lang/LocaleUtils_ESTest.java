/*

 * Tue Apr 21 07:32:10 UTC 2020
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
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.availableLocaleSet();
      Locale locale1 = Locale.PRC;
      LocaleUtils.localeLookupList(locale1, locale1);
      // Undeclared exception!
      LocaleUtils.toLocale("jg_J4RR~p(43?B_");
  }
}
