/*

 * Tue Apr 21 15:08:27 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javatests.DiamondIterableMapMRO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.SpecialSymbolBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      SpecialSymbolBlock specialSymbolBlock0 = new SpecialSymbolBlock('<');
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2790)).when(tocMacroParameters0).getDepth();
      doReturn("Only one series for contour").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(2149).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      MacroTransformationContext macroTransformationContext0 = null;
      treeParametersBuilder0.build(specialSymbolBlock0, tocMacroParameters1, (MacroTransformationContext) null);
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      MacroBlock macroBlock0 = new MacroBlock((String) null, diamondIterableMapMRO0, "Zoom", true);
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext1).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(specialSymbolBlock0, tocMacroParameters0, macroTransformationContext1);
  }
}
