/*

 * Tue Apr 21 13:04:37 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
      TestPreciseDateTimeField.MockCountingDurationField testPreciseDateTimeField_MockCountingDurationField0 = new TestPreciseDateTimeField.MockCountingDurationField(durationFieldType1, 608);
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, testPreciseDateTimeField_MockCountingDurationField0);
      unsupportedDateTimeField0.getType();
      int int0 = 1073;
      int int1 = (-1);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) unsupportedDateTimeField0, 0, 1073, (-1));
  }
}
