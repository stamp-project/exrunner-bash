/*

 * Wed Apr 22 14:17:56 UTC 2020
 */

package org.xwiki.query.jpql.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.query.jpql.lexer.Lexer;
import org.xwiki.query.jpql.node.AStartSpec;
import org.xwiki.query.jpql.node.TSubstring;
import org.xwiki.query.jpql.parser.Parser;
import org.xwiki.query.jpql.parser.ParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TSubstring tSubstring0 = new TSubstring("a<Xm<j75Y9m<hkT6P[");
      Lexer lexer0 = mock(Lexer.class, new ViolatedAssumptionAnswer());
      doReturn(tSubstring0, tSubstring0, tSubstring0, tSubstring0, tSubstring0).when(lexer0).peek();
      Parser parser0 = new Parser(lexer0);
      ArrayList<AStartSpec> arrayList0 = new ArrayList<AStartSpec>();
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
