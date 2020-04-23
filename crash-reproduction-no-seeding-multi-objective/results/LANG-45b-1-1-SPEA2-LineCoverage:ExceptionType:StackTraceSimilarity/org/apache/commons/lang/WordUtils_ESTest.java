/*

 * Tue Apr 21 07:25:53 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WordUtils.wrap("(BsAjtnB}C;", (-1));
      char[] charArray0 = new char[4];
      charArray0[0] = 'r';
      charArray0[1] = 'N';
      charArray0[2] = 'j';
      charArray0[3] = 't';
      WordUtils.capitalizeFully("", charArray0);
      WordUtils.abbreviate("XsvVYJ=K;", (-4112), (-1), ":.fULm");
      WordUtils.initials(":.fULm", charArray0);
      WordUtils.uncapitalize("path.separator");
      // Undeclared exception!
      WordUtils.abbreviate("path.separator", 57, (-1), "path.separator");
  }
}
