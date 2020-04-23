/*

 * Tue Apr 21 14:53:51 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.MacroMarkerBlock;
import org.xwiki.rendering.block.MetaDataBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.util.IdGenerator;
import org.xwiki.xml.internal.html.DefaultHTMLCleanerConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TocMacro_ESTest extends TocMacro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TocMacro tocMacro0 = new TocMacro();
      LinkLabelGenerator linkLabelGenerator0 = mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator0);
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
      Provider<MetaDataBlock> provider0 = (Provider<MetaDataBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((MetaDataBlock) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      ComponentDescriptor<Object> componentDescriptor0 = (ComponentDescriptor<Object>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn((String) null, "").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0, tocMacroParameters_Scope1).when(tocMacroParameters0).getScope();
      doReturn((-35)).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(true).when(tocMacroParameters0).isNumbered();
      ArrayList<MacroMarkerBlock> arrayList0 = new ArrayList<MacroMarkerBlock>();
      IdGenerator idGenerator0 = new IdGenerator();
      XDOM xDOM0 = new XDOM(arrayList0, idGenerator0);
      DefaultHTMLCleanerConfiguration defaultHTMLCleanerConfiguration0 = new DefaultHTMLCleanerConfiguration();
      Map<String, String> map0 = defaultHTMLCleanerConfiguration0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock((String) null, map0, true);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      doReturn(xDOM0).when(macroTransformationContext0).getXDOM();
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "Tiger", macroTransformationContext0);
  }
}
