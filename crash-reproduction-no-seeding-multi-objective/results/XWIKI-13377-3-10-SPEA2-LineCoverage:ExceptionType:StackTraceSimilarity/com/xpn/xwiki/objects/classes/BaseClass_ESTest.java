/*

 * Mon Apr 20 14:44:35 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.DateMetaClass;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.util.UserDataElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.DefaultStringDocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiContext xWikiContext0 = new XWikiContext();
      DateMetaClass dateMetaClass0 = new DateMetaClass();
      dateMetaClass0.setNameField("pov|L^K(i");
      DateMetaClass dateMetaClass1 = new DateMetaClass();
      dateMetaClass1.addUsersField("disabled", "disabled");
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      dateMetaClass1.toXML((BaseClass) dateMetaClass0);
      passwordMetaClass0.addTextField("separator", "separator", 20);
      passwordMetaClass0.flushCache();
      passwordMetaClass0.addDBTreeListField("pov|L^K(i", "pov|L^K(i", 20, false, true, "pov|L^K(i");
      HashMap<String, DefaultStringDocumentReferenceResolver> hashMap0 = new HashMap<String, DefaultStringDocumentReferenceResolver>();
      DefaultStringDocumentReferenceResolver defaultStringDocumentReferenceResolver0 = new DefaultStringDocumentReferenceResolver();
      EntityReferenceResolver<UserDataElement> entityReferenceResolver0 = (EntityReferenceResolver<UserDataElement>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringDocumentReferenceResolver0, (Class<?>) DefaultStringDocumentReferenceResolver.class, "entityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(defaultStringDocumentReferenceResolver0, (Class<?>) DefaultStringDocumentReferenceResolver.class);
      hashMap0.put("pov|L^K(i", defaultStringDocumentReferenceResolver0);
      hashMap0.keySet();
      // Undeclared exception!
      passwordMetaClass0.fromMap((Map<String, ?>) hashMap0, (BaseCollection) dateMetaClass0);
  }
}
