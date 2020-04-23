/*

 * Wed Apr 22 17:26:34 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Hashtable;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.type.PostgresUUIDType;
import org.jgroups.util.ExtendedUUID;
import org.jgroups.util.FlagsUUID;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.query.internal.ScriptQueryParameter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<NamedSQLQueryDefinition> provider0 = (Provider<NamedSQLQueryDefinition>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      hqlQueryExecutor0.completeShortFormStatement("y");
      FlagsUUID flagsUUID0 = FlagsUUID.randomUUID();
      ExtendedUUID extendedUUID0 = new ExtendedUUID(flagsUUID0);
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[3];
      PostgresUUIDType postgresUUIDType0 = PostgresUUIDType.INSTANCE;
      OrdinalParameterDescriptor ordinalParameterDescriptor0 = new OrdinalParameterDescriptor(0, postgresUUIDType0, 11002);
      ordinalParameterDescriptorArray0[0] = ordinalParameterDescriptor0;
      OrdinalParameterDescriptor ordinalParameterDescriptor1 = new OrdinalParameterDescriptor(0, postgresUUIDType0, 11002);
      ordinalParameterDescriptorArray0[1] = ordinalParameterDescriptor1;
      OrdinalParameterDescriptor ordinalParameterDescriptor2 = new OrdinalParameterDescriptor(0, postgresUUIDType0, 2830);
      ordinalParameterDescriptorArray0[2] = ordinalParameterDescriptor2;
      Hashtable<ScriptQueryParameter, EmbeddableComponentManager> hashtable0 = new Hashtable<ScriptQueryParameter, EmbeddableComponentManager>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, hashtable0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("where f", extendedUUID0, (SessionImplementor) null, parameterMetadata0);
      collectionFilterImpl0.setTimeout(486);
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(collectionFilterImpl0, "Attachment [{}] already modified", substituteLoggingEvent0);
  }
}
