/*

 * Wed Apr 22 14:17:19 UTC 2020
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
import org.xwiki.query.jpql.node.TFunctionsReturningDatetime;
import org.xwiki.query.jpql.node.TLower;
import org.xwiki.query.jpql.parser.Parser;
import org.xwiki.query.jpql.parser.ParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TLower tLower0 = new TLower("", 24, 24);
      String string0 = null;
      TFunctionsReturningDatetime tFunctionsReturningDatetime0 = new TFunctionsReturningDatetime((String) null);
      Lexer lexer0 = mock(Lexer.class, new ViolatedAssumptionAnswer());
      doReturn(tLower0, tLower0, tLower0, tFunctionsReturningDatetime0, tLower0).when(lexer0).peek();
      Parser parser0 = new Parser(lexer0);
      try { 
        parser0.parse();
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [24,24] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}
