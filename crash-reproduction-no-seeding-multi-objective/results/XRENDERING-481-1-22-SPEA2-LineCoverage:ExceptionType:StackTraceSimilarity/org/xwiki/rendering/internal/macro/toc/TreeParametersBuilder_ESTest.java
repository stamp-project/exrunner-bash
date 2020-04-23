/*

 * Tue Apr 21 17:25:41 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.BulletedListBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.SectionBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.util.IdGenerator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn("0}dP7.>]Tr7").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(59).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      LinkedList<Block> linkedList0 = new LinkedList<Block>();
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      BulletedListBlock bulletedListBlock0 = new BulletedListBlock(linkedList0, map0);
      Map<String, String> map1 = bulletedListBlock0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("0}dP7.>]Tr7", map1, "", true);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      Vector<SectionBlock> vector0 = new Vector<SectionBlock>();
      XDOM xDOM0 = new XDOM(vector0, (IdGenerator) null, (MetaData) null);
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      // Undeclared exception!
      treeParametersBuilder0.build(block0, tocMacroParameters0, macroTransformationContext0);
  }
}
