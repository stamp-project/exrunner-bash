/*

 * Tue Apr 21 16:29:01 UTC 2020
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
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.rendering.block.ExpandedMacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.internal.renderer.AbstractBlockRenderer;
import org.xwiki.rendering.internal.renderer.xwiki21.XWikiSyntaxBlockRenderer;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.renderer.PrintRendererFactory;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      XWikiSyntaxBlockRenderer xWikiSyntaxBlockRenderer0 = new XWikiSyntaxBlockRenderer();
      PrintRendererFactory printRendererFactory0 = mock(PrintRendererFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiSyntaxBlockRenderer0, (Class<?>) XWikiSyntaxBlockRenderer.class, "xwikiSyntaxRendererFactory", (Object) printRendererFactory0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiSyntaxBlockRenderer0, (Class<?>) AbstractBlockRenderer.class, "logger", (Object) logger0);
      Injector.validateBean(xWikiSyntaxBlockRenderer0, (Class<?>) XWikiSyntaxBlockRenderer.class);
      boolean boolean0 = false;
      ExpandedMacroBlock expandedMacroBlock0 = new ExpandedMacroBlock("9oR", diamondIterableMapMRO0, xWikiSyntaxBlockRenderer0, false);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(2735).when(tocMacroParameters0).getDepth();
      doReturn("Q-4,&SI0OVG2(e($5ak").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(expandedMacroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(expandedMacroBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}
