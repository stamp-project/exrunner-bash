/*

 * Tue Apr 21 14:10:42 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
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
      Stream<ExtensionPlanNode> stream0 = abstractInstallPlanJob_ModifableExtensionPlanTree0.stream();
      LinkedList<DefaultExtensionPlanNode> linkedList0 = new LinkedList<DefaultExtensionPlanNode>();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addAll(linkedList0);
      UnaryOperator<ExtensionPlanNode> unaryOperator0 = (UnaryOperator<ExtensionPlanNode>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.replaceAll(unaryOperator0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.spliterator();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.indexOf((Object) stream0);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clear();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.indexOf((ExtensionPlanNode) defaultExtensionPlanNode0, 0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.add(defaultExtensionPlanNode0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}
