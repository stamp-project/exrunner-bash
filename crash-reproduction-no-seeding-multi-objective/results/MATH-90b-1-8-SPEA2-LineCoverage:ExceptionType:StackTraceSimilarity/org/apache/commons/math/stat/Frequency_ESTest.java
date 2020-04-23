/*

 * Tue Apr 21 10:31:54 UTC 2020
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
      Integer integer0 = new Integer(0);
      frequency0.addValue((Object) integer0);
      frequency0.addValue((Object) integer0);
      frequency0.addValue((Object) integer0);
      frequency0.addValue(3220);
      Integer integer1 = new Integer(0);
      frequency0.addValue(integer1);
      frequency0.getSumFreq();
      char char0 = 'l';
      // Undeclared exception!
      frequency0.addValue('l');
  }
}
