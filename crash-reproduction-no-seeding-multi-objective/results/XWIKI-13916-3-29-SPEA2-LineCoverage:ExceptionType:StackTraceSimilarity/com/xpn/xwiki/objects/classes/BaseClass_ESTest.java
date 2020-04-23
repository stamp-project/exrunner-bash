/*

 * Mon Apr 20 16:19:33 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      BaseClass baseClass0 = new BaseClass();
      String string0 = "$@?*R=pL5 #UMuwXek";
      int int0 = 42;
      baseClass0.addTimezoneField("$@?*R=pL5 #UMuwXek", "PaintType", 42);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("$@?*R=pL5 #UMuwXek", "$@?*R=pL5 #UMuwXek", 3054, 3054, textAreaClass_ContentType0);
  }
}
