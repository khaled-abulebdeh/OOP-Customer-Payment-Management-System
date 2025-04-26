
# Customer Payment Management System (OOP-Java Project)

## Overview

This project implements a **Customer Payment Management System** using **Object-Oriented Java**.  
It models different types of customer payments (Cash, Check, Credit Card), calculates payment amounts based on specific rules,  
handles authorization for payments, and sorts customers based on their total payment amount.

✅ Fully designed with inheritance, interfaces, abstract classes, and Comparable interface implementation.

---

## Files

| File | Description |
|:-----|:------------|
| `Cash.java` | Cash payment class with discount-based payment calculation. |
| `Check.java` | Check payment class with account validation and authorization logic. |
| `CreditCard.java` | Credit card payment class with expiry date validation and fee handling. |
| `CustomerPayment.java` | Abstract class representing a generic customer payment. |
| `Payable.java` | Interface for payment authorization. |
| `Driver.java` | Main driver class to create, authorize, sort, and display customer payments. |
| `Project_Description.pdf` | Full project description and assignment instructions. |

---

## Features

- Cash payments calculate discount on payment amount.
- Check payments authorized based on account balance and type (Cashier, Certified, Personal).
- Credit card payments authorized based on expiry date.
- Unauthorized payments are NOT added to the system.
- Authorized Check payments deduct the amount from account balance.
- All payments are sorted in descending order based on calculated payment.
- Payments are displayed with payment info and amount after sorting.

---


## Requirements

- Java Development Kit (JDK) 11 or newer
- Knowledge of Object-Oriented Programming (Inheritance, Polymorphism, Interfaces)
- Collections framework (`ArrayList`, `Collections.sort`)


