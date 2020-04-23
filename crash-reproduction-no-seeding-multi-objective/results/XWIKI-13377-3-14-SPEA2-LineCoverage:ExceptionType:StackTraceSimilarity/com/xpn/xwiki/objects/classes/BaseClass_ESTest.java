/*

 * Mon Apr 20 14:54:20 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.BooleanMetaClass;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.dom4j.util.NonLazyElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentBag;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      PersistentBag persistentBag0 = new PersistentBag((SessionImplementor) null);
      BooleanMetaClass booleanMetaClass0 = new BooleanMetaClass();
      BooleanMetaClass booleanMetaClass1 = (BooleanMetaClass)booleanMetaClass0.clone();
      booleanMetaClass0.setFieldsToRemove(persistentBag0);
      booleanMetaClass0.getDefaultEditSheet();
      booleanMetaClass0.addDateField("", "");
      HashMap<String, NonLazyElement> hashMap0 = new HashMap<String, NonLazyElement>();
      BooleanMetaClass booleanMetaClass2 = (BooleanMetaClass)booleanMetaClass1.clone();
      booleanMetaClass0.setFieldsToRemove(persistentBag0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2002, 1138, 0).when(comparator0).compare(any() , any());
      TreeMap<String, DBTreeListMetaClass> treeMap0 = new TreeMap<String, DBTreeListMetaClass>(comparator0);
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      treeMap0.put((String) null, dBTreeListMetaClass0);
      // Undeclared exception!
      booleanMetaClass2.fromMap((Map<String, ?>) treeMap0, (BaseCollection) booleanMetaClass1);
  }
}
