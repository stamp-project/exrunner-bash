/*

 * Mon Apr 20 13:48:37 UTC 2020
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
      EntityType entityType0 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("(H9|F?LjroDIf@Z", entityType0);
      entityReference0.toString();
      entityReference0.hasParent(entityReference0);
      Map<String, Serializable> map0 = entityReference0.getParameters();
      entityReference0.setParameters(map0);
      entityReference0.compareTo(entityReference0);
      EntityType entityType1 = EntityType.OBJECT;
      EntityType entityType2 = EntityType.ATTACHMENT;
      entityReference0.equals(entityReference0, entityType1, entityType2);
      entityReference0.equals(entityReference0, entityType2);
      entityReference0.hasParent(entityReference0);
      entityReference0.compareTo(entityReference0);
      EntityReference entityReference1 = new EntityReference("] does not belong to the parents chain of the reference [", entityType1);
      entityReference0.equals(entityReference1, entityType2);
      EntityType entityType3 = EntityType.DOCUMENT;
      entityReference1.setName("Rp1$F$59%'v7_I7T");
      EntityReference entityReference2 = new EntityReference("", entityType3);
  }
}
