/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Apr 21 12:51:26 UTC 2020
 */

package org.mockito.internal.invocation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class InvocationImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.invocation.InvocationImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InvocationImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.matchers.ContainsExtraTypeInformation",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.invocation.Location",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.MockitoAnnotations$Mock",
      "org.mockito.exceptions.misusing.FriendlyReminderException",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockitousage.annotation.AnnotationsTest$Base",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.invocation.ArgumentsProcessor",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.plugins.MockMaker",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockitousage.annotation.CaptorAnnotationTest$NotAMock",
      "org.mockito.internal.invocation.InvocationImpl",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockitousage.annotation.CaptorAnnotationTest",
      "org.mockito.Mock",
      "org.mockitousage.configuration.SmartMock",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockitousage.annotation.CaptorAnnotationTest$ToManyAnnotations",
      "org.mockito.internal.creation.cglib.SerializableMockitoMethodProxy",
      "org.mockito.stubbing.Answer",
      "org.hamcrest.BaseMatcher",
      "org.mockitousage.annotation.CaptorAnnotationTest$WrongType",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.Incubating",
      "org.mockito.internal.creation.util.MockitoMethodProxy",
      "org.mockito.invocation.MockHandler",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.mockito.InjectMocks",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockitousage.annotation.AnnotationsTest$NotAMock",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.cglib.proxy.Factory",
      "org.mockitousage.annotation.CaptorAnnotationTest$MockInterface",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.internal.debugging.LocationImpl",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock",
      "org.hamcrest.Matcher",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockitousage.annotation.AnnotationsTest$Sub",
      "org.mockito.invocation.Invocation",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.exceptions.VerificationAwareInvocation",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.util.collections.ArrayUtils",
      "org.mockito.Spy",
      "org.mockito.internal.util.StringJoiner",
      "org.mockitoutil.TestBase",
      "org.mockitousage.annotation.CaptorAnnotationTest$Sub",
      "org.mockito.invocation.StubInfo",
      "org.mockito.internal.invocation.AbstractAwareMethod",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "org.mockitousage.annotation.CaptorAnnotationTest$SuperBase",
      "org.mockitousage.annotation.AnnotationsTest",
      "org.hamcrest.SelfDescribing",
      "org.mockito.configuration.MockitoConfiguration",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.internal.invocation.realmethod.DefaultRealMethod",
      "org.mockitousage.annotation.AnnotationsTest$SuperBase",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.internal.invocation.StubInfoImpl",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.mock.MockName",
      "org.mockito.invocation.DescribedInvocation",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.Captor",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.hamcrest.Factory",
      "org.mockito.stubbing.answers.ReturnsElementsOf",
      "org.mockito.internal.invocation.realmethod.CleanTraceRealMethod",
      "org.hamcrest.Description",
      "org.mockito.internal.stubbing.answers.ReturnsElementsOf",
      "org.mockitousage.annotation.CaptorAnnotationTest$Base",
      "org.mockito.internal.creation.cglib.DelegatingMockitoMethodProxy",
      "org.mockito.exceptions.stacktrace.StackTraceCleaner",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue",
      "org.mockito.internal.matchers.MatchersPrinter",
      "org.mockito.internal.reporting.PrintSettings"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.mockito.internal.invocation.MockitoMethod", false, InvocationImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.mockito.internal.invocation.realmethod.RealMethod", false, InvocationImpl_ESTest_scaffolding.class.getClassLoader()));
  }
}
