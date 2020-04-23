/*

 * Wed Apr 22 19:48:34 UTC 2020
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
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(3359);
      DateTimeFieldType.year();
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, copticChronology0, (Locale) null);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer1 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(254, copticChronology0, (Locale) null, (Integer) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket1.saveField(dateTimeField0, 1318);
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(true, "");
  }
}
