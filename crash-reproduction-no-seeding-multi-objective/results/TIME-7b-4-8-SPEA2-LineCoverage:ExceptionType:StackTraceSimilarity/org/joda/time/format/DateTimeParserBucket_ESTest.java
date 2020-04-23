/*

 * Wed Apr 22 19:44:50 UTC 2020
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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.getDefault();
      Integer integer0 = null;
      Integer integer1 = new Integer(2231);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0, integer1, 15);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, (-103));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "9a");
  }
}
