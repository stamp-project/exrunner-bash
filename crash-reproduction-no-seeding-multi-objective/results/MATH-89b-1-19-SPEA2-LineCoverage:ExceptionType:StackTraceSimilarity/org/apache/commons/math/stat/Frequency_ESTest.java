/*

 * Mon Apr 20 11:29:09 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = (-3938L);
      Long long1 = new Long((-3938L));
      frequency0.getPct((Object) long1);
      frequency0.getPct((-3938L));
      frequency0.getCumFreq(10);
      frequency0.getPct(10);
      frequency0.clear();
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }
}
