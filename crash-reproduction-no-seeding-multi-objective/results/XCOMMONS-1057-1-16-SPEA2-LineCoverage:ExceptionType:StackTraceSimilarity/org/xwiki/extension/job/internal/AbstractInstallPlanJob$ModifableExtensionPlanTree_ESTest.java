/*

 * Tue Apr 21 14:20:10 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.version.VersionRangeCollection;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.version.internal.DefaultVersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.toArray();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree2 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-1));
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree3 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      DefaultVersion defaultVersion0 = new DefaultVersion("JQG1J?C0pjWf");
      DefaultVersion defaultVersion1 = new DefaultVersion(defaultVersion0);
      defaultVersion0.compareTo("JQG1J?C0pjWf");
      ExtensionId extensionId0 = new ExtensionId("JQG1J?C0pjWf", defaultVersion1);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "JQG1J?C0pjWf");
      ArrayDeque<InstalledExtension> arrayDeque0 = new ArrayDeque<InstalledExtension>();
      ExtensionPlanAction.Action extensionPlanAction_Action0 = ExtensionPlanAction.Action.DOWNGRADE;
      DefaultExtensionPlanAction defaultExtensionPlanAction0 = new DefaultExtensionPlanAction(emptyExtension0, arrayDeque0, extensionPlanAction_Action0, "", false);
      DefaultVersionConstraint defaultVersionConstraint0 = new DefaultVersionConstraint(defaultVersion1);
      Collection<VersionRangeCollection> collection0 = defaultVersionConstraint0.getRanges();
      DefaultVersionConstraint defaultVersionConstraint1 = new DefaultVersionConstraint(collection0, defaultVersion1);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode(defaultExtensionPlanAction0, abstractInstallPlanJob_ModifableExtensionPlanTree0, defaultVersionConstraint1);
      abstractInstallPlanJob_ModifableExtensionPlanTree2.addIfAbsent(defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree2.clone();
  }
}
