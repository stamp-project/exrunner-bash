/*

 * Mon Apr 20 19:16:57 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.docbook.DocBookParser;
import org.xwiki.rendering.internal.parser.doxia.AbstractDoxiaParser;
import org.xwiki.rendering.internal.parser.xhtml.XHTMLParser;
import org.xwiki.rendering.parser.ResourceReferenceParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      DocBookParser docBookParser0 = new DocBookParser();
      ResourceReferenceParser resourceReferenceParser0 = mock(ResourceReferenceParser.class, new ViolatedAssumptionAnswer());
      Injector.inject(docBookParser0, (Class<?>) AbstractDoxiaParser.class, "imageReferenceParser", (Object) resourceReferenceParser0);
      ResourceReferenceParser resourceReferenceParser1 = mock(ResourceReferenceParser.class, new ViolatedAssumptionAnswer());
      Injector.inject(docBookParser0, (Class<?>) AbstractDoxiaParser.class, "linkReferenceParser", (Object) resourceReferenceParser1);
      XHTMLParser xHTMLParser0 = new XHTMLParser();
      Provider<DocBookParser> provider0 = (Provider<DocBookParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<UserComponentManager> entityReferenceSerializer0 = (EntityReferenceSerializer<UserComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Syntax syntax0 = Syntax.TEX_1_0;
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      XWikiContext xWikiContext3 = xWikiContext2.clone();
      XWikiContext xWikiContext4 = xWikiContext3.clone();
      XWikiContext xWikiContext5 = xWikiContext4.clone();
      XWikiContext xWikiContext6 = xWikiContext5.clone();
      XWikiContext xWikiContext7 = xWikiContext6.clone();
      xWikiContext7.getWikiReference();
      // Undeclared exception!
      defaultContentParser0.parse("?iQ6%niyjOLGm*=", syntax0, (EntityReference) null);
  }
}
