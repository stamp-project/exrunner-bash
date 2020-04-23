/*

 * Wed Apr 22 19:51:04 UTC 2020
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
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Integer.remainderUnsigned((-4), (-19));
      Integer integer0 = new Integer((-19));
      Integer.getInteger((String) null);
      Integer.divideUnsigned(1023, (-4));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, buddhistChronology0, locale0, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeFieldType0.getRangeDurationType();
      Integer integer1 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 15);
      dateTimeParserBucket0.getChronology();
      Integer integer2 = new Integer((-1629));
      dateTimeParserBucket0.setPivotYear(integer2);
      dateTimeParserBucket0.setZone(fixedDateTimeZone0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }
}
