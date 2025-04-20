# Liskov Substitution Principle (LSP) - Quick Notes

## What is LSP?
- **LSP** is one of the SOLID principles in object-oriented programming (OOP).
- The basic idea: A subclass should be able to replace its parent class without breaking the program’s functionality.
- Think of it like this: You rent a sports car for a road trip, but get a sedan instead. The sedan doesn't perform as expected, making the journey less fun. This is like a subclass not fulfilling the role of its parent class properly.

## LSP Violation Example (in C++)
### Problem with Shape Hierarchy
- We have a class called `Shape`, and two subclasses: `Rectangle` and `Square`.
- Both `Rectangle` and `Square` are supposed to calculate the area, but the behavior is inconsistent, especially when you create a subclass like `SquareRectangle` that doesn't behave the same way as `Rectangle`.
- This breaks LSP, because calling a method designed for `Rectangle` doesn't work as expected with `SquareRectangle`.

## How to Fix the LSP Violation
- Instead of having `SquareRectangle` change the behavior of `Rectangle`, we introduce a new base class (`RectangleBase`), ensuring all subclasses behave consistently.
- We ensure all subclasses can be used interchangeably without causing errors or unexpected results.

## Key Tips for Applying LSP
1. **Inheritance should model "is-a" relationships**:  
   - If a class is a subclass, it should be able to replace the parent class without altering the program's behavior. For instance, a `Square` "is a" type of `Rectangle`—it should behave like one.
   
2. **Use virtual functions**:  
   - This helps subclasses implement their version of a method while ensuring the overall behavior stays consistent with the parent class.
   
3. **Don’t break the superclass's contract**:  
   - When you write a subclass, ensure it doesn’t break any rules or expectations set by the parent class. For example, if the parent class expects a positive result, the subclass should deliver that.

## Why Follow LSP?
1. **Better Code Reusability**:  
   - You can use subclasses interchangeably with their parent class without extra work. This helps avoid rewriting code.
   
2. **Easier Maintenance**:  
   - If subclasses behave consistently, changes to the parent class won’t require you to refactor the entire system.
   
3. **Modular System**:  
   - Each class behaves like an independent module that can be updated or replaced without causing issues with other parts of the system.

4. **Improved Code Quality**:  
   - By following LSP, you ensure consistency across your code, making it less prone to bugs or unexpected behavior.

## Common Questions
1. **What does LSP ensure?**  
   - LSP ensures your class hierarchy works predictably and doesn’t cause unexpected behavior when using subclasses.

2. **Why is LSP important?**  
   - It allows you to add new classes without changing existing code—making your system more flexible and scalable.

3. **How do you apply LSP in your code?**  
   - Ensure your class hierarchy makes sense, and subclasses can be used wherever their parent class is expected without breaking the behavior.

## Wrapping It Up
The **Liskov Substitution Principle** is all about ensuring that subclasses can be substituted for their parent classes without disrupting the system’s functionality. By following LSP, your code will be more maintainable, reusable, and flexible, ultimately leading to higher-quality software that’s easier to understand and modify.
