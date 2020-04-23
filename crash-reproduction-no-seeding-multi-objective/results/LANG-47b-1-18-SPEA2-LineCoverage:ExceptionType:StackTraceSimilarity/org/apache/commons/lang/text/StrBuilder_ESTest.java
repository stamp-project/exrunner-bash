/*

 * Tue Apr 21 06:15:33 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StrBuilder_ESTest extends StrBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "java.awt.graphicsenv";
      StrBuilder strBuilder0 = new StrBuilder("java.awt.graphicsenv");
      char[] charArray0 = new char[1];
      char char0 = 'c';
      charArray0[0] = 'c';
      StrBuilder strBuilder1 = strBuilder0.append(charArray0, 0, 0);
      char char1 = 'V';
      strBuilder1.lastIndexOf('V');
      String string1 = "O /Qf-&fo ';";
      StrBuilder strBuilder2 = strBuilder1.appendSeparator("O /Qf-&fo ';");
      strBuilder0.appendln((Object) strBuilder1);
      StrBuilder strBuilder3 = strBuilder1.appendPadding((-1), 'V');
      strBuilder3.trim();
      StrBuilder strBuilder4 = new StrBuilder('V');
      strBuilder4.getNewLineText();
      strBuilder2.length();
      char char2 = 'R';
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 108, 'R');
  }
}
