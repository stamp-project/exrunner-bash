/*

 * Tue Apr 21 18:30:21 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.inject.internal.MoreTypes;
import java.lang.reflect.Type;
import java.util.Map;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.Fidelity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.VerbatimBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      VerbatimBlock verbatimBlock0 = new VerbatimBlock("", false);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(9999).when(tocMacroParameters0).getDepth();
      doReturn("").when(tocMacroParameters0).getReference();
      doReturn(tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(9999).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Fidelity fidelity0 = Fidelity.FIDELITY_TRUE;
      Class<? extends Attribute> class0 = fidelity0.getCategory();
      MoreTypes.GenericArrayTypeImpl moreTypes_GenericArrayTypeImpl0 = new MoreTypes.GenericArrayTypeImpl(class0);
      Map<String, String> map0 = embeddableComponentManager0.getInstanceMap((Type) moreTypes_GenericArrayTypeImpl0);
      MacroBlock macroBlock0 = new MacroBlock("", map0, false);
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      doReturn(macroBlock0).when(macroTransformationContext0).getCurrentMacroBlock();
      // Undeclared exception!
      treeParametersBuilder0.build(verbatimBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}
