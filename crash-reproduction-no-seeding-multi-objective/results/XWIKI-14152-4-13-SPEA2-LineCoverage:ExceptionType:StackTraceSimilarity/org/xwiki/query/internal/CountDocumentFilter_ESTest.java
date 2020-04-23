/*

 * Mon Apr 20 12:05:52 UTC 2020
 */

package org.xwiki.query.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.query.internal.AbstractQueryFilter;
import org.xwiki.query.internal.CountDocumentFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CountDocumentFilter_ESTest extends CountDocumentFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      String string0 = AbstractQueryFilter.FULLNAME_COLUMN;
      String string1 = "";
      countDocumentFilter0.filterStatement("|Ta@M}_-'-P]#m&Vh>Z", "%k>gnuU8hB7}K HV!$");
      // Undeclared exception!
      countDocumentFilter0.filterStatement("28UqqIpbu^qv", "hql");
  }
}
