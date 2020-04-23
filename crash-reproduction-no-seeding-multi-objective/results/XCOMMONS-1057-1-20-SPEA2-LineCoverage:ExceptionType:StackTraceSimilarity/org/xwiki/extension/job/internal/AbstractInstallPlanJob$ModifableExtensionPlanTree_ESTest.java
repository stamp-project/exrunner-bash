/*

 * Tue Apr 21 14:23:59 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
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
      abstractInstallPlanJob_ModifableExtensionPlanTree0.spliterator();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ExtensionId extensionId0 = null;
      EmptyExtension emptyExtension0 = new EmptyExtension((ExtensionId) null, (String) null);
      TreeSet<InstalledExtension> treeSet0 = new TreeSet<InstalledExtension>(comparator0);
      ExtensionPlanAction.Action extensionPlanAction_Action0 = ExtensionPlanAction.Action.DOWNGRADE;
      treeSet0.descendingIterator();
      DefaultExtensionPlanAction defaultExtensionPlanAction0 = new DefaultExtensionPlanAction(emptyExtension0, treeSet0, extensionPlanAction_Action0, "", false);
      DefaultVersion defaultVersion0 = new DefaultVersion("");
      DefaultVersionConstraint defaultVersionConstraint0 = new DefaultVersionConstraint(defaultVersion0);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode(defaultExtensionPlanAction0, defaultVersionConstraint0);
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode(defaultExtensionPlanNode0);
      defaultExtensionPlanNode1.getChildren();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(defaultExtensionPlanNode1);
      defaultVersionConstraint0.isCompatible(defaultVersion0);
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.containsAll(treeSet0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
