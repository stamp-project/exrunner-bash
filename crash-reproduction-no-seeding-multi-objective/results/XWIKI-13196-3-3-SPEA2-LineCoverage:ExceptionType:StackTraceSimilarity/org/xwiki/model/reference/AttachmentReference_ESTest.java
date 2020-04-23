/*

 * Tue Apr 21 05:39:48 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      Locale locale0 = Locale.TAIWAN;
      DocumentReference documentReference0 = new DocumentReference("\n", "] in an attachment reference", "&l6lDQe[>Egjk&<", locale0);
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference(documentReference0);
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(localDocumentReference0).when(documentReference1).getParent();
      localDocumentReference0.appendParent(documentReference0);
      AttachmentReference attachmentReference0 = new AttachmentReference("|p$iJIERz", documentReference1);
      Map<String, Serializable> map0 = attachmentReference0.getParameters();
      attachmentReference0.getType();
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      hashMap0.put("|p$iJIERz", entityType0);
      attachmentReference0.setParameters((Map<String, Serializable>) null);
      attachmentReference0.getName();
      attachmentReference0.getName();
      Locale locale1 = Locale.KOREAN;
      LocalDocumentReference localDocumentReference1 = new LocalDocumentReference("|p$iJIERz", "|p$iJIERz", locale1);
      attachmentReference0.hasParent(localDocumentReference1);
      attachmentReference0.setParameters(map0);
      DocumentReference documentReference2 = new DocumentReference("|p$iJIERz", "|p$iJIERz", "|p$iJIERz");
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference2);
  }
}
