/*

 * Tue Apr 21 10:31:36 UTC 2020
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
      Frequency frequency0 = new Frequency();
      frequency0.getSumFreq();
      frequency0.getPct(0L);
      frequency0.getCount('~');
      String string0 = "";
      frequency0.addValue((Object) "");
      double double0 = new Long((-1803));
      Comparator<Integer> comparator0 = null;
      Frequency frequency1 = new Frequency((Comparator) null);
      char char0 = 'V';
      frequency0.getCount('V');
      // Undeclared exception!
      frequency0.addValue((long) (-1803));
  }
}
