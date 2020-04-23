/*

 * Tue Apr 21 14:29:05 UTC 2020
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
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.wrap.WrappingInstalledExtension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      WrappingInstalledExtension<InstalledExtension> wrappingInstalledExtension0 = (WrappingInstalledExtension<InstalledExtension>) mock(WrappingInstalledExtension.class, new ViolatedAssumptionAnswer());
      WrappingInstalledExtension<WrappingInstalledExtension<InstalledExtension>> wrappingInstalledExtension1 = new WrappingInstalledExtension<WrappingInstalledExtension<InstalledExtension>>(wrappingInstalledExtension0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.lastIndexOf((Object) wrappingInstalledExtension1);
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(extensionPlanNode0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
