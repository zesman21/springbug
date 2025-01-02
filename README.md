Demo Repository for the Spring Bug:

Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'CTIChild' is expected to be of type 'org.springframework.transaction.TransactionManager' but was actually of type 'org.springbug.txbug.CTIChild$$SpringCGLIB$$0'

This exception is thrown after upgrading spring framework from version: 6.1.14 to 6.2.1
