/*

 * Wed Apr 22 19:49:32 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[7];
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(8);
      GJChronology.getInstanceUTC();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "", (Locale) null);
      buddhistChronology0.weekyear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "", (Locale) null);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Locale locale0 = new Locale("", "", "p");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      Integer integer0 = dateTimeParserBucket_SavedState0.iOffset;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(8, iSOChronology0, (Locale) null, (Integer) null);
      dateTimeParserBucket1.saveState();
      dateTimeParserBucket1.computeMillis();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket1.saveField(dateTimeFieldType0, (-1828));
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      dateTimeParserBucket0.setZone(dateTimeZone1);
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(false, "B;\"A][9_-+uj");
  }
}
