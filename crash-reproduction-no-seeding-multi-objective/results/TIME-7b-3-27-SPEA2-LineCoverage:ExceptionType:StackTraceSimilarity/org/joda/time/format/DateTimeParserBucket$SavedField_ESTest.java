/*

 * Wed Apr 22 19:50:14 UTC 2020
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
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.years();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(durationField0).when(dateTimeField0).getRangeDurationField();
      String string0 = "K0E}N54E+[&sI?19@";
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "K0E}N54E+[&sI?19@", locale0);
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField1 = buddhistChronology1.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField1, dateTimeFieldType0);
      DateTimeField dateTimeField2 = StrictDateTimeField.getInstance(delegatedDateTimeField0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField2, 2541);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      locale0.getDisplayName();
      boolean boolean0 = false;
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set(1L, false);
  }
}
