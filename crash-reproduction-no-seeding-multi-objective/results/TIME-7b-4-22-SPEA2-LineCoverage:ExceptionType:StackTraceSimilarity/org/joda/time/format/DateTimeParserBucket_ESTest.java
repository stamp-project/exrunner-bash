/*

 * Wed Apr 22 19:48:58 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale locale1 = Locale.ITALIAN;
      Locale locale2 = Locale.TRADITIONAL_CHINESE;
      Integer integer0 = new Integer((-748));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeFieldType0.getField(buddhistChronology0);
      Integer integer1 = new Integer(2010);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1611L, buddhistChronology0, locale0, integer1);
      dateTimeFieldType0.getField(julianChronology0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(2010, buddhistChronology0, locale0);
      dateTimeParserBucket0.computeMillis(false, "_NMx)Oh");
      dateTimeParserBucket1.saveField(dateTimeFieldType0, 2495);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer2 = dateTimeParserBucket_SavedState0.iOffset;
      Integer.getInteger("", (-914));
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(false, "Cannot parse \"");
  }
}
