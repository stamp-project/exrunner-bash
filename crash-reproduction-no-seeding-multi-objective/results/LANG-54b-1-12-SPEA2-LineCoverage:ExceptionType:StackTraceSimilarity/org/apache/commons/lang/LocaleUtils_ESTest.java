/*

 * Tue Apr 21 07:31:51 UTC 2020
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
      LocaleUtils.availableLocaleSet();
      Locale locale0 = Locale.FRENCH;
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.availableLocaleList();
      LocaleUtils.availableLocaleSet();
      // Undeclared exception!
      LocaleUtils.toLocale("tc_r=:4n2 {VQ");
  }
}
