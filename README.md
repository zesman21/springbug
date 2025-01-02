Demo Repository for the Spring Bug:

This exception is thrown after upgrading spring framework from version: 6.1.14 to 6.2.1

Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'CTIChild' is expected to be of type 'org.springframework.transaction.TransactionManager' but was actually of type 'org.springbug.txbug.CTIChild$$SpringCGLIB$$0'
	at org.springframework.beans.factory.support.AbstractBeanFactory.adaptBeanInstance(AbstractBeanFactory.java:421) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:402) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils.qualifiedBeanOfType(BeanFactoryAnnotationUtils.java:134) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils.qualifiedBeanOfType(BeanFactoryAnnotationUtils.java:96) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.determineQualifiedTransactionManager(TransactionAspectSupport.java:557) ~[spring-tx-6.2.1.jar:6.2.1]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.determineTransactionManager(TransactionAspectSupport.java:519) ~[spring-tx-6.2.1.jar:6.2.1]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:348) ~[spring-tx-6.2.1.jar:6.2.1]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.2.1.jar:6.2.1]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.2.0.jar:6.2.0]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:727) ~[spring-aop-6.2.0.jar:6.2.0]
	at org.springbug.txbug.CTIChild$$SpringCGLIB$$0.execute(<generated>) ~[classes/:na]
	at org.springbug.txbug.Worker.init(Worker.java:20) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMethod.invoke(InitDestroyAnnotationBeanPostProcessor.java:457) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMetadata.invokeInitMethods(InitDestroyAnnotationBeanPostProcessor.java:401) ~[spring-beans-6.2.1.jar:6.2.1]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:219) ~[spring-beans-6.2.1.jar:6.2.1]


