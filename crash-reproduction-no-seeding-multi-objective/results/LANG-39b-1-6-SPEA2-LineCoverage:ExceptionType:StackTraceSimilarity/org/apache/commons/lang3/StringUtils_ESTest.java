/*

 * Tue Apr 21 06:16:30 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      StringUtils.containsOnly("", "");
      StringUtils.isNotEmpty("");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      String string1 = "bC";
      StringUtils.join((Iterator<?>) listIterator0, "bC");
      StringUtils.isBlank("");
      String string2 = "p";
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "p";
      stringArray0[2] = "";
      // Undeclared exception!
      StringUtils.replaceEach("p", stringArray0, stringArray0);
  }
}
