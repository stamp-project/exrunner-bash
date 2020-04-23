/*

 * Tue Apr 21 14:17:35 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.version.VersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      ExtensionId extensionId0 = new ExtensionId("$!K9c", "3p~");
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "(");
      TreeSet<InstalledExtension> treeSet0 = new TreeSet<InstalledExtension>();
      ExtensionPlanAction.Action extensionPlanAction_Action0 = ExtensionPlanAction.Action.DOWNGRADE;
      DefaultExtensionPlanAction defaultExtensionPlanAction0 = new DefaultExtensionPlanAction(emptyExtension0, treeSet0, extensionPlanAction_Action0, "Value", false);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode(defaultExtensionPlanAction0, (VersionConstraint) null);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.indexOf((ExtensionPlanNode) defaultExtensionPlanNode0, 0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.listIterator(0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.retainAll(treeSet0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(defaultExtensionPlanNode0);
      ArrayDeque<DefaultExtensionPlanNode> arrayDeque0 = new ArrayDeque<DefaultExtensionPlanNode>();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addAllAbsent(arrayDeque0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
