/*

 * Wed Apr 22 19:44:21 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[4];
      DateTimeFieldType.millisOfSecond();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance();
      BuddhistChronology.getInstanceUTC();
      Integer.valueOf(1120);
      Integer integer0 = new Integer(803);
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(74L, gJChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeFieldType0.getRangeDurationType();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "zp)O/BT5sygnH");
  }
}
