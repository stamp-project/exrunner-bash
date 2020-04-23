/*

 * Tue Apr 21 05:56:17 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.put("HWN@!rd5i]d^x=:,", "HWN@!rd5i]d^x=:,");
      hashMap0.computeIfPresent("p:&zdK]Fi9@Rp{U2", biFunction0);
      String string0 = "PJ~Q^#KZ;:<C";
      hashMap0.getOrDefault("p:&zdK]Fi9@Rp{U2", "Uh<U%Vj-5q&\"Ma,hfE");
      hashMap0.put("PJ~Q^#KZ;:<C", "PJ~Q^#KZ;:<C");
      hashMap0.replace("", (Serializable) "Uh<U%Vj-5q&\"Ma,hfE");
      EntityType entityType0 = EntityType.OBJECT;
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("GWdf*\"%\u0003BxCL>N?", entityType1, (EntityReference) null);
      EntityReference entityReference1 = new EntityReference(entityReference0, (EntityReference) null);
      EntityReference entityReference2 = new EntityReference("", entityType0, entityReference1, hashMap0);
  }
}
