/*

 * Mon Apr 20 21:27:39 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.doc.merge.MergeResult;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import com.xpn.xwiki.internal.skin.WikiSkinUtils;
import com.xpn.xwiki.util.XWikiStubContextProvider;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.RoleHint;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      EntityReferenceSerializer<String> entityReferenceSerializer0 = (EntityReferenceSerializer<String>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      RoleHint<String> roleHint0 = new RoleHint<String>((Type) null);
      roleHint0.getRoleClass();
      WikiSkinUtils wikiSkinUtils0 = new WikiSkinUtils();
      DocumentReferenceResolver<String> documentReferenceResolver0 = (DocumentReferenceResolver<String>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(wikiSkinUtils0, (Class<?>) WikiSkinUtils.class, "currentMixedDocumentReferenceResolver", (Object) documentReferenceResolver0);
      MergeResult mergeResult0 = new MergeResult();
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "contextProvider", (Object) xWikiStubContextProvider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      doReturn((ExecutionContext) null).when(execution0).getContext();
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "execution", (Object) execution0);
      Injector.validateBean(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class);
      xWikiContextProvider0.get();
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("ob~AX-ucu<_{z,9bMJ", internalSkinManager0, internalSkinConfiguration0, (org.slf4j.Logger) null, defaultSyntaxFactory0, (Environment) null, xWikiContextProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
