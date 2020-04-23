/*

 * Tue Apr 21 14:15:53 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.version.VersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.toString();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.toArray();
      ExtensionPlanAction extensionPlanAction0 = mock(ExtensionPlanAction.class, new ViolatedAssumptionAnswer());
      VersionConstraint versionConstraint0 = mock(VersionConstraint.class, new ViolatedAssumptionAnswer());
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode(extensionPlanAction0, versionConstraint0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.lastIndexOf((Object) defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.addIfAbsent(defaultExtensionPlanNode0);
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree2 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode();
      abstractInstallPlanJob_ModifableExtensionPlanTree2.indexOf((Object) defaultExtensionPlanNode1);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(defaultExtensionPlanNode0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}
