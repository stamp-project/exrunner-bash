/*

 * Wed Apr 22 19:47:26 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      MockZone mockZone0 = new MockZone((-8L), 403, 160);
      mockZone0.getShortName((long) 173);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(160, ethiopicChronology0, locale0);
      ethiopicChronology0.add((-2657L), (-8L), 2624);
      Integer integer0 = new Integer(173);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-19), ethiopicChronology0, locale0, integer0, 173);
      dateTimeParserBucket1.getPivotYear();
      dateTimeParserBucket0.getOffsetInteger();
      dateTimeParserBucket0.setOffset((-1));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      dateTimeParserBucket0.computeMillis(true, "MockZone");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 110);
      dateTimeParserBucket0.setZone(mockZone0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }
}
