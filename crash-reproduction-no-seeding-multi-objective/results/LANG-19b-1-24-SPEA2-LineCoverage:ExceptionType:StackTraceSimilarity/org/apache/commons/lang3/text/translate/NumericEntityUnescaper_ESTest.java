/*

 * Tue Apr 21 06:57:56 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
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
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('a').when(charSequence0).charAt(anyInt());
      doReturn(0).when(charSequence0).length();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      StringWriter stringWriter0 = new StringWriter(35);
      StringWriter stringWriter1 = stringWriter0.append('\"');
      numericEntityUnescaper1.translate(charSequence0, 16, (Writer) stringWriter0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      char[] charArray0 = new char[7];
      charArray0[0] = '&';
      charArray0[1] = '#';
      charArray0[2] = '&';
      charArray0[3] = '|';
      charArray0[4] = '\"';
      charArray0[5] = '\'';
      charArray0[6] = '&';
      stringWriter1.write(charArray0);
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0);
  }
}
