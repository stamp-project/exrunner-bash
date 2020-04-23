/*

 * Mon Apr 20 19:17:39 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.confluence.ConfluenceParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.internal.parser.jspwiki.JSPWikiParser;
import org.xwiki.rendering.internal.parser.twiki.TWikiParser;
import org.xwiki.rendering.internal.parser.xwiki20.XWiki20Parser;
import org.xwiki.rendering.internal.parser.xwiki21.XWiki21Parser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWiki21Parser xWiki21Parser0 = new XWiki21Parser();
      XWiki20Parser xWiki20Parser0 = new XWiki20Parser();
      ConfluenceParser confluenceParser0 = new ConfluenceParser();
      JSPWikiParser jSPWikiParser0 = new JSPWikiParser();
      xWiki21Parser0.getImageReferenceParser();
      Injector.inject(jSPWikiParser0, (Class<?>) JSPWikiParser.class, "imageReferenceParser", (Object) null);
      CreoleParser creoleParser0 = new CreoleParser();
      confluenceParser0.getImageReferenceParser();
      Syntax syntax0 = Syntax.TEX_1_0;
      LocalDocumentReference localDocumentReference0 = (LocalDocumentReference)XWikiDocument.COMMENTSCLASS_REFERENCE;
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<TWikiParser> provider0 = (Provider<TWikiParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<Object> entityReferenceSerializer0 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      // Undeclared exception!
      defaultContentParser0.parse("Mask", syntax0);
  }
}
