/*

 * Tue Apr 21 14:22:12 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import javax.management.ObjectName;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.pool2.ObjectPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.retainAll(treeSet0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clear();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.parallelStream();
      abstractInstallPlanJob_ModifableExtensionPlanTree0.stream();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.removeIf(predicate0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      UnaryOperator<ExtensionPlanNode> unaryOperator0 = (UnaryOperator<ExtensionPlanNode>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.replaceAll(unaryOperator0);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ObjectPool<PoolableConnection> objectPool0 = (ObjectPool<PoolableConnection>) mock(ObjectPool.class, new ViolatedAssumptionAnswer());
      ObjectName objectName0 = mock(ObjectName.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree1.toString();
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree1.add(extensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.isEmpty();
      ExtensionPlanNode extensionPlanNode1 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree2 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}
