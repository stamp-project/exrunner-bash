/*

 * Tue Apr 21 05:57:17 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("Cloned reference must not be null", entityType0);
      Object object0 = new Object();
      String string0 = "The validated expression is false";
      entityReference0.equals((Object) "The validated expression is false");
      entityReference0.setName("] does not belong to the parents chain of the reference [");
      EntityReference entityReference1 = new EntityReference(entityReference0);
      Map<String, Serializable> map0 = entityReference1.getParameters();
      entityReference0.setParameter(" ", "] does not belong to the parents chain of the reference [");
      EntityType entityType1 = entityReference0.getType();
      entityReference0.hasParent(entityReference1);
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference2 = new EntityReference("The validated expression is false", entityType2, entityReference0, map0);
      entityReference2.extractFirstReference(entityType0);
      entityReference0.equals((Object) entityType1);
      EntityReference entityReference3 = new EntityReference("]", entityType1);
      entityReference3.hasParent(entityReference2);
      EntityReference entityReference4 = new EntityReference(entityReference0);
      entityReference0.getParameters();
      EntityType entityType3 = EntityType.DOCUMENT;
      entityReference4.equals(entityReference2, entityType3);
      EntityType entityType4 = EntityType.CLASS_PROPERTY;
      String string1 = "I|/: eFuhF7/pcw@";
      // Undeclared exception!
      entityReference0.setName("");
  }
}
