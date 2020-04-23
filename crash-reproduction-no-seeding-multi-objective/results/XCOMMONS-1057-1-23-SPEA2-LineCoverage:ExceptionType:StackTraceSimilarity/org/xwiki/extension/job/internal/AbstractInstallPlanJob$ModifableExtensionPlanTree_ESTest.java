/*

 * Tue Apr 21 14:27:33 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.test.EmptyExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.removeAll(abstractInstallPlanJob_ModifableExtensionPlanTree1);
      UnaryOperator.identity();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      defaultExtensionPlanNode0.toString();
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode(defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(0, (ExtensionPlanNode) defaultExtensionPlanNode1);
      ExtensionId extensionId0 = new ExtensionId("\"");
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "/");
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<InstalledExtension> priorityQueue0 = new PriorityQueue<InstalledExtension>(comparator0);
      ExtensionPlanAction.Action extensionPlanAction_Action0 = ExtensionPlanAction.Action.NONE;
      String string0 = "5dCcP97,R2";
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
