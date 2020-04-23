/*

 * Wed Apr 22 19:44:04 UTC 2020
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
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Illegal instant due to time zone offset transition (";
      Chronology chronology0 = null;
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      int int0 = 15356223;
      Locale locale0 = Locale.CHINA;
      Locale locale1 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(26L, (Chronology) null, locale1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeFieldType0.isSupported((Chronology) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 15356223);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }
}
