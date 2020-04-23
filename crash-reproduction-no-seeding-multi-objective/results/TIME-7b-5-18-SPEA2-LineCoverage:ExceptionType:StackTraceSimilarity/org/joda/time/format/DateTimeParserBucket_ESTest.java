/*

 * Wed Apr 22 19:47:44 UTC 2020
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
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Hours;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Chronology chronology0 = julianChronology0.withUTC();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      julianChronology0.withZone(dateTimeZone1);
      JulianChronology julianChronology1 = JulianChronology.getInstance(dateTimeZone1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      zonedChronology0.getZone();
      Chronology chronology2 = chronology0.withZone(dateTimeZone1);
      Locale locale0 = Locale.getDefault();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, chronology2, locale0);
      Hours hours0 = Hours.MIN_VALUE;
      Locale locale1 = Locale.JAPANESE;
      locale1.getDisplayLanguage();
      julianChronology1.add((ReadablePeriod) hours0, 172799999L, 74);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 74);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }
}
