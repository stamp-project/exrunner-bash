/*

 * Mon Apr 20 15:02:33 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import java.time.DayOfWeek;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      DayOfWeek dayOfWeek0 = DayOfWeek.TUESDAY;
      JapaneseChronology japaneseChronology0 = JapaneseChronology.INSTANCE;
      JapaneseDate japaneseDate0 = japaneseChronology0.dateEpochDay(2118L);
      // Undeclared exception!
      baseStringProperty0.setValue(japaneseDate0);
  }
}
