/*

 * Wed Apr 22 01:55:50 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.merge.MergeResult;
import java.net.URI;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLTimeoutException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.helpers.BasicMarker;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.logging.LogLevel;
import org.xwiki.logging.LogQueue;
import org.xwiki.logging.event.LogEvent;
import org.xwiki.observation.event.Event;
import org.xwiki.observation.internal.DefaultObservationManager;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createJobStatus();
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      DomainObjectFactory.createJobProgress(objectFactory0, defaultJobProgress0);
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      URI uRI0 = null;
      DefaultRequest defaultRequest0 = new DefaultRequest();
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      DefaultObservationManager defaultObservationManager0 = new DefaultObservationManager();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(componentManager0).getInstanceList(any(java.lang.reflect.Type.class));
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "componentManager", (Object) componentManager0);
      MergeResult mergeResult0 = new MergeResult();
      LogQueue logQueue0 = mergeResult0.getLog();
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "logger", (Object) logQueue0);
      Injector.validateBean(defaultObservationManager0, (Class<?>) DefaultObservationManager.class);
      BasicMarker basicMarker0 = (BasicMarker)LogEvent.MARKER_BEGIN;
      LogLevel logLevel0 = LogLevel.TRACE;
      Object[] objectArray0 = new Object[0];
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("http://www.xwiki.org/rel/syntaxes", "L7QzxW ");
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException("L7QzxW ", (String) null, (-1006), sQLNonTransientConnectionException0);
      LogEvent logEvent0 = new LogEvent(basicMarker0, logLevel0, "ISO/IEC 8859-2 or Latin 2 character set", objectArray0, sQLTimeoutException0);
      Format format0 = Format.STRIKEDOUT;
      // Undeclared exception!
      defaultObservationManager0.notify((Event) logEvent0, (Object) sQLNonTransientConnectionException0, (Object) format0);
  }
}
