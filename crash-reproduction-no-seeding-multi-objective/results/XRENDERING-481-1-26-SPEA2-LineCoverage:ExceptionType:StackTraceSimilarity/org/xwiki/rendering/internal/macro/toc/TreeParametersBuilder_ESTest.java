/*

 * Tue Apr 21 17:57:57 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.JapaneseDate;
import java.util.function.BiFunction;
import javatests.DiamondIterableMapMRO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.MetaDataBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      TreeParametersBuilder treeParametersBuilder1 = new TreeParametersBuilder();
      XDOM xDOM0 = XDOM.EMPTY;
      MetaDataBlock metaDataBlock0 = xDOM0.clone();
      int int0 = 0;
      String string0 = "5.0.0";
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn("5.0.0").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn((-842)).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      Syntax syntax0 = Syntax.DOCBOOK_4_4;
      TransformationContext transformationContext0 = new TransformationContext(xDOM0, syntax0);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext0);
      MacroTransformationContext macroTransformationContext1 = macroTransformationContext0.clone();
      treeParametersBuilder0.build(metaDataBlock0, tocMacroParameters1, macroTransformationContext1);
      MacroBlock macroBlock0 = new MacroBlock("", diamondIterableMapMRO0, "5.0.0", true);
      BiFunction<JapaneseDate, JapaneseDate, String> biFunction0 = (BiFunction<JapaneseDate, JapaneseDate, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      diamondIterableMapMRO0.merge(treeParametersBuilder0, metaDataBlock0, biFunction0);
      MacroTransformationContext macroTransformationContext2 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext2).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(metaDataBlock0, tocMacroParameters0, macroTransformationContext2);
  }
}
