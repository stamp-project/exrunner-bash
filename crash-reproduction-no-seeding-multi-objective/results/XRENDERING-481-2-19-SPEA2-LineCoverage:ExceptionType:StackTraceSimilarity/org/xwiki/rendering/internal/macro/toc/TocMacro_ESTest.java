/*

 * Tue Apr 21 17:02:01 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.ImageBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.MetaDataBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TocMacro_ESTest extends TocMacro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TocMacro tocMacro0 = new TocMacro();
      LinkLabelGenerator linkLabelGenerator0 = mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator0);
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      macroTransformationContext0.getXDOM();
      Provider<MetaDataBlock> provider0 = (Provider<MetaDataBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((XDOM) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      ComponentDescriptor<ImageBlock> componentDescriptor0 = (ComponentDescriptor<ImageBlock>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      tocMacro0.supportsInlineMode();
      tocMacro0.getPriority();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(2000).when(tocMacroParameters0).getDepth();
      doReturn((String) null, "").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0, tocMacroParameters_Scope1).when(tocMacroParameters0).getScope();
      doReturn(2000).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      MacroTransformationContext macroTransformationContext1 = macroTransformationContext0.clone();
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      MacroBlock macroBlock0 = new MacroBlock("", map0, "", false);
      macroTransformationContext1.setCurrentMacroBlock(macroBlock0);
      macroTransformationContext1.setXDOM((XDOM) null);
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, (String) null, macroTransformationContext1);
  }
}
