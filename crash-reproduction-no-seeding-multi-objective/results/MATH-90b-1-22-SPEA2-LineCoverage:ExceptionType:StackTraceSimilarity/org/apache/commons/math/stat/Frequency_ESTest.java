/*

 * Tue Apr 21 10:32:17 UTC 2020
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
      Long long0 = new Long((-3474L));
      frequency0.getCount((Object) long0);
      char char0 = '|';
      frequency0.getCumPct('|');
      int int0 = (-2846);
      frequency0.addValue((-2846));
      frequency0.getCumFreq('c');
      frequency0.getPct((-2846));
      frequency0.getCumPct(':');
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator0);
      frequency0.getSumFreq();
      // Undeclared exception!
      frequency0.addValue((Object) frequency1);
  }
}
