/*

 * Wed Apr 22 19:51:24 UTC 2020
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-6), (-6));
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      iSOChronology0.toString();
      ISOChronology.getInstance(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.centuryOfEra();
      Integer integer0 = new Integer((-544));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-6), iSOChronology0, (Locale) null, integer0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-1291));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "oq!!T");
  }
}
