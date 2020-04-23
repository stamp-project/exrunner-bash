/*

 * Tue Apr 21 14:23:12 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.UninstallRequest;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.version.VersionRangeCollection;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.version.internal.DefaultVersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UninstallRequest uninstallRequest0 = mock(UninstallRequest.class, new ViolatedAssumptionAnswer());
      UnaryOperator.identity();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      DefaultVersionConstraint defaultVersionConstraint0 = new DefaultVersionConstraint(":~#[,PZ");
      Collection<VersionRangeCollection> collection0 = defaultVersionConstraint0.getRanges();
      DefaultVersion defaultVersion0 = new DefaultVersion(":~#[,PZ");
      DefaultVersion defaultVersion1 = new DefaultVersion(defaultVersion0);
      DefaultVersionConstraint defaultVersionConstraint1 = new DefaultVersionConstraint(collection0, defaultVersion1);
      DefaultVersionConstraint defaultVersionConstraint2 = new DefaultVersionConstraint(defaultVersionConstraint1);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode((ExtensionPlanAction) null, defaultVersionConstraint2);
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode(defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(0, (ExtensionPlanNode) defaultExtensionPlanNode1);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
