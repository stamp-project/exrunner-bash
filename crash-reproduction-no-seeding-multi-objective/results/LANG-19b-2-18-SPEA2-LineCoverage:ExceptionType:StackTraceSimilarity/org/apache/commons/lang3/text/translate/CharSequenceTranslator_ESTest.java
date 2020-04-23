/*

 * Tue Apr 21 06:56:34 UTC 2020
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
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2);
      CharSequenceTranslator.hex(2);
      unicodeEscaper0.translate((CharSequence) "2");
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      UnicodeEscaper unicodeEscaper1 = new UnicodeEscaper();
      UnicodeUnescaper.OPTION unicodeUnescaper_OPTION0 = UnicodeUnescaper.OPTION.escapePlus;
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "";
      stringWriter0.write("&#");
      stringWriter0.append('_');
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }
}
