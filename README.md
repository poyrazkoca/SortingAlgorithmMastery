# Sorting Algorithm Mastery: Step-by-Step Implementation

## Overview
This project is part of an academic assignment designed to enhance understanding of sorting algorithms by implementing them from scratch. The task emphasizes hands-on programming practice, as well as algorithmic thinking, without relying on external libraries or frameworks. The project follows a sequential step-by-step structure, ensuring that each step builds upon the previous one.

## Goals
- Gain hands-on experience with sorting algorithms.
- Understand and modify existing algorithms from a textbook.
- Practice using Java to implement sorting techniques.
- Enhance understanding of data structures, file handling, and object-oriented programming.

## Requirements
- Use your own implementations of sorting algorithms inspired by the provided textbook.
- Do not use any external libraries or `.jar` files for sorting.
- Follow the sequential steps strictly, completing one step before moving to the next.

## Steps
### Step 1: Loading Data
- Write a program to load `N` integers from a file where:
  - The first line contains the size of the array.
  - Each subsequent line contains a single integer.
- Create a random array of integers in addition to loading from a file.

### Step 2: Modified Insertion Sort
- Modify the insertion sort algorithm from Page 251 of the textbook to:
  - Sort integers in **descending order**.
  - Start sorting **from right to left** in the array.

### Step 3: Float Array Sorting
- Modify the previously implemented insertion sort to sort an array of **float values** instead of integers.

### Step 4: Modified Merge Sort
- Modify the **Top-Down Merge Sort** algorithm from Page 273 to:
  - Sort integers in **descending order**.

### Step 5: Car Class Creation
- Create a `Car` class with the following fields:
  - `String brand`
  - `String modelName`
  - `long modelYear`
- Implement the `Comparable` interface to compare `Car` objects by their `modelYear`.

### Step 6: Modified Quick Sort for Car Objects
- Modify the **Quick Sort** algorithm (Page 289) to:
  - Sort `Car` objects in **descending order** by `modelYear`.
- Create 10 different `Car` objects with varying attributes.
- Update the QuickSort partition method (Page 291) to reverse the sorting order.

## File Structure
