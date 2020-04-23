/*

 * Tue Apr 21 14:28:12 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.spliterator();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) abstractInstallPlanJob_ModifableExtensionPlanTree0;
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree2 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree2.clone();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree3 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree2.clone();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree4 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree4.equals(abstractInstallPlanJob_ModifableExtensionPlanTree3);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(defaultExtensionPlanNode0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
