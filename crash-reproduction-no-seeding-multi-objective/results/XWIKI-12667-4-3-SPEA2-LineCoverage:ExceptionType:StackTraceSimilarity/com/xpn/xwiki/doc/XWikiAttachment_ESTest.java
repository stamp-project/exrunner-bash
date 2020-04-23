/*

 * Mon Apr 20 13:16:49 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.crypto.internal.BouncyCastleJcaProvider;
import org.xwiki.model.internal.reference.ExplicitStringDocumentReferenceResolver;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      ExplicitStringDocumentReferenceResolver explicitStringDocumentReferenceResolver0 = new ExplicitStringDocumentReferenceResolver();
      EntityReferenceResolver<BouncyCastleJcaProvider> entityReferenceResolver0 = (EntityReferenceResolver<BouncyCastleJcaProvider>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(explicitStringDocumentReferenceResolver0, (Class<?>) ExplicitStringDocumentReferenceResolver.class, "entityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(explicitStringDocumentReferenceResolver0, (Class<?>) ExplicitStringDocumentReferenceResolver.class);
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}
