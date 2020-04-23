/*

 * Wed Apr 22 01:59:20 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.sql.BatchUpdateException;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentBag;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;
import org.xwiki.job.Request;
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.logging.LogLevel;
import org.xwiki.logging.event.LogEvent;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.JobProgress;
import org.xwiki.rest.model.jaxb.JobStatus;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      JobStatus jobStatus0 = objectFactory0.createJobStatus();
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      JobProgress jobProgress0 = DomainObjectFactory.createJobProgress(objectFactory0, defaultJobProgress0);
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory1).createJobProgress();
      doReturn(jobStatus0).when(objectFactory1).createJobStatus();
      URI uRI0 = null;
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      LinkedBlockingQueue<Object> linkedBlockingQueue0 = new LinkedBlockingQueue<Object>();
      LogLevel logLevel0 = LogLevel.INFO;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) linkedBlockingQueue0;
      int[] intArray0 = new int[6];
      intArray0[0] = (-3194);
      intArray0[1] = (-1);
      intArray0[2] = 517;
      intArray0[3] = 0;
      intArray0[4] = (-1701);
      intArray0[2] = 2;
      Exception exception0 = new Exception();
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(intArray0, exception0);
      LogEvent logEvent0 = new LogEvent(logLevel0, (String) null, objectArray0, batchUpdateException0);
      LogEvent logEvent1 = new LogEvent(logEvent0);
      defaultJobProgress0.onEvent(logEvent1, logEvent0, linkedBlockingQueue0);
      PersistentBag persistentBag0 = new PersistentBag(sessionImplementor0, linkedBlockingQueue0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(persistentBag0).when(request0).getId();
      linkedBlockingQueue0.add(jobProgress0);
      org.xwiki.job.event.status.JobStatus.State jobStatus_State0 = org.xwiki.job.event.status.JobStatus.State.NONE;
      org.xwiki.job.event.status.JobStatus jobStatus1 = mock(org.xwiki.job.event.status.JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus1).getProgress();
      doReturn(request0).when(jobStatus1).getRequest();
      doReturn((Date) null).when(jobStatus1).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus1).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus1);
  }
}
