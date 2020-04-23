/*

 * Tue Apr 21 14:24:50 UTC 2020
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
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.add(defaultExtensionPlanNode0);
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.contains(defaultExtensionPlanNode1);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.equals(defaultExtensionPlanNode1);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.size();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.indexOf((Object) abstractInstallPlanJob_ModifableExtensionPlanTree0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.addAll(abstractInstallPlanJob_ModifableExtensionPlanTree0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.equals(defaultExtensionPlanNode1);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}
