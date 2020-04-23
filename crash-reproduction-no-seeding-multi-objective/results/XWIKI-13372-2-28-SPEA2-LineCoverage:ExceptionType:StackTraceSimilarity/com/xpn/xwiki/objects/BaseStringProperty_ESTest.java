/*

 * Tue Apr 21 05:30:07 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.StringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      StringProperty stringProperty0 = new StringProperty();
      stringProperty0.setDocumentReference(documentReference0);
      BaseCollection<EntityReference> baseCollection0 = (BaseCollection<EntityReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      stringProperty0.setObject(baseCollection0);
      stringProperty0.setId(131071L);
      Object object0 = null;
      // Undeclared exception!
      stringProperty0.equals((Object) null);
  }
}
