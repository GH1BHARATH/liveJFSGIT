
:beginner: _**JDBC SUMMARY**_  

JDBC CONFIGURATION:
			LOAD THE DRIVER
```java
	Class.forName("com.mysql.cj.jdbc.Driver");
					ESTABLISH THE CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMCGGLOBALDB", "root", "mysql");
```


EXCEPTION:

Checked Exception:

 catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Driver could not be loaded " + classNotFoundException);
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problems " + sqlException);
		}


QUERIES:

"SELECT * FROM PRODUCTS"

 "INSERT INTO PRODUCTS VALUES ('" + product.getProductId() + "','"
				+ product.getProductName() + "','" + product.getSupplierId() + "','" + product.getCategoryId() + "'," + product.getPrice() + "," +product.getAvailabilityQuantity()+ ","+product.getReorderLevel()+",'"+product.getExpiryDate()+"','"+product.getDiscontinued()+"');";
		





RESULTSET ITERATION :

```java
while(resultSet.next()) {
				CREATE TABLE PRODUCTS(PRODUCT_ID CHAR(5) PRIMARY KEY NOT NULL,PRODUCT_NAME VARCHAR(20) NOT NULL,SUPPLIER_ID CHAR(5) NOT NULL,CATEGORY_ID CHAR(5) NOT NULL,PRICE INT,AVALIBILITY_QUALITY CHAR(5),REORDER_LEVEL INT ,EXPIRY_DATE DATE,DISCONTINOUED CHAR(5),FOREIGN KEY (SUPPLIER_ID)  REFERENCES SUPPLIERS(SUPPLIER_ID),FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORIES(CATEGORY_ID));
				String productId = resultSet.getString("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				String  supplierId = resultSet.getString("SUPPLIER_ID");
				String categoryId  = resultSet.getString("CATEGORY_ID");
				int price = resultSet.getInt("PRICE");
				int availabilityQuantity = resultSet.getInt("AVAILABILITY_QUANTITY");
				int reorderLevel = resultSet.getInt("REORDER_LEVEL");
				String expiryDate = resultSet.getString("EXPIRY_DATE");
				String discontinued = resultSet.getString("DISCONTINUED");
				

```




POPULATING DATA INTO MODEL:
 
				//CREATE A PRODUCT OBJECT FOR THE PRODUCT
				Products product = new Products(productId,productName,supplierId,categoryId,price,availabilityQuantity,reorderLevel,expiryDate,discontinued);
				productsList.add(product);




INTERFACES AND CLASSES USED:

Interfaces:

Connection
Statement
Resultset

Classes:

DriverManager
Class





WEB APPLICATION:


WEB APPLICATION SUMMARY:

 WEB.xml:


<servlet>
		<servlet-name>ProductServlet</servlet-name>
		<servlet-class>com.fmcgglobal.web.ProductServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>ProductServlet</servlet-name>
		<url-pattern>/products</url-pattern>
	</servlet-mapping>
	<servlet>
		<servlet-name>DeleteServlet</servlet-name>
		<servlet-class>com.fmcgglobal.web.DeleteServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>DeleteServlet</servlet-name>
		<url-pattern>/delete</url-pattern>
	</servlet-mapping>
</web-app>


INTERFACES AND CLASSES:

Interfaces:

HttpServletRequest
HttpServletResponse

Classes :

HttpServlet



EXCEPTIONS :

1 IOException
2 ServletException


MAVEN CONFIGURATION:

 
 <properties>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.source>1.8</maven.compiler.source>
	</properties>




JAR CONFIGURATION(MYSQL CONNECTOR):



<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version>
		</dependency>




JUNIT CONFIGURATION (FOR TESTING):
   

 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>


WEB SERVER CONFIGURATION :

Apache tomcat download pannom
then properties la targetruntime la tomcat 9.0 add pannom 



              
                                               CORE JAVA


PACKAGES :


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;



WEB PACKAGES:


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


WEB API METHODS :

doGet()
doPost()
service()
init()



// HTTP VERBS / SQL STATEMENTS / API
	// GET  / SELECT / findAllProducts
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	
	// POST / INSERT /  save
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	

	// PUT / UPDATE / update
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	
	// DELETE / DELETE / delete
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

 


CHALLENGES FACED:

1. TOO MUCH BOILERPLATE CODE  (Taken care by Hibernate)
2. TOO MUCH CHECKED EXCEPTIONS  (Taken care by Hibernate)
3. CONFIGURING TOMCAT (STARTING, SHUTTING DOWN)  (Automaticatically done by Spring)
4. SERVLET API SPECIFIC (MADE EASIER BY SPRING)


RELATIONAL ROW TO OBJECT MAPPING :(Taken care by Hibernate)



                   ResultSet resultSet = MySQLDBConnection.getResultSet("SELECT * FROM PRODUCTS"); 
		// ITERATE THROUGH THE RESULT SET AND CREATE THE PRODUCT MODEL
		try {
			while(resultSet.next()) {
	                       String productId = resultSet.getString("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				String  supplierId = resultSet.getString("SUPPLIER_ID");
				String categoryId  = resultSet.getString("CATEGORY_ID");
				
				//CREATE A PRODUCT OBJECT FOR THE PRODUCT
				Products product = new Products(productId,productName,supplierId,categoryId,price,availabilityQuantity,reorderLevel,expiryDate,discontinued);
				productsList.add(product);


Object to Relational Mapping :


	Products product = new Products(piString, pnString, siString, ciString,price,qa,re,expiryDateString,dcString);
		productRepository.save(product);
	// CREATE THE INSERT QUERY
		String insertQuery = "INSERT INTO PRODUCTS VALUES ('" + product.getProductId() + "','"
				+ product.getProductName() + "','" + product.getSupplierId() + "','" + product.getCategoryId() + "'," + product.getPrice() + "," +product.getAvailabilityQuantity()+ ","+product.getReorderLevel()+",'"+product.getExpiryDate()+"','"+product.getDiscontinued()+"');";
		System.out.println(insertQuery);
		
		MySQLDBConnection.saveRecord(insertQuery);
	


MODEL > ENTITY MODEL
PRODUCT MODEL > PRODUCTS TABLE (HIBERNATE MAPPING)

Persistence : It is permanently storing the data to the database


Hibernate :

 Hibernate ORM enables developers to more easily write applications whose data outlives the application process. As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC).


CONFIGURATION
1.With CODE(more advanced)

			LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
					ESTABLISH THE CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMCGGLOBALDB", "root", "mysql");


2. With ANNOTATION :


	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}
	
	@Test
	public void testSum() {
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testDivision() {
		int result = 0;
		try {
			result = calculator.divide(9,3);
		} catch (Exception exception) {
			System.out.println("Exception : " + exception);
		}
		assertEquals(3, result);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception{
		calculator.divide(5, 0);
	}

3. With Xml:

POM:
<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version>
		</dependency>

WEB:
	<servlet>
		<servlet-name>ProductServlet</servlet-name>
		<servlet-class>com.fmcgglobal.web.ProductServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>ProductServlet</servlet-name>
		<url-pattern>/products</url-pattern>
	</servlet-mapping>


4.With PropertyFiles :



pass.txt
Displaying pass.txt.