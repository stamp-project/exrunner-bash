/*

 * Wed Apr 22 14:13:30 UTC 2020
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
import org.xwiki.query.jpql.parser.ParserException;
import org.xwiki.query.xwql.internal.hql.XWQLtoHQLTranslator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWQLtoHQLTranslator_ESTest extends XWQLtoHQLTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWQLtoHQLTranslator xWQLtoHQLTranslator0 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(documentAccessBridge0).toString();
      Injector.inject(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      Injector.validateBean(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class);
      DocumentAccessBridge documentAccessBridge1 = xWQLtoHQLTranslator0.getDocumentAccessBridge();
      xWQLtoHQLTranslator0.getDocumentAccessBridge();
      xWQLtoHQLTranslator0.getDocumentAccessBridge();
      XWQLtoHQLTranslator xWQLtoHQLTranslator1 = new XWQLtoHQLTranslator();
      Injector.inject(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge1);
      Injector.validateBean(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class);
      try { 
        xWQLtoHQLTranslator1.translate("g@2Qs,19");
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,1] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}
