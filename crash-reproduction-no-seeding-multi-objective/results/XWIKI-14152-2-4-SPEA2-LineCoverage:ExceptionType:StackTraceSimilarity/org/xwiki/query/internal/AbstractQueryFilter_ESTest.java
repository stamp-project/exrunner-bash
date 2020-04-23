/*

 * Mon Apr 20 12:00:27 UTC 2020
 */

package org.xwiki.query.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.query.internal.UniqueDocumentFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractQueryFilter_ESTest extends AbstractQueryFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      uniqueDocumentFilter0.filterResults(linkedList0);
      uniqueDocumentFilter0.filterResults(linkedList0);
      uniqueDocumentFilter0.filterStatement("", "vZ$ut3<Zn&f[");
      String string0 = "";
      // Undeclared exception!
      uniqueDocumentFilter0.getSelectColumns("");
  }
}
