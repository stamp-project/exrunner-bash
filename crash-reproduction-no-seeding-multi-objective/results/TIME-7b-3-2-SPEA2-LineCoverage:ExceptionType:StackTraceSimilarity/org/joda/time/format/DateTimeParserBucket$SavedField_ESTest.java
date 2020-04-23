/*

 * Wed Apr 22 19:42:56 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      RemainderDateTimeField remainderDateTimeField0 = mock(RemainderDateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(remainderDateTimeField0).getRangeDurationField();
      DateTimeFieldType.hourOfDay();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "is not supported", locale0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(remainderDateTimeField0, 0);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField2 = new DateTimeParserBucket.SavedField(dateTimeField0, (-1));
      // Undeclared exception!
      dateTimeParserBucket_SavedField2.set((-2570L), false);
  }
}
