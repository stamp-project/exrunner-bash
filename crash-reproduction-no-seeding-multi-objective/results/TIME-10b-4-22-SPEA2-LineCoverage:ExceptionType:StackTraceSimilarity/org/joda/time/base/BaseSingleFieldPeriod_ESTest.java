/*

 * Tue Apr 21 13:08:12 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn(0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      Duration.standardHours(0L);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1123L)).when(dateTimeZone1).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn(2728).when(dateTimeZone1).getOffset(anyLong());
      doReturn((-632)).when(dateTimeZone1).getOffsetFromLocal(anyLong());
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone1);
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
      Days days0 = Days.TWO;
      gJChronology0.add((ReadablePeriod) days0, 1428L, (-1773));
      PeriodType periodType0 = PeriodType.hours();
      PeriodType periodType1 = periodType0.withSecondsRemoved();
      PeriodType periodType2 = periodType1.withYearsRemoved();
      Duration.standardHours(0L);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone2 = gJChronology1.getZone();
      localDate0.toDateMidnight(dateTimeZone2);
      LocalDate localDate1 = new LocalDate((Chronology) islamicChronology0);
      PeriodType.hours();
      periodType0.withSecondsRemoved();
      PeriodType.standard();
      periodType2.withYearsRemoved();
      periodType1.withMinutesRemoved();
      Months months0 = Months.TEN;
      months0.toString();
      days0.toPeriod();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(localDate1, localDate0, days0);
  }
}
