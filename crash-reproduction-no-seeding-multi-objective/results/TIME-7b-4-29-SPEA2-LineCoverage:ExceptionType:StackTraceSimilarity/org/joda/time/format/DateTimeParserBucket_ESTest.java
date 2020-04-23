/*

 * Wed Apr 22 19:51:03 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, locale0, (Integer) null);
      dateTimeParserBucket0.computeMillis(true, (String) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }
}
