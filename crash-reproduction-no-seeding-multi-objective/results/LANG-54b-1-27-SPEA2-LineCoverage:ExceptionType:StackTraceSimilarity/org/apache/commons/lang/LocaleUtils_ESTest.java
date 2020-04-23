/*

 * Tue Apr 21 07:33:17 UTC 2020
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
      String string0 = "co\\n.\">";
      Locale locale0 = Locale.UK;
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.localeLookupList((Locale) null);
      String string1 = "hu";
      Locale locale1 = Locale.KOREA;
      locale0.clone();
      LocaleUtils.localeLookupList(locale1, (Locale) null);
      Locale locale2 = Locale.GERMANY;
      LocaleUtils.availableLocaleSet();
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.availableLocaleSet();
      Locale locale3 = Locale.UK;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Locale locale4 = null;
      // Undeclared exception!
      LocaleUtils.toLocale("ja_UrO'q>Em.,");
  }
}
