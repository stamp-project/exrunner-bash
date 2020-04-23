/*

 * Mon Apr 20 11:28:56 UTC 2020
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
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2641).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.getPct('!');
      frequency0.addValue(comparable0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator1).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator1);
      frequency1.getCumPct('B');
      frequency1.addValue('B');
      frequency0.clear();
      frequency1.clear();
      Object object0 = new Object();
      // Undeclared exception!
      frequency1.addValue(object0);
  }
}
