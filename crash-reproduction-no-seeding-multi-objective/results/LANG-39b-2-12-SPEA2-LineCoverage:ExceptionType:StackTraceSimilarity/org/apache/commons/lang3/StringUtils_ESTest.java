/*

 * Tue Apr 21 06:16:55 UTC 2020
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
      StringUtils.substringBetween("HP-UX", "HP-UX");
      StringUtils.isBlank((CharSequence) null);
      StringUtils.equals(" +<1>xr0@&$y", "\"skm?u\"XMw-lpz");
      StringUtils.countMatches("?g&.}uN", "=RDFG");
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.lastIndexOf("?g&.}uN", "\"skm?u\"XMw-lpz", 0);
      StringUtils.isAlphanumeric("?[W;ixfCLv%MB4^g{\"");
      StringUtils.isAsciiPrintable((String) null);
      StringUtils.contains("Nj", "");
      StringUtils.getLevenshteinDistance("Nj", "?[W;ixfCLv%MB4^g{\"");
      StringUtils.remove((String) null, 'S');
      String[] stringArray0 = new String[6];
      stringArray0[0] = null;
      stringArray0[1] = "=RDFG";
      stringArray0[2] = "?g&.}uN";
      stringArray0[3] = "NoSuchFieldException occurred during 1.6 backcompat code";
      stringArray0[4] = null;
      stringArray0[5] = "HP-UX";
      // Undeclared exception!
      StringUtils.replaceEach("?g&.}uN", stringArray0, stringArray0);
  }
}
