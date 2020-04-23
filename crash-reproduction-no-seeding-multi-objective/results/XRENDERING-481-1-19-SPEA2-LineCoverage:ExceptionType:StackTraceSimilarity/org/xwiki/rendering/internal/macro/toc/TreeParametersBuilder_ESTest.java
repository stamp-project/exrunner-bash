/*

 * Tue Apr 21 17:01:50 UTC 2020
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
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Block block0 = null;
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(2009).when(tocMacroParameters0).getDepth();
      doReturn("twiki").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0, tocMacroParameters_Scope1).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(true).when(tocMacroParameters0).isNumbered();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      treeParametersBuilder0.build((Block) null, tocMacroParameters1, macroTransformationContext0);
      MacroBlock macroBlock0 = new MacroBlock("twiki", diamondIterableMapMRO0, "", false);
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext1).getCurrentMacroBlock();
      doReturn((XDOM) null).when(macroTransformationContext1).getXDOM();
      // Undeclared exception!
      treeParametersBuilder0.build((Block) null, tocMacroParameters0, macroTransformationContext1);
  }
}
