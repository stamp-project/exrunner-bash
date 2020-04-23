/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Apr 21 11:18:56 UTC 2020
 */

package org.mockito.exceptions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class Reporter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.exceptions.Reporter"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Reporter_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.invocation.StubInfo",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.cglib.reflect.FastClass$Generator",
      "org.mockito.asm.Item",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.exceptions.Pluralizer",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.asm.Type",
      "org.mockito.stubbing.Answer",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.cglib.core.EmitUtils$13",
      "org.mockito.cglib.core.EmitUtils$14",
      "org.mockito.cglib.core.EmitUtils$11",
      "org.mockito.cglib.core.EmitUtils$12",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.cglib.core.EmitUtils$10",
      "org.mockito.asm.Opcodes",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.reflect.FastClassEmitter",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.cglib.core.CollectionUtils",
      "org.hamcrest.Matcher",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.exceptions.verification.junit.JUnitTool",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.exceptions.Discrepancy",
      "org.mockito.cglib.core.Constants",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.stubbing.ClonesArguments",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.internal.creation.MockitoMethodProxy",
      "org.mockito.internal.reporting.PrintingFriendlyInvocation",
      "org.mockito.cglib.reflect.FastClassEmitter$3",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.reflect.FastClassEmitter$1",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.hamcrest.SelfDescribing",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.configuration.MockitoConfiguration",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.invocation.realmethod.HasCGLIBMethodProxy",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Signature",
      "org.mockito.internal.debugging.Location",
      "org.mockito.cglib.core.EmitUtils$5",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.EmitUtils$6",
      "org.mockito.cglib.reflect.FastClassEmitter$GetIndexCallback",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ClassWriter",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 
}
