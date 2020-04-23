/*

 * Wed Apr 22 01:59:01 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import java.net.URI;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.job.DefaultJobStatus;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.logging.logback.internal.DefaultLoggerManager;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.internal.DefaultObservationManager;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.ObjectFactory;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createHistory();
      objectFactory0.createJobStatus();
      ObjectFactory objectFactory1 = new ObjectFactory();
      URI uRI0 = null;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      DomainObjectFactory.createJobProgress(objectFactory0, defaultJobProgress0);
      DefaultRequest defaultRequest0 = new DefaultRequest();
      DefaultRequest defaultRequest1 = new DefaultRequest(defaultRequest0);
      defaultRequest0.setId("");
      JobStatus.State jobStatus_State0 = JobStatus.State.FINISHED;
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus0).getProgress();
      doReturn(defaultRequest0).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      DefaultObservationManager defaultObservationManager0 = new DefaultObservationManager();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "componentManager", (Object) componentManager0);
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "logger", (Object) nOPLogger0);
      Injector.validateBean(defaultObservationManager0, (Class<?>) DefaultObservationManager.class);
      DefaultLoggerManager defaultLoggerManager0 = new DefaultLoggerManager();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      Injector.inject(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class, "logger", (Object) logger0);
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class, "observation", (Object) observationManager0);
      Injector.validateBean(defaultLoggerManager0, (Class<?>) DefaultLoggerManager.class);
      defaultLoggerManager0.initialize();
      DefaultJobStatus<DefaultRequest> defaultJobStatus0 = new DefaultJobStatus<DefaultRequest>(defaultRequest1, jobStatus0, defaultObservationManager0, defaultLoggerManager0);
      JobStatus jobStatus1 = defaultJobStatus0.getParentJobStatus();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus1);
  }
}
