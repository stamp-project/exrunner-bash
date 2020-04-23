/*

 * Tue Apr 21 13:01:55 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType.yearOfCentury();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getMaximumTextLength((Locale) null);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getRangeDurationField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getDurationField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getAsText((long) 2, (Locale) null);
      MockZone mockZone0 = new MockZone(2, 2, 2);
      Integer integer0 = new Integer(2);
      mockZone0.getStandardOffset(0L);
      Integer integer1 = new Integer(2);
      mockZone0.isStandardOffset(1165L);
      int int0 = 10000;
      DateTimeZone.setDefault(mockZone0);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.getAsShortText(764L);
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set((-3084L), (-732));
  }
}
