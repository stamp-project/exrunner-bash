/*

 * Tue Apr 21 17:54:42 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.EmptyLinesBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;
import org.xwiki.rendering.util.IdGenerator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TocMacro_ESTest extends TocMacro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TocMacro tocMacro0 = new TocMacro();
      LinkLabelGenerator linkLabelGenerator0 = mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator0);
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
      Provider<EmptyLinesBlock> provider0 = (Provider<EmptyLinesBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((EmptyLinesBlock) null).when(provider0).get();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TransformationContext transformationContext0 = new TransformationContext();
      IdGenerator idGenerator0 = new IdGenerator();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      MacroBlock macroBlock0 = new MacroBlock("", hashtable0, false);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext0);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "", macroTransformationContext0);
  }
}
