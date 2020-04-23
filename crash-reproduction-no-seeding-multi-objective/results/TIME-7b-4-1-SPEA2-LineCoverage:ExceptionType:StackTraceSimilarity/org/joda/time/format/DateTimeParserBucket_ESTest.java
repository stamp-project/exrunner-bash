/*

 * Wed Apr 22 19:42:57 UTC 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.withDurationAdded((-873L), (-2451));
      Instant instant2 = instant1.withMillis((-2451));
      Instant instant3 = instant2.toInstant();
      DateTime dateTime0 = instant3.toDateTime();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      gJChronology0.getZone();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.getZone();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, gJChronology0, (Locale) null, (Integer) null, 1299);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-386));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "w+");
  }
}
