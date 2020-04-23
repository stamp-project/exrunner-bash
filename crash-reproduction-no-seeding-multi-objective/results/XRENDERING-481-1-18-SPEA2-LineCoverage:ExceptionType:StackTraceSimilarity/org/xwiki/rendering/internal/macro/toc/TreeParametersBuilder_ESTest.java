/*

 * Tue Apr 21 16:53:19 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Vector;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobImpressions;
import javax.print.attribute.standard.JobKOctets;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.filter.xml.serializer.XMLSerializerFactory;
import org.xwiki.rendering.block.ExpandedMacroBlock;
import org.xwiki.rendering.block.SectionBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.internal.renderer.AbstractBlockRenderer;
import org.xwiki.rendering.internal.renderer.xhtml.XHTMLBlockRenderer;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.util.IdGenerator;
import org.xwiki.rendering.xdomxmlcurrent.internal.renderer.XDOMXMLRenderer;
import org.xwiki.rendering.xml.internal.renderer.AbstractStreamRendererFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Vector<SectionBlock> vector0 = new Vector<SectionBlock>();
      IdGenerator idGenerator0 = mock(IdGenerator.class, new ViolatedAssumptionAnswer());
      XDOM xDOM0 = new XDOM(vector0, idGenerator0);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn("m2&\"h^;.qj>v%Ot").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      JobKOctets jobKOctets0 = new JobKOctets(0);
      JobImpressions jobImpressions0 = new JobImpressions(0);
      Class<? extends Attribute> class0 = jobImpressions0.getCategory();
      embeddableComponentManager0.getComponentDescriptor((Type) class0, "");
      Class<? extends Attribute> class1 = jobKOctets0.getCategory();
      Map<String, String> map0 = embeddableComponentManager0.getInstanceMap((Type) class1);
      XHTMLBlockRenderer xHTMLBlockRenderer0 = new XHTMLBlockRenderer();
      XDOMXMLRenderer xDOMXMLRenderer0 = new XDOMXMLRenderer();
      XMLSerializerFactory xMLSerializerFactory0 = mock(XMLSerializerFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class, "serializerFactory", (Object) xMLSerializerFactory0);
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager("");
      Injector.inject(xDOMXMLRenderer0, (Class<?>) AbstractStreamRendererFactory.class, "componentManager", (Object) embeddableComponentManager1);
      Injector.validateBean(xDOMXMLRenderer0, (Class<?>) XDOMXMLRenderer.class);
      Injector.inject(xHTMLBlockRenderer0, (Class<?>) XHTMLBlockRenderer.class, "xhtmlRendererFactory", (Object) xDOMXMLRenderer0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(xHTMLBlockRenderer0, (Class<?>) AbstractBlockRenderer.class, "logger", (Object) logger0);
      Injector.validateBean(xHTMLBlockRenderer0, (Class<?>) XHTMLBlockRenderer.class);
      ExpandedMacroBlock expandedMacroBlock0 = new ExpandedMacroBlock("", map0, xHTMLBlockRenderer0, false);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(expandedMacroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(xDOM0, tocMacroParameters0, macroTransformationContext0);
  }
}
