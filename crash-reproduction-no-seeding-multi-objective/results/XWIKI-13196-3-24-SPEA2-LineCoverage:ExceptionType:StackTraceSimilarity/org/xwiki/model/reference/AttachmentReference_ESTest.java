/*

 * Tue Apr 21 05:59:50 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.SpaceReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      String string0 = "\"c'x|";
      WikiReference wikiReference0 = new WikiReference("\"c'x|");
      SpaceReference spaceReference0 = new SpaceReference("h(KLE^4Kyq>L?V", wikiReference0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.lookup(linkedList0, (Collection<Locale>) null);
      DocumentReference documentReference0 = new DocumentReference("h(KLE^4Kyq>L?V", spaceReference0, (Locale) null);
      AttachmentReference attachmentReference0 = new AttachmentReference("LOCALE", documentReference0);
      EntityType entityType0 = EntityType.SPACE;
      EntityType entityType1 = EntityType.OBJECT;
      attachmentReference0.equals((EntityReference) documentReference0, entityType0, entityType1);
      attachmentReference0.hasParent(documentReference0);
      attachmentReference0.getParent();
      AttachmentReference attachmentReference1 = new AttachmentReference((String) null, documentReference0);
  }
}
