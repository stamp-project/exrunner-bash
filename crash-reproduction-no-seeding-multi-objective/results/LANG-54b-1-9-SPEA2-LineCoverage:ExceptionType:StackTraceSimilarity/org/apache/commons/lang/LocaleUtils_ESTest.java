/*

 * Tue Apr 21 07:31:34 UTC 2020
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
      Locale locale0 = Locale.UK;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("[)D PUy=0JyIT2&c");
      linkedList0.add("");
      // Undeclared exception!
      LocaleUtils.toLocale("xa_D`|;f");
  }
}
