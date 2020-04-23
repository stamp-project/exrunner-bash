/*

 * Mon Apr 20 15:27:46 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentBag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyMetaClass propertyMetaClass0 = new PropertyMetaClass();
      propertyMetaClass0.addDateField("", "", (String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      propertyMetaClass0.setFields(hashMap0);
      propertyMetaClass0.setDirty(true);
      PersistentBag persistentBag0 = new PersistentBag();
      propertyMetaClass0.getNumber();
      propertyMetaClass0.addDateField("n8]Axxq7eE%G", "fM0XnDj`*5jto;+", "Property [");
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap1.merge("<>", "Marking %s as completed!", biFunction0);
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      numberMetaClass0.setFields(hashMap0);
      numberMetaClass0.setDirty(true);
      propertyMetaClass0.addTextAreaField("", "Marking %s as completed!", 4096, 4096);
      hashMap1.put("u>[(it/", (String) null);
      // Undeclared exception!
      propertyMetaClass0.fromMap((Map<String, ?>) hashMap0, (BaseCollection) numberMetaClass0);
  }
}
