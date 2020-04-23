/*

 * Mon Apr 20 12:02:22 UTC 2020
 */

package org.xwiki.query.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.query.internal.UniqueDocumentFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractQueryFilter_ESTest extends AbstractQueryFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      uniqueDocumentFilter0.getOrderByColumns("^k@/DTJaM+qyvw");
      uniqueDocumentFilter0.getOrderByColumns("");
      String string0 = "";
      // Undeclared exception!
      uniqueDocumentFilter0.getSelectColumns("");
  }
}
