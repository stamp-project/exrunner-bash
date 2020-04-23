/*

 * Tue Apr 21 06:52:26 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      int int0 = 0;
      char[] charArray0 = new char[3];
      charArray0[0] = 'P';
      charArray0[1] = '&';
      char[] charArray1 = new char[4];
      charArray1[0] = '&';
      charArray1[1] = '#';
      charArray0[0] = '\"';
      charArray1[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray1);
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0);
  }
}
