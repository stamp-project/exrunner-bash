/*

 * Mon Apr 20 15:14:39 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.PageMetaClass;
import java.util.Map;
import java.util.function.BiFunction;
import org.dom4j.util.NonLazyElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentMap;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.ExplicitReferenceDocumentReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageMetaClass pageMetaClass0 = new PageMetaClass();
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addDBListField("name", "name", "");
      baseClass0.getIntValue("BHpZ_", (-1281));
      Object object0 = new Object();
      XWikiContext xWikiContext0 = new XWikiContext();
      BiFunction<Object, Object, ExplicitReferenceDocumentReferenceResolver> biFunction0 = (BiFunction<Object, Object, ExplicitReferenceDocumentReferenceResolver>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      PersistentMap persistentMap0 = new PersistentMap(sessionImplementor0, xWikiContext0);
      BaseCollection baseCollection0 = pageMetaClass0.fromMap((Map<String, ?>) persistentMap0, (BaseCollection) baseClass0);
      pageMetaClass0.addUsersField("-WUV,IHF4", (String) null);
      NonLazyElement nonLazyElement0 = new NonLazyElement("ZiL9.7");
      xWikiContext0.put("name", nonLazyElement0);
      baseClass0.setCustomMapping("-WUV,IHF4");
      // Undeclared exception!
      pageMetaClass0.fromMap((Map<String, ?>) persistentMap0, (BaseCollection) baseCollection0);
  }
}
