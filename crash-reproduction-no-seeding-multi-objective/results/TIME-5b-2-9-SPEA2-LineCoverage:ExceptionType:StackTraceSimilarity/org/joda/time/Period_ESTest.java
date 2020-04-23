/*

 * Wed Apr 22 19:39:45 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = null;
      LocalTime localTime0 = new LocalTime((Chronology) null);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-1742));
  }
}
