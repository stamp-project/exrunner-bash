/*

 * Tue Apr 21 10:32:16 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
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
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = 2331L;
      Long long1 = new Long(2331L);
      frequency0.addValue((Object) long1);
      Frequency frequency1 = new Frequency();
      Iterator iterator0 = frequency1.valuesIterator();
      frequency0.getCumFreq((Object) iterator0);
      frequency0.toString();
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }
}
