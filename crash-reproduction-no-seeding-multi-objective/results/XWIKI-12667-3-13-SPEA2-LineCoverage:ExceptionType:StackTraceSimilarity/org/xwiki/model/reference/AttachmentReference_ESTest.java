/*

 * Mon Apr 20 13:24:56 UTC 2020
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
      Locale locale0 = new Locale("< ");
      EntityType entityType0 = EntityType.WIKI;
      EntityType entityType1 = EntityType.SPACE;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn(locale0, locale0).when(documentReference0).getLocale();
      doReturn("").when(documentReference0).getName();
      doReturn((EntityReference) null, (EntityReference) null, (EntityReference) null).when(documentReference0).getParent();
      doReturn(entityType0, entityType1, entityType0).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("Invalid type [", documentReference0);
      attachmentReference0.toString();
      EntityType entityType2 = EntityType.DOCUMENT;
      attachmentReference0.extractReference(entityType2);
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference1);
  }
}
