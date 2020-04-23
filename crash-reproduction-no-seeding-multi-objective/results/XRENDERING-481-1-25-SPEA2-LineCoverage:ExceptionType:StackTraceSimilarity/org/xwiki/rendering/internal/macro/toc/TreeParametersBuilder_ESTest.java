/*

 * Tue Apr 21 17:50:16 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.ExpandedMacroBlock;
import org.xwiki.rendering.block.QuotationBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.renderer.BlockRenderer;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Stack<Block> stack0 = new Stack<Block>();
      QuotationBlock quotationBlock0 = new QuotationBlock(stack0);
      stack0.trimToSize();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2745)).when(tocMacroParameters0).getDepth();
      doReturn("").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("");
      Class<Integer> class0 = Integer.TYPE;
      Class class1 = RegularTimePeriod.downsize(class0);
      Map<String, String> map0 = embeddableComponentManager0.getInstanceMap((Type) class1);
      ExpandedMacroBlock expandedMacroBlock0 = new ExpandedMacroBlock("", map0, (BlockRenderer) null, false);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(expandedMacroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(quotationBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}
