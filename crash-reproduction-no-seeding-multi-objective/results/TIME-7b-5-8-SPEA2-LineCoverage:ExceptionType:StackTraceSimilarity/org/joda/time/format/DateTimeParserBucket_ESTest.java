/*

 * Wed Apr 22 19:44:51 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[5];
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeParserBucket_SavedState0.iZone;
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)dateTimeParserBucket_SavedState0.iZone;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61234);
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(61234, copticChronology0, locale0, (Integer) null, 61234);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.hourOfHalfday();
      DateTimeFieldType.millisOfDay();
      dateTimeParserBucket1.saveField(dateTimeFieldType0, (-2186));
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(true, "v0-2m|t");
  }
}
