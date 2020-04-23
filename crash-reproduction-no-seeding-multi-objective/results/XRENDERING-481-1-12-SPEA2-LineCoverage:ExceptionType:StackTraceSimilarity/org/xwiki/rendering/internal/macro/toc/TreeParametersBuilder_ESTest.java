/*

 * Tue Apr 21 16:04:54 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.filter.xml.serializer.XMLSerializerFactory;
import org.xwiki.rendering.block.ExpandedMacroBlock;
import org.xwiki.rendering.block.SpecialSymbolBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.internal.renderer.AbstractBlockRenderer;
import org.xwiki.rendering.internal.renderer.xhtml.AnnotatedXHTMLBlockRenderer;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.xdomxmlcurrent.internal.renderer.XDOMXMLRenderer;
import org.xwiki.rendering.xml.internal.renderer.AbstractStreamRendererFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      SpecialSymbolBlock specialSymbolBlock0 = new SpecialSymbolBlock('\'');
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(8839).when(tocMacroParameters0).getDepth();
      doReturn("").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(8839).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      AnnotatedXHTMLBlockRenderer annotatedXHTMLBlockRenderer0 = new AnnotatedXHTMLBlockRenderer();
      XDOMXMLRenderer xDOMXMLRenderer0 = new XDOMXMLRenderer();
      XMLSerializerFactory xMLSerializerFactory0 = mock(XMLSerializerFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class, "serializerFactory", (Object) xMLSerializerFactory0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("");
      Injector.inject(xDOMXMLRenderer0, (Class<?>) AbstractStreamRendererFactory.class, "componentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class);
      Injector.inject(annotatedXHTMLBlockRenderer0, (Class<?>) AnnotatedXHTMLBlockRenderer.class, "annotatedXHTMLRendererFactory", (Object) xDOMXMLRenderer0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(annotatedXHTMLBlockRenderer0, (Class<?>) AbstractBlockRenderer.class, "logger", (Object) logger0);
      Injector.validateBean(annotatedXHTMLBlockRenderer0, (Class<?>) AnnotatedXHTMLBlockRenderer.class);
      ExpandedMacroBlock expandedMacroBlock0 = new ExpandedMacroBlock("Failed to parse input source", map0, annotatedXHTMLBlockRenderer0, false);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(expandedMacroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      SpecialSymbolBlock specialSymbolBlock1 = new SpecialSymbolBlock('\'');
      // Undeclared exception!
      treeParametersBuilder0.build(specialSymbolBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}
