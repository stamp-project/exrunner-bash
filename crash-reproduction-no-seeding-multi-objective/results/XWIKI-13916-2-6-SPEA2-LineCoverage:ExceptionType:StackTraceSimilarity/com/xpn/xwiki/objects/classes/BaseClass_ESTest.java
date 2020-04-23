/*

 * Mon Apr 20 15:50:53 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.DefaultReferenceDocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      String string0 = "";
      int int0 = 1687;
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      dBTreeListMetaClass0.addTextAreaField("", "", 3002, 1687, textAreaClass_EditorType0, textAreaClass_ContentType0);
      dBTreeListMetaClass0.getName();
      String string1 = "";
      dBTreeListMetaClass0.addStaticListField("DBTreeList", "", "");
      Boolean boolean0 = new Boolean(true);
      DefaultReferenceDocumentReferenceResolver defaultReferenceDocumentReferenceResolver0 = new DefaultReferenceDocumentReferenceResolver();
      EntityReferenceResolver<Integer> entityReferenceResolver0 = (EntityReferenceResolver<Integer>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      String string2 = "nvCVY";
      String string3 = " b]uQd>Yx8T[z](x";
      TextAreaClass.EditorType textAreaClass_EditorType1 = TextAreaClass.EditorType.PURE_TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType1 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      dBTreeListMetaClass0.addTextAreaField("DBTreeList", " b]uQd>Yx8T[z](x", (-1932735302), 2097152, textAreaClass_EditorType1, textAreaClass_ContentType1);
  }
}
