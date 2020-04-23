/*

 * Tue Apr 21 10:31:56 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      int int0 = 0;
      frequency0.getCount(0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.getCumFreq(0);
      frequency0.getCount(0);
      frequency0.getCumPct(0L);
      frequency0.getCumFreq('#');
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }
}
