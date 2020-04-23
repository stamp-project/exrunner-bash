/*

 * Tue Apr 21 05:48:17 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      EntityType entityType0 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("K=^0R0!%vbqLRhmx\"", entityType0, (EntityReference) null);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Locale locale1 = Locale.KOREAN;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(locale0, locale1).when(documentReference0).getLocale();
      doReturn("K=^0R0!%vbqLRhmx\"").when(documentReference0).getName();
      doReturn(entityReference0, (EntityReference) null, entityReference0, entityReference0, (EntityReference) null).when(documentReference0).getParent();
      doReturn(entityType0, entityType0, entityType0, entityType1).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("K=^0R0!%vbqLRhmx\"", documentReference0);
      attachmentReference0.compareTo((EntityReference) attachmentReference0);
      attachmentReference0.getDocumentReference();
      attachmentReference0.getRoot();
      attachmentReference0.getReversedReferenceChain();
      attachmentReference0.getParent();
      attachmentReference0.toString();
      attachmentReference0.size();
      attachmentReference0.getDocumentReference();
      AttachmentReference attachmentReference1 = new AttachmentReference((String) null, (DocumentReference) null);
  }
}
