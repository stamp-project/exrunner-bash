/*

 * Mon Apr 20 12:22:30 UTC 2020
 */

package org.xwiki.model.script;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.PathStringDocumentReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.script.ModelScriptService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ModelScriptService_ESTest extends ModelScriptService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModelScriptService modelScriptService0 = new ModelScriptService();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Character character0 = defaultSymbolScheme0.getEscapeSymbol();
      Character character1 = defaultSymbolScheme0.getEscapeSymbol();
      Map<EntityType, Map<EntityType, Character>> map0 = defaultSymbolScheme0.getSeparatorSymbols();
      defaultSymbolScheme0.initialize();
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      doReturn(character0, character1, character1).when(symbolScheme0).getEscapeSymbol();
      doReturn(map0, map0, map0).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      doReturn(explicitStringEntityReferenceResolver0).when(componentManager0).getInstance(any(java.lang.reflect.Type.class) , anyString());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "componentManager", (Object) componentManager0);
      EntityReferenceSerializer<PathStringDocumentReferenceResolver> entityReferenceSerializer0 = (EntityReferenceSerializer<PathStringDocumentReferenceResolver>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "defaultSerializer", (Object) entityReferenceSerializer0);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "logger", (Object) logger0);
      Injector.validateBean(modelScriptService0, (Class<?>) ModelScriptService.class);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) defaultSymbolScheme0;
      objectArray0[1] = (Object) symbolScheme0;
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) map0;
      objectArray0[4] = (Object) componentManager0;
      objectArray0[5] = (Object) logger0;
      // Undeclared exception!
      modelScriptService0.resolveSpace("", "", objectArray0);
  }
}
