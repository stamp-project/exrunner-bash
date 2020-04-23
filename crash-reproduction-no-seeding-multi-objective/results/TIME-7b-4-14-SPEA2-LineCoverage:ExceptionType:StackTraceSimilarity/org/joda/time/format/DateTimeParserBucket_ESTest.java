/*

 * Wed Apr 22 19:46:31 UTC 2020
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
import org.joda.time.Hours;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      Hours hours0 = Hours.FOUR;
      ethiopicChronology0.get((ReadablePeriod) hours0, (long) 1);
      Locale locale0 = null;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1554L), ethiopicChronology0, (Locale) null);
      DateTimeZone.getDefault();
      dateTimeParserBucket0.getOffset();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      BuddhistChronology.getInstanceUTC();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, (Locale) null);
      boolean boolean0 = true;
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "The provider doesn't have any available ids");
  }
}
