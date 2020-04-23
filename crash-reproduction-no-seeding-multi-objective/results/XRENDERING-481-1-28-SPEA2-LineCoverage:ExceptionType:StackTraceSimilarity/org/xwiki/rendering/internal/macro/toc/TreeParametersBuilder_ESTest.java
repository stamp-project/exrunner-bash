/*

 * Tue Apr 21 18:14:02 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.VerbatimBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder1 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder2 = new TreeParametersBuilder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      VerbatimBlock verbatimBlock0 = new VerbatimBlock("", hashMap0, false);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(8713).when(tocMacroParameters0).getDepth();
      doReturn("jxxqeg!BEYJSksje").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(8713).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      TransformationContext transformationContext0 = new TransformationContext();
      TransformationContext transformationContext1 = transformationContext0.clone();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext1);
      MacroTransformationContext macroTransformationContext1 = macroTransformationContext0.clone();
      treeParametersBuilder0.build(verbatimBlock0, tocMacroParameters1, macroTransformationContext1);
      MacroBlock macroBlock0 = new MacroBlock("jxxqeg!BEYJSksje", hashMap0, "", false);
      MacroTransformationContext macroTransformationContext2 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext2).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(verbatimBlock0, tocMacroParameters0, macroTransformationContext2);
  }
}
