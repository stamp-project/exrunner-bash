/*

 * Tue Apr 21 07:33:27 UTC 2020
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
      Locale locale0 = LocaleUtils.toLocale("no");
      Locale locale1 = Locale.US;
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.availableLocaleSet();
      // Undeclared exception!
      LocaleUtils.toLocale("oq_U^m?:");
  }
}
