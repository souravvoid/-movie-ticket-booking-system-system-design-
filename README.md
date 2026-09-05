# Movie Ticket Booking System

A Java-based console application for managing movie theater ticket bookings, payments, and seat management.

## Overview

This project implements a complete movie ticket booking system using object-oriented principles in Java. The system supports multiple payment methods, dynamic pricing based on seat type, and cinema management.

## Architecture

The system follows an layered architecture with the following key components:

### Core Classes

- **Movie** - Represents a movie with title, language, and duration
- **Seat** - Represents a theater seat with type-based pricing (Silver/Gold/Platinum)
- **Screen** - Represents a cinema screen with seat layout
- **Cinema** - Represents a cinema complex with multiple screens
- **Show** - Represents a movie showing on a screen
- **ShowSeat** - Represents the relationship between a show and a seat

### Customer & Booking

- **Customer** - Represents a customer with booking capabilities
- **Booking** - Handles ticket booking operations
- **BookingService** - Core booking service logic

### Payment System

Multiple payment strategies are supported:

- **Payment** - Abstract payment base class/interface
- **CashPayment** - Cash payment method
- **CardPayment** - Credit/Debit card payment
- **UpiPayment** - UPI-based payment

### Pricing & Utilities

- **PriceCalculator** - Calculates ticket prices
- **TicketPrinter** - Formats and prints ticket receipts

## Features

- Movie management (title, language, duration)
- Seat selection with type-based pricing (Silver: 150, Gold: 250, Platinum: 400)
- Cinema screen management
- Multi-payment support (Cash, Card, UPI)
- Ticket booking and printing
- Dynamic price calculation based on seat type

## Project Structure

```
src/
  Movie.java      - Movie entity
  Seat.java       - Seat with pricing
  Screen.java     - Cinema screen
  Cinema.java     - Cinema complex
  Show.java       - Movie showing
  ShowSeat.java   - Show-seat mapping
  Customer.java   - Customer entity
  Booking.java    - Booking operations
  BookingService.java - Booking service
  Payment.java    - Payment base
  CardPayment.java - Card payment
  CashPayment.java - Cash payment
  UpiPayment.java - UPI payment
  PriceCalculator.java - Price calculation
  TicketPrinter.java - Ticket printing
  CinemaApp.java  - Main application entry point
uml/
  class_diagram.png - UML class diagram
  sequence_diagram.png - UML sequence diagram
```

## How to Run

```bash
# Compile all Java source files
javac src/*.java

# Run the application
java -cp src CinemaApp
```

## License

This project is for educational purposes.