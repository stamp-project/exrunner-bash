/*

 * Tue Apr 21 07:34:39 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      locale0.getDisplayName(locale0);
      locale0.getDisplayName(locale0);
      Locale locale1 = new Locale("fran\u00E7ais (Canada)");
      locale0.stripExtensions();
      Locale locale2 = Locale.JAPAN;
      locale1.getDisplayName(locale2);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      LocaleUtils.toLocale("fr_bGhS\".v9ZsZU");
  }
}
