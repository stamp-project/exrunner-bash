/*

 * Wed Apr 22 19:45:57 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.getZone();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(40L, buddhistChronology0, (Locale) null);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveState();
      dateTimeParserBucket0.getLocale();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.setOffset((Integer) null);
      dateTimeParserBucket0.setOffset((Integer) null);
      Integer integer1 = new Integer((-86399999));
      dateTimeParserBucket0.getChronology();
      dateTimeParserBucket0.getOffset();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      dateTimeParserBucket0.getOffset();
      String string0 = "Cannot parse \"";
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "Cannot parse \"");
  }
}
