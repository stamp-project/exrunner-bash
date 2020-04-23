/*

 * Tue Apr 21 06:54:08 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      stringWriter0.close();
      char[] charArray0 = new char[8];
      charArray0[2] = '(';
      StringWriter stringWriter1 = new StringWriter('(');
      StringWriter stringWriter2 = stringWriter1.append('(');
      stringWriter1.append('U');
      charArray0[3] = '(';
      String string0 = "1Luh)|0\"X&#^%xT@gl";
      stringWriter1.write("1Luh)|0\"X&#^%xT@gl");
      charArray0[6] = '(';
      stringWriter2.flush();
      StringWriter stringWriter3 = new StringWriter();
      int int0 = 5;
      UnicodeEscaper.above('\u008A');
      CharSequenceTranslator.hex((-1));
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "1Luh)|0\"X&#^%xT@gl");
  }
}
