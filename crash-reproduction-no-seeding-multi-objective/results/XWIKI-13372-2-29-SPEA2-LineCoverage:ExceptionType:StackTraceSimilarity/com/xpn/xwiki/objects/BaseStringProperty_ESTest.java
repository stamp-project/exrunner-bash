/*

 * Tue Apr 21 05:32:48 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseStringProperty;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.impl.CriteriaImpl;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      BaseCollection<LocalDocumentReference> baseCollection0 = (BaseCollection<LocalDocumentReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      baseStringProperty0.setObject(baseCollection0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      baseStringProperty0.isValueDirty();
      baseStringProperty0.toXMLString();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      CriteriaImpl criteriaImpl0 = new CriteriaImpl("1 ep kFaD", "3nAQK", sessionImplementor0);
      criteriaImpl0.getFetchSize();
      // Undeclared exception!
      baseStringProperty0.equals((Object) null);
  }
}
