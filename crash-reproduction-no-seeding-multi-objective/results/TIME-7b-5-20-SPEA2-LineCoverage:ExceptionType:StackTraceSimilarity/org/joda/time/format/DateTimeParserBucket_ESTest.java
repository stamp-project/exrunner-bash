/*

 * Wed Apr 22 19:48:26 UTC 2020
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
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) null, locale0);
      dateTimeParserBucket0.computeMillis(true, "");
      Object object0 = new Object();
      dateTimeParserBucket0.restoreState(object0);
      int int0 = 1996;
      Integer integer0 = new Integer(2830);
      Locale locale1 = Locale.CHINA;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeFieldType0.isSupported((Chronology) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }
}
