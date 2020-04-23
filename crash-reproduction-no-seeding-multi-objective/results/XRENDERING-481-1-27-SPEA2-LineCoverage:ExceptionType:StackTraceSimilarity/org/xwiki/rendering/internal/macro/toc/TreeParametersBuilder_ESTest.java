/*

 * Tue Apr 21 18:06:05 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.filter.xml.serializer.XMLSerializerFactory;
import org.xwiki.rendering.block.HorizontalLineBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.VerbatimBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.internal.renderer.AbstractBlockRenderer;
import org.xwiki.rendering.internal.renderer.xhtml.XHTMLBlockRenderer;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.xdomxmlcurrent.internal.renderer.XDOMXMLRenderer;
import org.xwiki.rendering.xml.internal.renderer.AbstractStreamRendererFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder1 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder2 = new TreeParametersBuilder();
      VerbatimBlock verbatimBlock0 = new VerbatimBlock("%;(I", false);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(8818).when(tocMacroParameters0).getDepth();
      doReturn(":T'`&5^F9 B^+qU").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn((-871)).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      treeParametersBuilder0.build(verbatimBlock0, tocMacroParameters0, macroTransformationContext0);
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HorizontalLineBlock horizontalLineBlock0 = new HorizontalLineBlock(hashtable0);
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters1 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1475)).when(tocMacroParameters1).getDepth();
      doReturn(":T'`&5^F9 B^+qU").when(tocMacroParameters1).getReference();
      doReturn(tocMacroParameters_Scope1).when(tocMacroParameters1).getScope();
      doReturn(2085).when(tocMacroParameters1).getStart();
      doReturn(false).when(tocMacroParameters1).isCustomStart();
      doReturn(false).when(tocMacroParameters1).isNumbered();
      MacroBlock macroBlock0 = new MacroBlock("%;(I", hashtable0, false);
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext1).getCurrentMacroBlock();
      XHTMLBlockRenderer xHTMLBlockRenderer0 = new XHTMLBlockRenderer();
      XDOMXMLRenderer xDOMXMLRenderer0 = new XDOMXMLRenderer();
      XMLSerializerFactory xMLSerializerFactory0 = mock(XMLSerializerFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class, "serializerFactory", (Object) xMLSerializerFactory0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager(":T'`&5^F9 B^+qU");
      Injector.inject(xDOMXMLRenderer0, (Class<?>) AbstractStreamRendererFactory.class, "componentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class);
      Injector.inject(xHTMLBlockRenderer0, (Class<?>) XHTMLBlockRenderer.class, "xhtmlRendererFactory", (Object) xDOMXMLRenderer0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(xHTMLBlockRenderer0, (Class<?>) AbstractBlockRenderer.class, "logger", (Object) logger0);
      Injector.validateBean(xHTMLBlockRenderer0, (Class<?>) XHTMLBlockRenderer.class);
      MacroTransformationContext macroTransformationContext2 = new MacroTransformationContext();
      macroTransformationContext2.clone();
      // Undeclared exception!
      treeParametersBuilder2.build(verbatimBlock0, tocMacroParameters1, macroTransformationContext1);
  }
}
