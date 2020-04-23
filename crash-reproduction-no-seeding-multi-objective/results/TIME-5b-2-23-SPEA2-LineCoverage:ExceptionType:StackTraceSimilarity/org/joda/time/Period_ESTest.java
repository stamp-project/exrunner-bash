/*

 * Wed Apr 22 20:42:18 BST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = Period.weeks(0);
      period0.plusMillis(0);
      period0.negated();
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis(0);
      PeriodType periodType0 = PeriodType.seconds();
      Period period1 = new Period(localDateTime1, localDateTime0, periodType0);
      Locale locale0 = Locale.CHINESE;
      Locale locale1 = locale0.stripExtensions();
      Calendar.getInstance(locale1);
      Period.fieldDifference(localDateTime1, localDateTime0);
      // Undeclared exception!
      period1.withYears(0);
  }
}
