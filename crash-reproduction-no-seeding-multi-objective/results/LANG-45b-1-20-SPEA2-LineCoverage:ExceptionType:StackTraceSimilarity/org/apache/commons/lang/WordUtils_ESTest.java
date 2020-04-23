/*

 * Tue Apr 21 07:26:18 UTC 2020
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
      char[] charArray0 = new char[3];
      charArray0[0] = '6';
      char char0 = '|';
      charArray0[1] = '|';
      charArray0[2] = 'S';
      WordUtils.capitalizeFully("MkRsP[", charArray0);
      String string0 = null;
      WordUtils.initials((String) null, charArray0);
      WordUtils.swapCase((String) null);
      WordUtils wordUtils0 = new WordUtils();
      WordUtils wordUtils1 = new WordUtils();
      WordUtils.abbreviate((String) null, (-1), 2, ":h");
      WordUtils.capitalizeFully(":h");
      // Undeclared exception!
      WordUtils.abbreviate("Mkrsp[", 321, (-1), ",hkb,N_fk");
  }
}
