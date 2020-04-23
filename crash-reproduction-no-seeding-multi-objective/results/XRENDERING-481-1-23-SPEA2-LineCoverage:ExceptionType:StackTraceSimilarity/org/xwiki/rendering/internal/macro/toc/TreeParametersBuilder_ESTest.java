/*

 * Tue Apr 21 17:33:54 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.IdBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      IdBlock idBlock0 = new IdBlock("i5RsEo");
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn("i5RsEo").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      tocMacroParameters1.setNumbered(true);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      treeParametersBuilder0.build(idBlock0, tocMacroParameters1, macroTransformationContext0);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      macroTransformationContext0.setId("{i&>nh_p9:LNB~O{");
      MacroBlock macroBlock0 = new MacroBlock("{i&>nh_p9:LNB~O{", map0, "i5RsEo", false);
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext1).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(idBlock0, tocMacroParameters0, macroTransformationContext1);
  }
}
