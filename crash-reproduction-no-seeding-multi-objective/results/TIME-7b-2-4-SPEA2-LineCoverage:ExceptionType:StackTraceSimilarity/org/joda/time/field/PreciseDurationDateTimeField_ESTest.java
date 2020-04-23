/*

 * Wed Apr 22 19:43:28 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2004318075;
      Locale locale0 = new Locale("5aKHSrdS%ns", "5aKHSrdS%ns");
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.roundHalfCeiling((-341L));
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.addWrapField(26L, (-2731));
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set(1680000L, (-923));
  }
}
