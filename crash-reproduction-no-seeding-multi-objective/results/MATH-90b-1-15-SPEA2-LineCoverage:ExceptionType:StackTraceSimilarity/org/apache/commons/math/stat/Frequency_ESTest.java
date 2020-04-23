/*

 * Tue Apr 21 10:32:07 UTC 2020
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
      Object object0 = new Object();
      frequency0.getCount(object0);
      frequency0.addValue(445L);
      frequency0.toString();
      frequency0.getCount(object0);
      frequency0.getPct(0);
      frequency0.getCumPct(445L);
      Frequency frequency1 = new Frequency();
      frequency1.clear();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency2 = new Frequency(comparator0);
      frequency1.getCount('n');
      Object object1 = new Object();
      frequency2.getCumPct(object1);
      frequency1.getCount(1L);
      frequency2.getPct(0L);
      Object object2 = new Object();
      // Undeclared exception!
      frequency1.addValue(object2);
  }
}
