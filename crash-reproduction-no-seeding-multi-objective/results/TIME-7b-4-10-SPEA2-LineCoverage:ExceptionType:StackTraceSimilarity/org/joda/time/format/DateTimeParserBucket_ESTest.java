/*

 * Wed Apr 22 19:45:21 UTC 2020
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
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Value cannot fit in an int: ";
      Chronology chronology0 = null;
      Locale locale0 = Locale.CHINA;
      int int0 = 67;
      Integer integer0 = new Integer(67);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1260L, (Chronology) null, locale0, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 67);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "Value cannot fit in an int: ");
  }
}
