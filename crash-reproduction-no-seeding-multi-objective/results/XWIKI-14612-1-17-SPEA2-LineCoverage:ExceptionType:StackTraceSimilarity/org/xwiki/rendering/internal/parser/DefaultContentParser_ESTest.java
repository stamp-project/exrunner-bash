/*

 * Mon Apr 20 19:14:57 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.filter.xml.serializer.XMLSerializerFactory;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.xdomxmlcurrent.internal.renderer.XDOMXMLRenderer;
import org.xwiki.rendering.xml.internal.renderer.AbstractStreamRendererFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      String string0 = "source";
      XDOMXMLRenderer xDOMXMLRenderer0 = new XDOMXMLRenderer();
      XMLSerializerFactory xMLSerializerFactory0 = mock(XMLSerializerFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class, "serializerFactory", (Object) xMLSerializerFactory0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager((String) null);
      Injector.inject(xDOMXMLRenderer0, (Class<?>) AbstractStreamRendererFactory.class, "componentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class);
      Syntax syntax0 = xDOMXMLRenderer0.getSyntax();
      // Undeclared exception!
      defaultContentParser0.parse("Vh~", syntax0);
  }
}
