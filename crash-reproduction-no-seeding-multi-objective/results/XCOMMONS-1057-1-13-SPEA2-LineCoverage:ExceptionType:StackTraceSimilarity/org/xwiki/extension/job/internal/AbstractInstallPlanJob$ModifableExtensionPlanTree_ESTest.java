/*

 * Tue Apr 21 14:16:46 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      UnaryOperator<ExtensionPlanNode> unaryOperator0 = (UnaryOperator<ExtensionPlanNode>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.replaceAll(unaryOperator0);
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(extensionPlanNode0);
      ExtensionPlanNode extensionPlanNode1 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree1.add(extensionPlanNode1);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}
