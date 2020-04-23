/*

 * Tue Apr 21 06:16:54 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "4w)LBryKsz(>@>I3]";
      StringUtils.substringBetween("", "4w)LBryKsz(>@>I3]");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "u5in ";
      stringArray0[1] = null;
      stringArray0[2] = "4w)LBryKsz(>@>I3]";
      stringArray0[3] = "4w)LBryKsz(>@>I3]";
      stringArray0[4] = "4w)LBryKsz(>@>I3]";
      StringUtils.stripStart("`&D?z8", "$5,j_<U");
      // Undeclared exception!
      StringUtils.replaceEach("u5in ", stringArray0, stringArray0);
  }
}
