/*

 * Tue Apr 21 14:21:18 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree1.removeIf(predicate0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.toString();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addAll(0, (Collection<? extends ExtensionPlanNode>) abstractInstallPlanJob_ModifableExtensionPlanTree1);
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree1.addIfAbsent(extensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.addAllAbsent(abstractInstallPlanJob_ModifableExtensionPlanTree0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.containsAll(abstractInstallPlanJob_ModifableExtensionPlanTree1);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.listIterator(0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<DefaultExtensionPlanNode> priorityQueue0 = new PriorityQueue<DefaultExtensionPlanNode>();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addAll(abstractInstallPlanJob_ModifableExtensionPlanTree1);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.size();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.listIterator();
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}
