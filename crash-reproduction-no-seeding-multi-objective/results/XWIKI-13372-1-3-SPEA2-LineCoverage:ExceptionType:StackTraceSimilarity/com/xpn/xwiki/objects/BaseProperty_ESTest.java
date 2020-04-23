/*

 * Tue Apr 21 04:01:03 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseProperty;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseProperty baseProperty0 = new BaseProperty();
      baseProperty0.setValueDirty(false);
      baseProperty0.setOwnerDocument((XWikiDocument) null);
      baseProperty0.toFormString();
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      baseProperty0.setObject(baseCollection0);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_ANGLE;
      baseProperty0.setOwnerDocument((XWikiDocument) null);
      // Undeclared exception!
      baseProperty0.equals((Object) null);
  }
}
