/*

 * Tue Apr 21 07:34:20 UTC 2020
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
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      LocaleUtils.availableLocaleList();
      Locale locale0 = Locale.CANADA_FRENCH;
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      String string0 = "E{*N69";
      Locale locale1 = Locale.US;
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.isAvailableLocale(locale1);
      // Undeclared exception!
      LocaleUtils.toLocale("ib_*1cMDK89~q");
  }
}
