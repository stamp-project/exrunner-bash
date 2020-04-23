/*

 * Tue Apr 21 06:52:05 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[0] = '&';
      charArray0[1] = '&';
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityUnescaper0;
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      charSequenceTranslatorArray0[4] = (CharSequenceTranslator) numericEntityUnescaper1;
      charSequenceTranslatorArray0[5] = (CharSequenceTranslator) numericEntityUnescaper1;
      charSequenceTranslatorArray0[6] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[7] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[8] = (CharSequenceTranslator) numericEntityUnescaper0;
      numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      charArray0[2] = '#';
      charArray0[3] = 'Y';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0, 5, 5);
      stringWriter1.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0);
  }
}
