/*

 * Wed Apr 22 19:48:09 UTC 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1444L), buddhistChronology0, locale0, (Integer) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 9600014);
      dateTimeParserBucket0.saveState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = dateTimeParserBucket0.new SavedState();
      Integer integer0 = dateTimeParserBucket_SavedState1.iOffset;
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }
}
