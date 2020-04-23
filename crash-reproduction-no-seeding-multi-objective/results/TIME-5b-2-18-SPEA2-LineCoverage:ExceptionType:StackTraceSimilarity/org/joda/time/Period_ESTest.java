/*

 * Wed Apr 22 19:41:03 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.joda.time.TestTimeOfDay_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(0);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics("PRT");
      TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
      Chronology chronology0 = testTimeOfDay_Basics_MockInstant0.getChronology();
      Period period0 = new Period(26L, 0L, periodType0, chronology0);
      Period.millis(0);
      Duration duration0 = Duration.millis(0);
      Seconds seconds0 = duration0.toStandardSeconds();
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      period0.isSupported(durationFieldType0);
      period0.getMillis();
      // Undeclared exception!
      period0.withYears(0);
  }
}
