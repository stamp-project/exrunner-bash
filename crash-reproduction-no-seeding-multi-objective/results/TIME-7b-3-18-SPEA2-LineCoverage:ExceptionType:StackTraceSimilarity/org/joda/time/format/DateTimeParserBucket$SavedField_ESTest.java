/*

 * Wed Apr 22 19:47:32 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = 0L;
      boolean boolean0 = false;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(chronology0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 0);
      // Undeclared exception!
      dateTimeParserBucket_SavedField0.set((-1L), true);
  }
}
