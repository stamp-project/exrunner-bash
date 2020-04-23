/*

 * Mon Apr 20 11:29:34 UTC 2020
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
      frequency0.addValue(445);
      Integer integer0 = new Integer((-844));
      frequency0.addValue(integer0);
      frequency0.clear();
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator0);
      frequency0.getCumFreq((-6052L));
      frequency1.addValue(516L);
      Frequency frequency2 = new Frequency();
      Integer integer1 = new Integer(550);
      frequency2.addValue((Object) integer1);
      Object object1 = new Object();
      // Undeclared exception!
      frequency1.addValue(object1);
  }
}
