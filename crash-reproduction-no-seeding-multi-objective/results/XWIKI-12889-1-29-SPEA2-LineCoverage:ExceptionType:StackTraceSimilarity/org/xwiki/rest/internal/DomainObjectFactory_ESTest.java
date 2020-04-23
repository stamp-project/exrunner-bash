/*

 * Wed Apr 22 02:05:37 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.DBStringListProperty;
import java.net.URI;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.Request;
import org.xwiki.job.internal.DefaultJobProgress;
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
      JobProgress jobProgress0 = objectFactory0.createJobProgress();
      ObjectFactory objectFactory1 = mock(ObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(jobProgress0).when(objectFactory1).createJobProgress();
      doReturn(jobStatus0).when(objectFactory1).createJobStatus();
      URI uRI0 = null;
      DBStringListProperty dBStringListProperty0 = new DBStringListProperty();
      List<String> list0 = dBStringListProperty0.getList();
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(request0).getId();
      doReturn(list0).when(request0).getPropertyNames();
      DefaultRequest defaultRequest0 = new DefaultRequest(request0);
      org.xwiki.job.event.status.JobStatus.State jobStatus_State0 = org.xwiki.job.event.status.JobStatus.State.WAITING;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress("M!");
      org.xwiki.job.event.status.JobStatus jobStatus1 = mock(org.xwiki.job.event.status.JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus1).getProgress();
      doReturn(defaultRequest0).when(jobStatus1).getRequest();
      doReturn((Date) null).when(jobStatus1).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus1).getState();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory1, (URI) null, jobStatus1);
  }
}
