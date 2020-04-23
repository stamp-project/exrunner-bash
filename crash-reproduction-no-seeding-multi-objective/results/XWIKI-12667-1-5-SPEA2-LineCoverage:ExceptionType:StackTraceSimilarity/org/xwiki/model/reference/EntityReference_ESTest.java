/*

 * Mon Apr 20 13:16:32 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.OBJECT;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("OBJECT_PROPERTY", entityType1);
      entityReference0.getParameters();
      entityReference0.equals(entityReference0, entityType0);
      entityReference0.equals((Object) "OBJECT_PROPERTY");
      entityReference0.getName();
      Integer integer0 = Integer.getInteger("B,M>MTT&*qRb1 RWk", (-1));
      entityReference0.equals((Object) integer0);
      EntityReference entityReference1 = entityReference0.appendParent(entityReference0);
      entityReference1.setType(entityType0);
      String string0 = "ZB";
      entityReference1.getParameter("ZB");
      EntityReference entityReference2 = entityReference0.replaceParent(entityReference1, entityReference1);
      entityReference2.getParameter("OBJECT_PROPERTY");
      EntityReference entityReference3 = entityReference1.getRoot();
      EntityReference entityReference4 = entityReference1.replaceParent(entityReference3, entityReference2);
      EntityType entityType2 = EntityType.DOCUMENT;
      EntityReference entityReference5 = new EntityReference("Ex(r/<W!Qis", entityType2, entityReference4);
      EntityReference entityReference6 = entityReference5.getRoot();
      entityReference3.size();
      entityReference6.getReversedReferenceChain();
      entityReference5.getType();
      entityReference6.equals(entityReference4, entityType0);
      entityReference5.setParent(entityReference6);
      // Undeclared exception!
      entityReference3.setName((String) null);
  }
}
