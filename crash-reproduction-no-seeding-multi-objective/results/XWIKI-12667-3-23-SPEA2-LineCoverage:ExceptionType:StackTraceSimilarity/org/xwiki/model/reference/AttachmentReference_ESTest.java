/*

 * Mon Apr 20 13:35:11 UTC 2020
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
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      EntityType entityType0 = EntityType.DOCUMENT;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference0 = new AttachmentReference("]hI<GDF8,[P:c'GA!", documentReference0);
      Locale locale0 = new Locale("nU'M@Uwvw", "e!syg@/XN<D;|`zz]");
      DocumentReference documentReference1 = new DocumentReference("\r", "cS]4Hnv/", "nU'M@Uwvw", locale0);
      AttachmentReference attachmentReference1 = new AttachmentReference("]hI<GDF8,[P:c'GA!", documentReference1);
      String string0 = "";
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference1);
  }
}
