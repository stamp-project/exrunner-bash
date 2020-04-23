/*

 * Tue Apr 21 14:52:30 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.NewLineBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder1 = new TreeParametersBuilder();
      NewLineBlock newLineBlock0 = new NewLineBlock();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.PAGE;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(63).when(tocMacroParameters0).getDepth();
      doReturn("END_LINK").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(63).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      treeParametersBuilder1.build(newLineBlock0, tocMacroParameters0, macroTransformationContext0);
      TreeParametersBuilder treeParametersBuilder2 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder3 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder4 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder5 = new TreeParametersBuilder();
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters1 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(63).when(tocMacroParameters1).getDepth();
      doReturn("").when(tocMacroParameters1).getReference();
      doReturn(tocMacroParameters_Scope1).when(tocMacroParameters1).getScope();
      doReturn(1).when(tocMacroParameters1).getStart();
      doReturn(false).when(tocMacroParameters1).isCustomStart();
      doReturn(true).when(tocMacroParameters1).isNumbered();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      MacroBlock macroBlock0 = new MacroBlock("B", hashtable0, false);
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext1).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder2.build(block0, tocMacroParameters1, macroTransformationContext1);
  }
}
