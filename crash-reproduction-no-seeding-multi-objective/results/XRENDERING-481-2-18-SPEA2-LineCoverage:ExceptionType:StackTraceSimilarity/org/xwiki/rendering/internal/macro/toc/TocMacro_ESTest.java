/*

 * Tue Apr 21 16:53:49 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import javax.inject.Provider;
import javax.print.attribute.standard.DateTimeAtProcessing;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.ExpandedMacroBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.message.AbstractMessageMacro;
import org.xwiki.rendering.internal.macro.message.ErrorMessageMacro;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.Macro;
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
      ErrorMessageMacro errorMessageMacro0 = new ErrorMessageMacro();
      Macro<DateTimeAtProcessing> macro0 = (Macro<DateTimeAtProcessing>) mock(Macro.class, new ViolatedAssumptionAnswer());
      Injector.inject(errorMessageMacro0, (Class<?>) AbstractMessageMacro.class, "boxMacro", (Object) macro0);
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(errorMessageMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      Provider<ExpandedMacroBlock> provider0 = (Provider<ExpandedMacroBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      BeanManager beanManager1 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager1);
      tocMacro0.setPriority(3664);
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      MacroBlock macroBlock0 = new MacroBlock("HTML", hashtable0, "", true);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "", macroTransformationContext0);
  }
}
