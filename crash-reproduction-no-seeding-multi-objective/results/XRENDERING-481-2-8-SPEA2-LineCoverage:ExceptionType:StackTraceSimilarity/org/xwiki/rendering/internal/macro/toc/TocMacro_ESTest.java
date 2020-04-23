/*

 * Tue Apr 21 15:33:33 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Container;
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
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.BulletedListBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.RawBlock;
import org.xwiki.rendering.block.SpecialSymbolBlock;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
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
      Provider<Container> provider0 = (Provider<Container>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Container) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      ComponentDescriptor<SpecialSymbolBlock> componentDescriptor0 = (ComponentDescriptor<SpecialSymbolBlock>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      String string0 = null;
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn((-5534)).when(tocMacroParameters0).getDepth();
      doReturn((String) null, (String) null).when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0, tocMacroParameters_Scope1).when(tocMacroParameters0).getScope();
      doReturn((-5534)).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(true).when(tocMacroParameters0).isNumbered();
      ArrayList<RawBlock> arrayList0 = new ArrayList<RawBlock>();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      ArrayList<Block> arrayList1 = new ArrayList<Block>();
      BulletedListBlock bulletedListBlock0 = new BulletedListBlock(arrayList1);
      Map<String, String> map0 = bulletedListBlock0.getParameters();
      arrayList1.add((Block) bulletedListBlock0);
      arrayList1.clone();
      MacroBlock macroBlock0 = new MacroBlock("Navigation", map0, false);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      MacroTransformationContext macroTransformationContext1 = macroTransformationContext0.clone();
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "algorithm identifier ", macroTransformationContext1);
  }
}
