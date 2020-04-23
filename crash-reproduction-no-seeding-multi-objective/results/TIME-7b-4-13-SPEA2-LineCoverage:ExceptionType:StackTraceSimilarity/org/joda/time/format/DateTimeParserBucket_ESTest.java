/*

 * Wed Apr 22 19:46:17 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
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
      Integer integer0 = new Integer(1879);
      int int0 = 17;
      int int1 = 1610;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-409L), (Chronology) null, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 966);
      dateTimeParserBucket0.setOffset(1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", (Locale) null);
      dateTimeParserBucket0.restoreState(dateTimeFieldType0);
      LocalDate localDate0 = LocalDate.MAX;
      dateTimeParserBucket0.restoreState(localDate0);
      Chronology chronology0 = null;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(966, (Chronology) null, (Locale) null);
      dateTimeParserBucket0.restoreState("Illegal instant due to time zone offset transition (");
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "ConverterManager.alterPeriodConverters");
  }
}
