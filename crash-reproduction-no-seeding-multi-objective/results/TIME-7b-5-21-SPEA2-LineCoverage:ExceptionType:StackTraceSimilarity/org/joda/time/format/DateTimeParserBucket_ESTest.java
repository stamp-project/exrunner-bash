/*

 * Wed Apr 22 19:48:41 UTC 2020
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
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[1];
      Integer integer0 = new Integer(2164);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Chronology chronology0 = gJChronology0.withUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3707L, chronology0, locale0, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      Integer integer1 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, chronology0, locale0, (Integer) null, 1);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      dateTimeParserBucket1.computeMillis();
      Integer integer2 = dateTimeParserBucket_SavedState0.iOffset;
      dateTimeParserBucket1.getOffsetInteger();
      dateTimeParserBucket0.computeMillis(true, "");
      Locale locale1 = Locale.forLanguageTag("");
      dateTimeParserBucket1.setOffset((-735));
      locale0.getDisplayVariant();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 122);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "minuteOfDay", locale1);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }
}
