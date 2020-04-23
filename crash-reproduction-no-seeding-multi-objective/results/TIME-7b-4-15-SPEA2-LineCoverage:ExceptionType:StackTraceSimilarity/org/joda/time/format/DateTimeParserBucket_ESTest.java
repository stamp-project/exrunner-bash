/*

 * Wed Apr 22 19:46:55 UTC 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(8);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(ethiopicChronology0).when(chronology0).withUTC();
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(durationField0).isSupported();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      Locale locale0 = null;
      Integer integer0 = new Integer((-2111));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1085L, chronology0, (Locale) null, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeFieldType0.getRangeDurationType();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, (Locale) null);
      dateTimeZone0.isFixed();
      Integer.min((-2111), (-832));
      String string0 = "m#h!fu`|n_)h*J<5";
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "m*~>SQ*o%vuj@j]_T");
  }
}
