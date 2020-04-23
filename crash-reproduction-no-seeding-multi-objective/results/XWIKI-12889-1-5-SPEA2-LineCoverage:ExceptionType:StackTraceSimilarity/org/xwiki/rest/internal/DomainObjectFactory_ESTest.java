/*

 * Wed Apr 22 01:54:58 UTC 2020
 */

package org.xwiki.rest.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseObject;
import groovy.lang.GroovyClassLoader;
import java.net.URI;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.job.DefaultRequest;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.job.internal.DefaultJobProgress;
import org.xwiki.rest.internal.DomainObjectFactory;
import org.xwiki.rest.model.jaxb.ObjectFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DomainObjectFactory_ESTest extends DomainObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      URI uRI0 = new URI((String) null, (String) null, "", ")ty;-\"vRZ");
      DefaultRequest defaultRequest0 = new DefaultRequest();
      DefaultRequest defaultRequest1 = new DefaultRequest(defaultRequest0);
      JobStatus.State jobStatus_State0 = JobStatus.State.NONE;
      DefaultJobProgress defaultJobProgress0 = new DefaultJobProgress();
      BaseObject baseObject0 = new BaseObject();
      JobStatus jobStatus0 = mock(JobStatus.class, new ViolatedAssumptionAnswer());
      doReturn(defaultJobProgress0).when(jobStatus0).getProgress();
      doReturn(defaultRequest1).when(jobStatus0).getRequest();
      doReturn((Date) null).when(jobStatus0).getStartDate();
      doReturn(jobStatus_State0).when(jobStatus0).getState();
      GroovyClassLoader groovyClassLoader0 = new GroovyClassLoader();
      // Undeclared exception!
      DomainObjectFactory.createJobStatus(objectFactory0, uRI0, jobStatus0);
  }
}
