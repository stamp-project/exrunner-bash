/*

 * Mon Apr 20 15:14:24 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.EmailMetaClass;
import com.xpn.xwiki.objects.meta.TextAreaMetaClass;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.NamespaceStack;
import org.dom4j.util.UserDataElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmailMetaClass emailMetaClass0 = new EmailMetaClass();
      TextAreaClass textAreaClass0 = new TextAreaClass(emailMetaClass0);
      XWikiContext xWikiContext0 = new XWikiContext();
      emailMetaClass0.isCustomMappingValid(xWikiContext0);
      String string0 = "[gT$f'leO$Eme_ozFI";
      ConcurrentHashMap<String, UserDataElement> concurrentHashMap0 = new ConcurrentHashMap<String, UserDataElement>();
      String string1 = "validationMessage";
      NamespaceStack namespaceStack0 = new NamespaceStack();
      namespaceStack0.pop("idField");
      QName qName0 = new QName("", (Namespace) null);
      UserDataElement userDataElement0 = new UserDataElement(qName0);
      concurrentHashMap0.replace("script", userDataElement0);
      UserDataElement userDataElement1 = new UserDataElement(qName0);
      concurrentHashMap0.put("validationMessage", userDataElement1);
      TextAreaMetaClass textAreaMetaClass0 = new TextAreaMetaClass();
      // Undeclared exception!
      textAreaMetaClass0.fromMap((Map<String, ?>) concurrentHashMap0, (BaseCollection) textAreaClass0);
  }
}
