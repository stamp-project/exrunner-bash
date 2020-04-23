/*

 * Mon Apr 20 11:28:41 UTC 2020
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
      frequency0.getPct('e');
      frequency0.getPct(1857);
      frequency0.addValue(1857);
      frequency0.getPct(1073741824);
      frequency0.getPct(1857);
      Object object0 = new Object();
      frequency0.getCumPct(object0);
      Object object1 = new Object();
      // Undeclared exception!
      frequency0.addValue(object1);
  }
}
