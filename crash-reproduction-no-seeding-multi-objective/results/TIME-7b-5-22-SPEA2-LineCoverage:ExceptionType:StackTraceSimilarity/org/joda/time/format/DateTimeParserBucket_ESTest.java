/*

 * Wed Apr 22 19:49:06 UTC 2020
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
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2806L), buddhistChronology0, locale0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      dateTimeZone0.getShortName(31557600000L, locale0);
      dateTimeParserBucket0.computeMillis(true, "+00:00");
      Integer integer0 = new Integer(1048);
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = new Integer(1048);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 4160);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer2 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket0.setPivotYear((Integer) null);
      Locale locale1 = Locale.FRANCE;
      JulianChronology.getInstance();
      Locale locale2 = new Locale("+00:00", "Year is too small: ");
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }
}
