/*

 * Mon Apr 20 13:40:48 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.ExplicitStringDocumentReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringDocumentReferenceResolver explicitStringDocumentReferenceResolver0 = new ExplicitStringDocumentReferenceResolver();
      EntityReferenceResolver<RelativeStringEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<RelativeStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(explicitStringDocumentReferenceResolver0, (Class<?>) ExplicitStringDocumentReferenceResolver.class, "entityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(explicitStringDocumentReferenceResolver0, (Class<?>) ExplicitStringDocumentReferenceResolver.class);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "0:RHwy";
      objectArray0[1] = (Object) "0:RHwy";
      objectArray0[2] = (Object) explicitStringDocumentReferenceResolver0;
      objectArray0[3] = (Object) entityReferenceResolver0;
      objectArray0[4] = (Object) "0:RHwy";
      Object object0 = new Object();
      objectArray0[5] = object0;
      DocumentReference documentReference0 = new DocumentReference("0:RHwy", "0:RHwy", "0:RHwy");
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      doReturn("0:RHwy").when(xWikiDocument0).toString();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.getDoc();
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext0);
  }
}
