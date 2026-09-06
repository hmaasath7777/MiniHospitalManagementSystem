# Mini Hospital Emergency Management System

## Overview
This is a Java console application that simulates a Mini Hospital Emergency Management System. It was developed as part of the CIT300 - Data Structures and Algorithms Individual Mid Assignment.

The system manages patient registration, emergency treatment requests, treatment completion, and patient visit history using four core data structures.

## Data Structures Used

### 1. Binary Search Tree (BST) - Patient Records
- Stores patient records using Patient ID as the key.
- Supports insert, search, delete, and in-order traversal (displays patients in ascending order of Patient ID).
- Implemented in `PatientBST.java` and `BSTNode.java`.

### 2. Queue - Emergency Patient Queue
- Manages patients arriving at the emergency unit using FIFO (First-In, First-Out) principle.
- Supports enqueue, dequeue, display, and empty queue handling.
- Implemented in `EmergencyQueue.java` and `QueueNode.java`.

### 3. Stack - Treatment History
- Stores completed treatment records using LIFO (Last-In, First-Out) principle.
- Supports push, pop, display, and empty stack handling.
- Implemented in `TreatmentStack.java` and `TreatmentRecord.java`.

### 4. Singly Linked List - Patient Visit History
- Each patient has their own linked list of previous hospital visits.
- Supports adding, removing, searching, and displaying visit history.
- Implemented in `VisitHistoryList.java` and `VisitNode.java`.

## Project Structure