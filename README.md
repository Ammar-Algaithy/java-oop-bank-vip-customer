# Project Description

This project consists of a Java class called VipCustomer that represents a VIP customer. The class includes attributes such as name, credit limit, and email, along with getter and setter methods for each attribute. Additionally, it provides a constructor to initialize the object with provided values or default values if not provided.

Class Details

Attributes
name: A string representing the name of the VIP customer.
creditLimit: An integer representing the credit limit of the VIP customer.
email: A string representing the email address of the VIP customer.
Constructors
VipCustomer(String name, int creditLimit, String email): Initializes a VipCustomer object with the provided name, credit limit, and email.
VipCustomer(): Initializes a VipCustomer object with default values and prints a message indicating that the object is empty.
Methods
getName(): Returns the name of the VIP customer.
setName(String name): Sets the name of the VIP customer.
getCreditLimit(): Returns the credit limit of the VIP customer.
setCreditLimit(int creditLimit): Sets the credit limit of the VIP customer.
getEmail(): Returns the email address of the VIP customer.
setEmail(String email): Sets the email address of the VIP customer.
displayInfo(): Displays the name, email, and credit limit of the VIP customer.

Usage

Create a new instance of VipCustomer by providing the required parameters:

VipCustomer customer1 = new VipCustomer("John Doe", 5000, "john.doe@example.com");
Access and modify the attributes using getter and setter methods:

customer1.setName("Jane Doe");
customer1.setCreditLimit(6000);
customer1.setEmail("jane.doe@example.com");
Display the information of the VIP customer:
customer1.displayInfo();
