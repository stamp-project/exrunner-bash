/*

 * Wed Apr 22 19:43:46 UTC 2020
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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = (-528L);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(lenientChronology0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(fixedDateTimeZone0).when(chronology0).getZone();
      doReturn(strictChronology0).when(chronology0).withUTC();
      Locale locale0 = null;
      int int0 = 876;
      Integer integer0 = new Integer(876);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-528L), chronology0, (Locale) null, integer0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(gregorianChronology0, dateTimeField0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(skipDateTimeField0, dateTimeFieldType0, 2000);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(876, lenientChronology0, (Locale) null, integer0);
      dateTimeParserBucket1.saveField(dateTimeField0, 2000);
      // Undeclared exception!
      dateTimeParserBucket1.computeMillis(true);
  }
}
