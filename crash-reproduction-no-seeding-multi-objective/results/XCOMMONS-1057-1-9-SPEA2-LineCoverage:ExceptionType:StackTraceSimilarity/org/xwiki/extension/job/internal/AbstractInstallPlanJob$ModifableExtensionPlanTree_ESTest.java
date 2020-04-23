/*

 * Tue Apr 21 14:12:46 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.extension.Extension;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.test.EmptyExtension;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.version.internal.DefaultVersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.parallelStream();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
      DefaultVersion defaultVersion0 = new DefaultVersion("net.topology.node.switch.mapping.impl");
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(defaultExtensionPlanNode0);
      DefaultVersion defaultVersion1 = new DefaultVersion(defaultVersion0);
      ExtensionId extensionId0 = new ExtensionId("net.topology.node.switch.mapping.impl", defaultVersion1);
      EmptyExtension emptyExtension0 = new EmptyExtension(extensionId0, "net.topology.node.switch.mapping.impl");
      PriorityQueue<DefaultExtensionPlanNode> priorityQueue0 = new PriorityQueue<DefaultExtensionPlanNode>();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree2 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree2.containsAll(abstractInstallPlanJob_ModifableExtensionPlanTree0);
      ExtensionId extensionId1 = new ExtensionId("2", "net.topology.node.switch.mapping.impl");
      priorityQueue0.retainAll(abstractInstallPlanJob_ModifableExtensionPlanTree0);
      ExtensionId extensionId2 = new ExtensionId("topology.script.number.args", defaultVersion0);
      DefaultVersionConstraint defaultVersionConstraint0 = new DefaultVersionConstraint("_");
      abstractInstallPlanJob_ModifableExtensionPlanTree2.toString();
      LinkedList<InstalledExtension> linkedList0 = new LinkedList<InstalledExtension>();
      ExtensionPlanAction.Action extensionPlanAction_Action0 = ExtensionPlanAction.Action.NONE;
      DefaultExtensionPlanAction defaultExtensionPlanAction0 = new DefaultExtensionPlanAction((Extension) null, linkedList0, extensionPlanAction_Action0, "", true);
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode(defaultExtensionPlanAction0, abstractInstallPlanJob_ModifableExtensionPlanTree2, defaultVersionConstraint0);
      ExtensionPlanAction.Action extensionPlanAction_Action1 = ExtensionPlanAction.Action.DOWNGRADE;
      DefaultExtensionPlanAction defaultExtensionPlanAction1 = new DefaultExtensionPlanAction(emptyExtension0, linkedList0, extensionPlanAction_Action1, "[]", false);
      DefaultExtensionPlanNode defaultExtensionPlanNode2 = new DefaultExtensionPlanNode(defaultExtensionPlanAction1, defaultVersionConstraint0);
      priorityQueue0.add(defaultExtensionPlanNode2);
      abstractInstallPlanJob_ModifableExtensionPlanTree2.clone();
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
