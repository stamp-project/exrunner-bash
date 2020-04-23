/*

 * Tue Apr 21 06:16:51 UTC 2020
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
      Object object0 = new Object();
      StringUtils.capitalize("");
      char char0 = 'q';
      StringUtils.lastIndexOf("Y", 'q');
      StringUtils.substringBeforeLast("The stripAccents(String) method is not supported until Java 1.6", "#Vz,?Wd8D#<hJb");
      String[] stringArray0 = new String[7];
      stringArray0[2] = "Y";
      stringArray0[3] = "1V#";
      stringArray0[4] = "The stripAccents(String) method is not supported until Java 1.6";
      stringArray0[5] = "1V#";
      stringArray0[6] = "#Vz,?Wd8D#<hJb";
      // Undeclared exception!
      StringUtils.replaceEach("1V#", stringArray0, stringArray0);
  }
}
