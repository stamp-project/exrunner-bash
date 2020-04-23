/*

 * Wed Apr 22 19:44:12 UTC 2020
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
import org.joda.time.MockZone;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 896;
      MockZone mockZone0 = new MockZone(0L, 896, 896);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) mockZone0);
      long long0 = 4035L;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, (Locale) null);
      dateTimeParserBucket0.computeMillis();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      int int1 = 2874;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2874);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }
}
