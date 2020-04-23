/*

 * Mon Apr 20 11:28:40 UTC 2020
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
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-409), (-409), (-295), (-295), (-295)).when(comparator0).compare(anyString() , anyString());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.getPct('\'');
      frequency0.getCumFreq((Object) "|h+Q]I7R{i");
      frequency0.addValue('\'');
      frequency0.addValue((Object) "|h+Q]I7R{i");
      frequency0.addValue((Comparable<?>) "|h+Q]I7R{i");
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }
}
