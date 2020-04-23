/*

 * Mon Apr 20 11:28:48 UTC 2020
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
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      char char0 = '\'';
      frequency0.getCumPct('\'');
      frequency0.getPct('\'');
      int int0 = (-5446);
      frequency0.getCount((-5446));
      frequency0.getPct(0L);
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1913), (-1913), (-5446)).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency1 = new Frequency(comparator0);
      frequency0.getCount((Object) "jt;<keUiC5Zg_[isEF");
      frequency1.getCount((long) (-5446));
      frequency1.addValue(0L);
      frequency1.addValue((-3899));
      frequency0.getCumPct((-5446));
      // Undeclared exception!
      frequency1.addValue((Object) iterator0);
  }
}
