/*

 * Wed Apr 22 19:43:52 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      FieldUtils.verifyValueBounds("", 0, 0, 0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      int int1 = Integer.MIN_VALUE;
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, Integer.MIN_VALUE);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(islamicChronology0, offsetDateTimeField0);
      int int2 = 0;
      FieldUtils.verifyValueBounds((DateTimeField) skipUndoDateTimeField0, 0, 0, 0);
      int int3 = (-17);
      FieldUtils.safeAdd(0, (-17));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipUndoDateTimeField0, 0, (-17), Integer.MIN_VALUE);
  }
}
