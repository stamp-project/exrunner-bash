/*

 * Mon Apr 20 13:29:00 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "[rHT2|6En{";
      DocumentReference documentReference0 = new DocumentReference("[rHT2|6En{", "[rHT2|6En{", "[rHT2|6En{");
      AttachmentReference attachmentReference0 = new AttachmentReference("[rHT2|6En{", documentReference0);
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      documentReference0.equals((EntityReference) attachmentReference0, entityType0);
      attachmentReference0.getDocumentReference();
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      attachmentReference0.extractReference(entityType1);
      WikiReference wikiReference0 = new WikiReference("[rHT2|6En{");
      documentReference0.setWikiReference(wikiReference0);
      String string1 = "/,Q";
      attachmentReference0.size();
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference0);
  }
}
