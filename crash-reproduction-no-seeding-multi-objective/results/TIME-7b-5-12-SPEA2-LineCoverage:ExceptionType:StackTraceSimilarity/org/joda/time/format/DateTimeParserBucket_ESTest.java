/*

 * Wed Apr 22 19:46:02 UTC 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[5];
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime.now(dateTimeZone0);
      Integer integer0 = Integer.getInteger("Cannot parse \"", 0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      Locale locale0 = new Locale("X");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, copticChronology0, locale0, integer0);
      DateTimeZone dateTimeZone1 = dateTimeParserBucket0.getZone();
      GregorianChronology.getInstance(dateTimeZone1);
      DateTimeFieldType.millisOfSecond();
      Locale locale1 = Locale.UK;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone1);
      dateTimeFieldType0.isSupported(chronology0);
      dateTimeFieldType0.getRangeDurationType();
      dateTimeFieldType0.isSupported(copticChronology0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale1);
      Locale.getDefault();
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "\": ");
  }
}
