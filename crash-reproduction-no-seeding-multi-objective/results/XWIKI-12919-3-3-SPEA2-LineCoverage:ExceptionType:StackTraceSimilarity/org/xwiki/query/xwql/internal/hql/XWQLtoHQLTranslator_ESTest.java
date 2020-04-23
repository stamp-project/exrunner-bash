/*

 * Wed Apr 22 14:12:53 UTC 2020
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
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.query.jpql.parser.ParserException;
import org.xwiki.query.xwql.internal.hql.XWQLtoHQLTranslator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWQLtoHQLTranslator_ESTest extends XWQLtoHQLTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWQLtoHQLTranslator xWQLtoHQLTranslator0 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null).when(documentAccessBridge0).getCurrentDocumentReference();
      doReturn((Object) null).when(documentAccessBridge0).getProperty(any(org.xwiki.model.reference.DocumentReference.class) , any(org.xwiki.model.reference.DocumentReference.class) , anyInt() , anyString());
      Injector.inject(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      Injector.validateBean(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class);
      DocumentAccessBridge documentAccessBridge1 = xWQLtoHQLTranslator0.documentAccessBridge;
      documentAccessBridge1.getCurrentDocumentReference();
      documentAccessBridge1.getProperty((DocumentReference) null, (DocumentReference) null, 0, "fromselect doc.fullname from document as doc");
      xWQLtoHQLTranslator0.documentAccessBridge = documentAccessBridge1;
      XWQLtoHQLTranslator xWQLtoHQLTranslator1 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge2 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn("relative").when(documentAccessBridge2).toString();
      Injector.inject(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge2);
      Injector.validateBean(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class);
      xWQLtoHQLTranslator1.translate("");
      try { 
        xWQLtoHQLTranslator1.translate("creationDate");
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,1] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}
