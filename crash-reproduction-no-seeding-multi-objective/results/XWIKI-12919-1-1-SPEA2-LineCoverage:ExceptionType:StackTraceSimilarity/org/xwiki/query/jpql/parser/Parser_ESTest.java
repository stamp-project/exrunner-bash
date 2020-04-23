/*

 * Wed Apr 22 14:12:01 UTC 2020
 */

package org.xwiki.query.jpql.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.query.jpql.lexer.Lexer;
import org.xwiki.query.jpql.node.TStringLiteral;
import org.xwiki.query.jpql.node.Token;
import org.xwiki.query.jpql.parser.Parser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = ".";
      TStringLiteral tStringLiteral0 = new TStringLiteral(".");
      tStringLiteral0.clone();
      Lexer lexer0 = mock(Lexer.class, new ViolatedAssumptionAnswer());
      doReturn(tStringLiteral0, (Token) null).when(lexer0).peek();
      Parser parser0 = new Parser(lexer0);
      // Undeclared exception!
      parser0.parse();
  }
}
