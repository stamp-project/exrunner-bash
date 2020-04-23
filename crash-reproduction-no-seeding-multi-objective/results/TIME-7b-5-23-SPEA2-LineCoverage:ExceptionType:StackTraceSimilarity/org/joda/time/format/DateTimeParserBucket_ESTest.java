/*

 * Wed Apr 22 19:49:17 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[3];
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Chronology chronology0 = ethiopicChronology0.withUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = zonedChronology0.getZone();
      Minutes minutes0 = Minutes.ZERO;
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      julianChronology0.get((ReadablePeriod) minutes0, 1L);
      Locale locale1 = null;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, zonedChronology0, locale0);
      dateTimeParserBucket0.setZone(dateTimeZone1);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
      Locale locale2 = Locale.ROOT;
      dateTimeParserBucket0.saveField(dateTimeFieldType1, "[h&@ILd", locale0);
      String string0 = "";
      dateTimeParserBucket1.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(true, "'+=VS>N^ka");
  }
}
