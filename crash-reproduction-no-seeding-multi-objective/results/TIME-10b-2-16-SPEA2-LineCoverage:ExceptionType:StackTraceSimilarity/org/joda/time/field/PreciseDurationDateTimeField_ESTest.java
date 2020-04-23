/*

 * Tue Apr 21 13:04:45 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType.weekyearOfCentury();
      BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DurationField durationField0 = testBaseDateTimeField_MockStandardBaseDateTimeField0.getDurationField();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField(dateTimeFieldType0, durationField0);
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.getMaximumValueForSet((-2335L), 2147483051);
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.getRangeDurationField();
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.getAsShortText((-2335L));
      dateTimeFieldType0.getRangeDurationType();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set((-2335L), 2147483051);
  }
}
