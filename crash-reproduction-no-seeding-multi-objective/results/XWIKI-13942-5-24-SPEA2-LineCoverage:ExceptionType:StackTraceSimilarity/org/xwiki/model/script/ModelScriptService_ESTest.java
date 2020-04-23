/*

 * Mon Apr 20 12:22:44 UTC 2020
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
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.model.ModelConfiguration;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultEntityReferenceProvider;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.PathStringDocumentReferenceResolver;
import org.xwiki.model.script.ModelScriptService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ModelScriptService_ESTest extends ModelScriptService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[26];
      ModelScriptService modelScriptService0 = new ModelScriptService();
      PathStringDocumentReferenceResolver pathStringDocumentReferenceResolver0 = new PathStringDocumentReferenceResolver();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme0.initialize();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      doReturn(explicitStringEntityReferenceResolver0).when(componentManager0).getInstance(any(java.lang.reflect.Type.class) , anyString());
      Injector.inject(modelScriptService0, (Class<?>) ModelScriptService.class, "componentManager", (Object) componentManager0);
      String string0 = "~QZQJ g#A:Szy&5qX\\7";
      DefaultEntityReferenceProvider defaultEntityReferenceProvider0 = new DefaultEntityReferenceProvider();
      ModelConfiguration modelConfiguration0 = mock(ModelConfiguration.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultEntityReferenceProvider0, (Class<?>) DefaultEntityReferenceProvider.class, "configuration", (Object) modelConfiguration0);
      Injector.validateBean(defaultEntityReferenceProvider0, (Class<?>) DefaultEntityReferenceProvider.class);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      // Undeclared exception!
      modelScriptService0.resolveSpace((String) null, "C4+gmi@R", objectArray0);
  }
}
