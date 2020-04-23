/*

 * Tue Apr 21 17:41:56 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import java.util.Map;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.PDLOverrideSupported;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(tocMacroParameters0).getDepth();
      doReturn("}y0\"pa\nn^F(0s!R_j").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn((-345)).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(true).when(tocMacroParameters0).isNumbered();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("");
      PDLOverrideSupported pDLOverrideSupported0 = PDLOverrideSupported.NOT_ATTEMPTED;
      Class<? extends Attribute> class0 = pDLOverrideSupported0.getCategory();
      Map<String, String> map0 = embeddableComponentManager0.getInstanceMap((Type) class0);
      MacroBlock macroBlock0 = new MacroBlock("}y0\"pa\nn^F(0s!R_j", map0, true);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(block0, tocMacroParameters0, macroTransformationContext0);
  }
}
