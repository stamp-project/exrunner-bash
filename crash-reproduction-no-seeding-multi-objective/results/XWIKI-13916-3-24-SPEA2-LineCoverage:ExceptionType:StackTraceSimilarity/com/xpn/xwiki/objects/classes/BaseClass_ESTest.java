/*

 * Mon Apr 20 16:12:53 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.DefaultReferenceDocumentReferenceResolver;
import org.xwiki.security.authorization.internal.DefaultContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = "&Q";
      baseClass0.addTemplateField("&Q", "&Q");
      Hashtable<DefaultReferenceDocumentReferenceResolver, DefaultContextualAuthorizationManager> hashtable0 = new Hashtable<DefaultReferenceDocumentReferenceResolver, DefaultContextualAuthorizationManager>();
      baseClass0.setFields(hashtable0);
      baseClass0.getDocumentReference();
      int int0 = 7005;
      baseClass0.addTextField("&Q", "&Q", 7005);
      baseClass0.getEnabledProperties();
      // Undeclared exception!
      baseClass0.addTextAreaField("&Q", "&Q", 7005, 7005, (TextAreaClass.ContentType) null);
  }
}
