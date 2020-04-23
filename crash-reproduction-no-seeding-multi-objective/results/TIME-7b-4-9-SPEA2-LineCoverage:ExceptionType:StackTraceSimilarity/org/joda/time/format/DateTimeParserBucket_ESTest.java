/*

 * Wed Apr 22 19:45:10 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      buddhistChronology0.toString();
      Years.years(629);
      Integer integer0 = new Integer(10);
      Integer integer1 = new Integer(10);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Integer integer2 = Integer.valueOf(34);
      Integer.toUnsignedLong(629);
      buddhistChronology0.equals(integer2);
      Period.minutes(10);
      Integer.max(10, 91);
      Locale locale0 = new Locale("BuddhistChronology[UTC]", "", "\": ");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2551440384L, buddhistChronology0, locale0);
      dateTimeParserBucket0.computeMillis(true);
      dateTimeParserBucket0.saveField(dateTimeField0, 629);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }
}
