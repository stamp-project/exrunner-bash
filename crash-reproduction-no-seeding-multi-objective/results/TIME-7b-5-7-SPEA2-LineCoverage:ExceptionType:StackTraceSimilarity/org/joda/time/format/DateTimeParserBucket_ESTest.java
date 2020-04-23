/*

 * Wed Apr 22 19:44:33 UTC 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.centuryOfEra();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(fixedDateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      Integer integer0 = new Integer(379);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, (Locale) null, integer0);
      dateTimeParserBucket0.getZone();
      dateTimeParserBucket0.computeMillis();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfMonth();
      Integer integer1 = new Integer((-481));
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-1L), chronology0, (Locale) null, (Integer) null);
      dateTimeParserBucket0.getZone();
      dateTimeParserBucket0.computeMillis();
      DateTimeFieldType.millisOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType1, 0);
      DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "Cannot convert period to duration as ", (Locale) null);
      dateTimeParserBucket1.getOffsetInteger();
      dateTimeParserBucket1.getLocale();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "Cannot convert period to duration as ");
  }
}
