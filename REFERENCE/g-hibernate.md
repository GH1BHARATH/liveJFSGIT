:green_book: **HIBERNATE**

:beginner: _**CREATE PERSISTENCE UNIT**_

:one: PROJECT/META-INF/persistence.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
                      http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
	version="2.0">
	<!-- A persistence unit defines a set of all entity classes that are managed by EntityManager instances in an application.
	This set of entity classes represents the data contained within a single data store. -->
	<persistence-unit name="JPA_PU"
		transaction-type="RESOURCE_LOCAL">
<!-- 		<properties>
			<property name="javax.persistence.jdbc.url" value="jdbc:oracle:thin:@localhost:1521:XE" />
			<property name="javax.persistence.jdbc.user" value="hr" />
			<property name="javax.persistence.jdbc.password" value="hr" />
			<property name="javax.persistence.jdbc.driver" value="oracle.jdbc.driver.OracleDriver" />
		</properties> -->

		<properties>
			<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/demo_db?useSSL=false" />
			<property name="javax.persistence.jdbc.user" value="root" />
			<property name="javax.persistence.jdbc.password" value="mysql" />
			<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />

		</properties>
		</persistence-unit>
</persistence>
```
:two: CREATE THE PERSISTENT UNIT  
```java
package com.ezshop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MySQLPersistenceUnit {
	public static EntityManager getEnityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
```
