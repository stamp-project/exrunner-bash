/*

 * Wed Apr 22 14:13:31 UTC 2020
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
import org.xwiki.query.jpql.node.TLocate;
import org.xwiki.query.jpql.node.TSubstring;
import org.xwiki.query.jpql.parser.Parser;
import org.xwiki.query.jpql.parser.ParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TLocate tLocate0 = new TLocate("~m\"PcI(^");
      TSubstring tSubstring0 = new TSubstring("The file \"parser.dat\" is either missing or corrupted.");
      Lexer lexer0 = mock(Lexer.class, new ViolatedAssumptionAnswer());
      doReturn(tLocate0, tLocate0, tLocate0, tLocate0, tSubstring0).when(lexer0).peek();
      Parser parser0 = new Parser(lexer0);
      try { 
        parser0.parse();
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [0,0] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}
