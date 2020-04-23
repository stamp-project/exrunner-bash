/*

 * Wed Apr 22 19:45:25 UTC 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone.forOffsetHours(21);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType.dayOfYear();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, (Locale) null, (Integer) null);
      dateTimeParserBucket0.setPivotYear((Integer) null);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-2771));
      Integer integer0 = new Integer(21);
      BuddhistChronology.getInstance();
      Object object0 = new Object();
      dateTimeParserBucket0.restoreState(object0);
      Integer integer1 = Integer.valueOf(3464);
      dateTimeParserBucket0.setPivotYear(integer1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 8);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "WXC9t4(k8,zEx|~", (Locale) null);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }
}
