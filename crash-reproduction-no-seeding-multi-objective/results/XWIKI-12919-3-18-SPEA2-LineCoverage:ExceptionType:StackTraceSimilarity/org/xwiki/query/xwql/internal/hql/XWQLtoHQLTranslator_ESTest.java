/*

 * Wed Apr 22 14:16:40 UTC 2020
 */

package org.xwiki.query.xwql.internal.hql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.query.jpql.node.Start;
import org.xwiki.query.jpql.parser.ParserException;
import org.xwiki.query.xwql.internal.QueryContext;
import org.xwiki.query.xwql.internal.hql.XWQLtoHQLTranslator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWQLtoHQLTranslator_ESTest extends XWQLtoHQLTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWQLtoHQLTranslator xWQLtoHQLTranslator0 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      Injector.validateBean(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class);
      Start start0 = new Start();
      DocumentAccessBridge documentAccessBridge1 = xWQLtoHQLTranslator0.documentAccessBridge;
      QueryContext queryContext0 = new QueryContext(start0, documentAccessBridge1);
      xWQLtoHQLTranslator0.getPrinter(queryContext0);
      try { 
        xWQLtoHQLTranslator0.translate(".*w[wBFP>+ZzC^&");
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,1] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}
