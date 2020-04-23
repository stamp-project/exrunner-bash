/*

 * Mon Apr 20 11:29:18 UTC 2020
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      String string0 = "e@h9Ak.N6fx ";
      frequency0.getCumPct((Object) "e@h9Ak.N6fx ");
      frequency0.getCumPct((-2919L));
      frequency0.getCumFreq((Object) "e@h9Ak.N6fx ");
      frequency0.getCumFreq((Object) "e@h9Ak.N6fx ");
      frequency0.clear();
      frequency0.addValue((Object) "e@h9Ak.N6fx ");
      int int0 = (-528);
      frequency0.getCumFreq((-528));
      frequency0.valuesIterator();
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }
}
