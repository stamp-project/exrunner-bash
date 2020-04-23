/*

 * Mon Apr 20 16:01:21 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      dBTreeListMetaClass0.getDateValue("] entitySnapshotsByKey entries");
      DocumentReference documentReference0 = new DocumentReference("could not register synchronization with JTA TransactionManager", "could not register synchronization with JTA TransactionManager", "could not register synchronization with JTA TransactionManager");
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference(documentReference0);
      dBTreeListMetaClass0.setXClassReference(localDocumentReference0);
      int int0 = 906;
      dBTreeListMetaClass0.getDateValue("*84~Y fom-ew1+ykp");
      DocumentReference documentReference1 = new DocumentReference("==cq{^+rp\",fb[g{kv", "-ho 7l4'i*", "] entitySnapshotsByKey entries");
      LocalDocumentReference localDocumentReference1 = new LocalDocumentReference(documentReference0);
      dBTreeListMetaClass0.setXClassReference(documentReference1);
      // Undeclared exception!
      dBTreeListMetaClass0.addTextAreaField("validationMessage", "*84~Y fom-ew1+ykp", 906, 906, "==cq{^+rp\",fb[g{kv", "number");
  }
}
