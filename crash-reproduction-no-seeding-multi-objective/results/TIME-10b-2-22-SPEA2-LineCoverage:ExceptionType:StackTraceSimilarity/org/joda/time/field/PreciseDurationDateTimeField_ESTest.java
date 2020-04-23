/*

 * Tue Apr 21 13:06:37 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getDifference(905L, 905L);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.isLeap(0);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.isLenient();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getMaximumValue();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getAsShortText((long) 0);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getType();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set(0L, 59);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set((-4173L), 59);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set((long) 59, 0);
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      testPreciseDateTimeField_MockStandardDateTimeField0.toString();
      testPreciseDateTimeField_MockStandardDateTimeField0.getLeapDurationField();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField1 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set(352L, 999999);
  }
}
