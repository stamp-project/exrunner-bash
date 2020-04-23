/*

 * Tue Apr 21 10:32:29 UTC 2020
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
      Comparator<String> comparator0 = null;
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue((Object) "");
      frequency0.getPct(2169L);
      int int0 = 0;
      frequency0.getCount(0);
      Frequency frequency1 = new Frequency();
      frequency1.toString();
      frequency1.valuesIterator();
      frequency0.getCumPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency1.valuesIterator();
      Frequency frequency2 = new Frequency((Comparator) null);
      Frequency frequency3 = new Frequency((Comparator) null);
      frequency1.toString();
      frequency2.getCumFreq(0);
      frequency3.getCumPct((Object) frequency1);
      // Undeclared exception!
      frequency0.addValue(0);
  }
}
