/*

 * Tue Apr 21 13:05:46 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      DurationFieldType.seconds();
      TestPreciseDurationDateTimeField.MockZeroDurationField testPreciseDurationDateTimeField_MockZeroDurationField0 = new TestPreciseDurationDateTimeField.MockZeroDurationField(durationFieldType0);
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.get((-2256L));
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getRangeDurationField();
      Locale locale0 = Locale.FRENCH;
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getMinimumValue((-393L));
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.isLenient();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set(3251L, 857);
  }
}
