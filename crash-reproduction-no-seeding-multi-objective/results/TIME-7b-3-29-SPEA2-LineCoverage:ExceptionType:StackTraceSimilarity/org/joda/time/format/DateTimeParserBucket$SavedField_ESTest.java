/*

 * Wed Apr 22 19:50:55 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = (-19L);
      DateTimeFieldType.dayOfYear();
      PeriodType.years();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.getDefault(locale_Category0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      DateTimeField dateTimeField1 = buddhistChronology0.weekOfWeekyear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField1, 0);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.equals((Object) null);
      buddhistChronology0.withZone(dateTimeZone0);
      int int0 = (-696);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, (-696));
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField2 = new DateTimeParserBucket.SavedField(dateTimeField1, (-628));
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField2);
      dateTimeParserBucket_SavedField1.compareTo(dateTimeParserBucket_SavedField0);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField2);
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set(0, true);
  }
}
