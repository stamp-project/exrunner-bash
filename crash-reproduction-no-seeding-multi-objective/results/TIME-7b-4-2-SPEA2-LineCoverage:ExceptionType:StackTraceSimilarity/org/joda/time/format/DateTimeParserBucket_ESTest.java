/*

 * Wed Apr 22 19:43:11 UTC 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(fixedDateTimeZone0, fixedDateTimeZone0).when(chronology0).getZone();
      doReturn(gregorianChronology0, gregorianChronology0).when(chronology0).withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3507L), chronology0, (Locale) null);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-422L), chronology0, (Locale) null, (Integer) null, (-6));
      dateTimeParserBucket1.computeMillis(false, "SD?H\b_=>}");
      dateTimeParserBucket1.getOffset();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Integer.max(0, (-6));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-6));
      buddhistChronology0.get((ReadablePartial) localDateTime1, (-1295L));
      buddhistChronology0.era();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket1.saveField(dateTimeFieldType0, 1808);
      dateTimeParserBucket1.getOffsetInteger();
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(false, ")");
  }
}
