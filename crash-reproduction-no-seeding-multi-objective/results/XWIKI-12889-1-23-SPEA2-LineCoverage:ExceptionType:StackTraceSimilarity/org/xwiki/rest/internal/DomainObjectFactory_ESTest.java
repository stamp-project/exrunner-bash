/*

 * Wed Apr 22 02:01:33 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.objects.DBStringListProperty;
import java.net.URI;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.job.DefaultJobStatus;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.Request;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.logging.logback.internal.DefaultLoggerManager;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.internal.DefaultObservationManager;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.JobProgress;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JobProgress jobProgress0 = objectFactory0.createJobProgress();
      objectFactory0.createPages();
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory1).createJobProgress();
      org.xwiki.job.event.status.JobProgress jobProgress1 = mock(org.xwiki.job.event.status.JobProgress.class, new ViolatedAssumptionAnswer());
      doReturn((-781.90726)).when(jobProgress1).getCurrentLevelOffset();
      doReturn((-781.90726)).when(jobProgress1).getOffset();
      DomainObjectFactory.createJobProgress(objectFactory1, jobProgress1);
      DomainObjectFactory domainObjectFactory0 = new DomainObjectFactory();
      URI uRI0 = new URI("http://www.xwiki.org/rel/wikis", "http://www.xwiki.org/rel/wikis", "http://www.xwiki.org/rel/wikis");
      DBStringListProperty dBStringListProperty0 = new DBStringListProperty();
      List<String> list0 = dBStringListProperty0.getList();
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(request0).getId();
      doReturn(list0).when(request0).getPropertyNames();
      objectFactory0.createSearchResult();
      DefaultRequest defaultRequest0 = new DefaultRequest(request0);
      JobStatus.State jobStatus_State0 = JobStatus.State.RUNNING;
      DefaultObservationManager defaultObservationManager0 = new DefaultObservationManager();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "componentManager", (Object) componentManager0);
      Logger logger0 = (Logger)SQLCustomQuery.log;
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "logger", (Object) logger0);
      Injector.validateBean(defaultObservationManager0, (Class<?>) DefaultObservationManager.class);
      DefaultLoggerManager defaultLoggerManager0 = new DefaultLoggerManager();
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class, "logger", (Object) nOPLogger0);
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class, "observation", (Object) observationManager0);
      Injector.validateBean(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class);
      DefaultJobStatus<DefaultRequest> defaultJobStatus0 = new DefaultJobStatus<DefaultRequest>(defaultRequest0, (JobStatus) null, defaultObservationManager0, defaultLoggerManager0);
      org.xwiki.job.event.status.JobProgress jobProgress2 = defaultJobStatus0.getProgress();
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress2).when(jobStatus0).getProgress();
      doReturn(defaultRequest0).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory0, uRI0, jobStatus0);
  }
}
