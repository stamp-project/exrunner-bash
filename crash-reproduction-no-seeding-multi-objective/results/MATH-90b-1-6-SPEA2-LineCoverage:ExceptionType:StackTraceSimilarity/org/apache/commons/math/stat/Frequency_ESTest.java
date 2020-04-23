/*

 * Tue Apr 21 10:31:50 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer(1390);
      frequency0.addValue(integer0);
      frequency0.getCumPct(1390);
      Frequency frequency1 = new Frequency();
      frequency1.getPct((long) 1390);
      Object object0 = new Object();
      frequency1.getCumFreq(object0);
      frequency1.addValue((Object) integer0);
      frequency0.getCumFreq(1);
      frequency1.clear();
      Frequency frequency2 = new Frequency();
      frequency2.getPct(86L);
      frequency2.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue((Object) frequency1);
  }
}
