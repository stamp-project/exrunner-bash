/*

 * Wed Apr 22 19:48:35 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      int int0 = 435;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(435);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(julianChronology0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 435);
      boolean boolean0 = true;
      // Undeclared exception!
      dateTimeParserBucket_SavedField0.set(435, true);
  }
}
