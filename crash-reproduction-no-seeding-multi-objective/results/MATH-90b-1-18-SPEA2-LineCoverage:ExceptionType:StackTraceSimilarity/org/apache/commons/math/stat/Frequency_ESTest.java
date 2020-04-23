/*

 * Tue Apr 21 10:32:09 UTC 2020
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
      frequency0.getCumPct((-1016));
      frequency0.getCumFreq((-5283));
      frequency0.getCount(1962L);
      frequency0.getPct((-5283));
      frequency0.getCumFreq('n');
      Long long0 = new Long(0L);
      frequency0.addValue((Object) long0);
      frequency0.getPct((long) (-1016));
      frequency0.getPct(0);
      frequency0.getCumFreq(923);
      frequency0.getCumFreq(2942);
      frequency0.getCount((-5283));
      frequency0.getPct(1610612736);
      frequency0.getCount(0L);
      frequency0.getPct((-907L));
      // Undeclared exception!
      frequency0.addValue('n');
  }
}
