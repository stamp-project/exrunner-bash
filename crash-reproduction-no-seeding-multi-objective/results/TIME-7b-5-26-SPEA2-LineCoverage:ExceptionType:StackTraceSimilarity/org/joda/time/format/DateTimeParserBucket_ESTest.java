/*

 * Wed Apr 22 19:50:13 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Chronology chronology0 = gregorianChronology0.withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-443L), chronology0, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1220);
      dateTimeParserBucket0.getOffset();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-1378L), chronology0, locale0, (Integer) null, 1220);
      dateTimeParserBucket1.getPivotYear();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }
}
