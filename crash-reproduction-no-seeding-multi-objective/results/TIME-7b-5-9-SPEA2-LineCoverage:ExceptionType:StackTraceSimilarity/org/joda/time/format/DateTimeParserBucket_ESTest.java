/*

 * Wed Apr 22 19:45:07 UTC 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1251L), 2, 2);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(chronology0);
      Chronology chronology1 = strictChronology0.withUTC();
      Chronology chronology2 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(mockZone0).when(chronology2).getZone();
      doReturn(chronology1).when(chronology2).withUTC();
      Integer integer0 = new Integer((-3432));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1251L), chronology2, (Locale) null, integer0);
      dateTimeParserBucket0.getPivotYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-3432));
      dateTimeParserBucket0.getOffset();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      MockZone mockZone1 = (MockZone)dateTimeParserBucket_SavedState0.iZone;
      Chronology chronology3 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(mockZone1).when(chronology3).getZone();
      doReturn(buddhistChronology0).when(chronology3).withUTC();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1550L, chronology3, (Locale) null, integer0, 0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }
}
