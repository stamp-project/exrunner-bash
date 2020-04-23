/*

 * Tue Apr 21 06:58:21 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
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
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('#').when(charSequence0).charAt(anyInt());
      doReturn((-873)).when(charSequence0).length();
      doReturn("8uvm72x`}^BLC|=LS](").when(charSequence0).toString();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('#');
      StringWriter stringWriter2 = stringWriter1.append(charSequence0);
      numericEntityUnescaper1.translate(charSequence0, 2410, (Writer) stringWriter2);
      StringWriter stringWriter3 = new StringWriter(296);
      StringWriter stringWriter4 = stringWriter1.append('&');
      StringBuffer stringBuffer0 = stringWriter4.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }
}
