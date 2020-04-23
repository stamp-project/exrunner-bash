/*

 * Wed Apr 22 19:47:44 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.MinguoChronology;
import java.time.chrono.MinguoDate;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(fixedDateTimeZone0).when(chronology0).getZone();
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      Integer integer0 = new Integer(74);
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(fixedDateTimeZone0).when(chronology1).getZone();
      doReturn(buddhistChronology0).when(chronology1).withUTC();
      Integer integer1 = new Integer(0);
      int int0 = 2680;
      int int1 = (-2573);
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(123L, chronology1, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2573));
      Integer integer2 = new Integer(74);
      Locale locale1 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-2573), chronology0, locale1, integer2, 2000);
      Chronology chronology2 = dateTimeParserBucket1.getChronology();
      DateTimeField dateTimeField0 = chronology2.dayOfYear();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 2000);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(offsetDateTimeField0, dateTimeFieldType0);
      delegatedDateTimeField0.getLeapDurationField();
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeFieldType1, 2680);
      MinguoChronology minguoChronology0 = MinguoChronology.INSTANCE;
      MinguoDate minguoDate0 = minguoChronology0.dateNow();
      dateTimeParserBucket0.restoreState(minguoDate0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }
}
