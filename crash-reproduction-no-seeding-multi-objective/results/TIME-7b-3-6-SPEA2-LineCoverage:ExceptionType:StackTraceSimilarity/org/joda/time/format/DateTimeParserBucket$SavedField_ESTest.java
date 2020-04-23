/*

 * Wed Apr 22 19:44:06 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.MockPartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology0 = mockPartial0.getChronology();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, dateTimeField0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(skipDateTimeField0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(skipDateTimeField0, (-1137));
      DelegatedDateTimeField delegatedDateTimeField1 = new DelegatedDateTimeField(skipDateTimeField0);
      DateTimeField dateTimeField1 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, (-1137));
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set(345L, false);
  }
}
