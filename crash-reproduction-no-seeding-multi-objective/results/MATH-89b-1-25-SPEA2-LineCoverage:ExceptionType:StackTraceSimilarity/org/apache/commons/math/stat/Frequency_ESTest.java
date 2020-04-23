/*

 * Mon Apr 20 11:29:27 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1542L);
      frequency0.getCumPct(1542L);
      frequency0.getPct((Object) "");
      frequency0.getPct((Object) "");
      int int0 = 1;
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      frequency0.getCumFreq((Object) integer0);
      frequency0.getSumFreq();
      frequency0.clear();
      frequency0.getCount(1);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator0);
      frequency0.getCumFreq((Object) "");
      frequency1.getCumPct(1);
      frequency0.getSumFreq();
      Object object0 = new Object();
      // Undeclared exception!
      frequency1.addValue(object0);
  }
}
