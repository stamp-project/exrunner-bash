/*

 * Tue Apr 21 15:41:18 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import java.util.LinkedList;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.LinkBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.QuotationBlock;
import org.xwiki.rendering.block.TableBlock;
import org.xwiki.rendering.block.XDOM;
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
      Provider<TableBlock> provider0 = (Provider<TableBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((TableBlock) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      ComponentDescriptor<QuotationBlock> componentDescriptor0 = (ComponentDescriptor<QuotationBlock>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      String string0 = "";
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(2147).when(tocMacroParameters0).getDepth();
      doReturn((String) null, "").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0, (TocMacroParameters.Scope) null).when(tocMacroParameters0).getScope();
      doReturn(2147).when(tocMacroParameters0).getStart();
      doReturn(true).when(tocMacroParameters0).isNumbered();
      LinkedList<LinkBlock> linkedList0 = new LinkedList<LinkBlock>();
      XDOM xDOM0 = new XDOM(linkedList0);
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      MacroBlock macroBlock0 = new MacroBlock("gauges", hashtable0, "", true);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "gauges", macroTransformationContext0);
  }
}
