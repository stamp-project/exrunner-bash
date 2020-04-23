/*

 * Wed Apr 22 19:44:34 UTC 2020
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
import org.joda.time.Minutes;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[7];
      DateTimeFieldType.secondOfMinute();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 41);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
      Integer integer0 = new Integer(0);
      dateTimeParserBucket_SavedField0.set(26L, true);
      Locale locale0 = Locale.forLanguageTag("U");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(7L, buddhistChronology0, locale0, (Integer) null, 769);
      dateTimeParserBucket0.getChronology();
      dateTimeParserBucket0.computeMillis(false, "");
      dateTimeParserBucket_SavedField0.set(0L, false);
      dateTimeParserBucket0.getOffsetInteger();
      dateTimeParserBucket_SavedField0.set(7L, true);
      Object object0 = dateTimeParserBucket0.saveState();
      dateTimeParserBucket0.restoreState(object0);
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      Minutes minutes0 = Minutes.THREE;
      buddhistChronology0.add((ReadablePeriod) minutes0, 3456000000L, 41);
      dateTimeParserBucket0.getZone();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "h`{{: ,");
  }
}
