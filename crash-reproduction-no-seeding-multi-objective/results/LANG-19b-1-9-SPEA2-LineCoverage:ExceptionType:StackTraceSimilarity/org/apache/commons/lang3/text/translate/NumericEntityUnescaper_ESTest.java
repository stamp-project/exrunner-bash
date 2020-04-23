/*

 * Tue Apr 21 06:53:24 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char char0 = '#';
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(charSequence0).length();
      char[] charArray0 = new char[6];
      charArray0[0] = '&';
      charArray0[1] = '#';
      charArray0[2] = '#';
      charArray0[3] = '#';
      charArray0[4] = '&';
      char char1 = '&';
      StringWriter stringWriter0 = new StringWriter(124);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) stringBuffer0);
      numericEntityUnescaper0.translate(charSequence0, (Writer) stringWriter1);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter2);
  }
}
