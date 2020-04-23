/*

 * Wed Apr 22 19:42:30 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "efou#HwZ<N~Y";
      Seconds seconds0 = Seconds.THREE;
      seconds0.toStandardDuration();
      Period period0 = new Period();
      int int0 = 1541;
      // Undeclared exception!
      period0.withMonths(1541);
  }
}
