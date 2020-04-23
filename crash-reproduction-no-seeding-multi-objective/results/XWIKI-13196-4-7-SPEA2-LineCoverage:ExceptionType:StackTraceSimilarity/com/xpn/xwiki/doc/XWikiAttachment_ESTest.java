/*

 * Tue Apr 21 05:45:02 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.apache.struts.chain.contexts.MockActionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.DefaultStringDocumentReferenceResolver;
import org.xwiki.model.internal.reference.UidStringEntityReferenceSerializer;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockActionContext mockActionContext0 = new MockActionContext();
      mockActionContext0.getLocale();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      DefaultStringDocumentReferenceResolver defaultStringDocumentReferenceResolver0 = new DefaultStringDocumentReferenceResolver();
      EntityReferenceResolver<UidStringEntityReferenceSerializer> entityReferenceResolver0 = (EntityReferenceResolver<UidStringEntityReferenceSerializer>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringDocumentReferenceResolver0, (Class<?>) DefaultStringDocumentReferenceResolver.class, "entityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(defaultStringDocumentReferenceResolver0, (Class<?>) DefaultStringDocumentReferenceResolver.class);
      mockActionContext0.put(xWikiContext1, defaultStringDocumentReferenceResolver0);
      DocumentReference documentReference0 = new DocumentReference("H:", "H:", "blkcnt_t", (Locale) null);
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}
