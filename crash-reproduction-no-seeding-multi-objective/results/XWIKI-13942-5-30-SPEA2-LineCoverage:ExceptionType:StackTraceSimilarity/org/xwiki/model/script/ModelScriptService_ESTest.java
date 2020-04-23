/*

 * Mon Apr 20 12:24:07 UTC 2020
 */

package org.xwiki.model.script;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.script.ModelScriptService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ModelScriptService_ESTest extends ModelScriptService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModelScriptService modelScriptService0 = new ModelScriptService();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      doReturn(explicitStringEntityReferenceResolver0).when(componentManager0).getInstance(any(java.lang.reflect.Type.class) , anyString());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "componentManager", (Object) componentManager0);
      EntityReferenceSerializer<DefaultStringEntityReferenceResolver> entityReferenceSerializer0 = (EntityReferenceSerializer<DefaultStringEntityReferenceResolver>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "defaultSerializer", (Object) entityReferenceSerializer0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "logger", (Object) logger0);
      Injector.validateBean(modelScriptService0, (Class<?>) ModelScriptService.class);
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) logger0;
      objectArray0[2] = (Object) "H/EM7M/Pji,k$";
      objectArray0[3] = (Object) entityReferenceSerializer0;
      objectArray0[4] = (Object) "H/EM7M/Pji,k$";
      objectArray0[5] = (Object) defaultSymbolScheme0;
      Object object1 = new Object();
      objectArray0[6] = object1;
      objectArray0[7] = (Object) "H/EM7M/Pji,k$";
      // Undeclared exception!
      modelScriptService0.resolveSpace("", "", objectArray0);
  }
}
