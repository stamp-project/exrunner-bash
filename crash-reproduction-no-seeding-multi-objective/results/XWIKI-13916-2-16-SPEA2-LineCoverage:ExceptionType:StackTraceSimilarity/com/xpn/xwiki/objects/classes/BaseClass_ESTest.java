/*

 * Mon Apr 20 16:02:51 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.merge.MergeConfiguration;
import com.xpn.xwiki.doc.merge.MergeResult;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.DBListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      MergeConfiguration mergeConfiguration0 = new MergeConfiguration();
      mergeConfiguration0.setProvidedVersionsModifiables(true);
      mergeConfiguration0.setProvidedVersionsModifiables(true);
      mergeConfiguration0.setProvidedVersionsModifiables(false);
      MergeResult mergeResult0 = new MergeResult();
      DBListMetaClass dBListMetaClass0 = new DBListMetaClass();
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      // Undeclared exception!
      dBListMetaClass0.addTextAreaField("disabled", "w{!", (-212), (-927), textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
