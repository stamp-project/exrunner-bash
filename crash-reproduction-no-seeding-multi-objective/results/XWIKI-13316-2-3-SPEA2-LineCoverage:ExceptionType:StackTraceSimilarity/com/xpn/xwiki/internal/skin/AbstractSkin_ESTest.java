/*

 * Mon Apr 20 21:07:14 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.google.inject.Injector;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import com.xpn.xwiki.util.XWikiStubContextProvider;
import java.time.LocalDate;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.bouncycastle.jce.X509Principal;
import org.eclipse.jetty.server.HttpConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.context.Execution;
import org.xwiki.environment.Environment;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.ObjectPropertyReference;
import org.xwiki.rendering.block.TableBlock;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultComponentDescriptor<TableBlock> defaultComponentDescriptor0 = new DefaultComponentDescriptor<TableBlock>();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      HttpConnection.getCurrentConnection();
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_ANGLE;
      String string0 = "]LJI:\"b)^W'\"p]*TN";
      Logger logger0 = (Logger)SQLCustomQuery.log;
      EntityReferenceSerializer<ObjectPropertyReference> entityReferenceSerializer0 = (EntityReferenceSerializer<ObjectPropertyReference>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Logger logger1 = (Logger)URLStreamHandlerFactory.log;
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<LocalDate> entityReferenceSerializer1 = (EntityReferenceSerializer<LocalDate>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<X509Principal> documentReferenceResolver0 = (DocumentReferenceResolver<X509Principal>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("", (InternalSkinManager) null, (InternalSkinConfiguration) null, logger0, defaultSyntaxFactory0, (Environment) null, xWikiContextProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}
