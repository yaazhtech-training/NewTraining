package com.yaazhtech.employeeData.MemoryManagement;

public class MemoryManagement {
}
/*
Topics:
- Stack
- Heap
- Stack vs Heap
- Garbage Collection In Java
1.Stack Memory:
- Stack is a linear data structure which stores a collection of object
- It simply follow LIFO(Last In First Out) Algorithm
- 3 Operations
1.Push:Add element top of the stack.
2.Pop:Remove an elements top of the stack.if stack is empty it will return an underFlow.
3.Top:Return top of the stack.
4.is Empty:if stack is empty.it returns true if else false

Memory Allocations-Stack:
- Stack is a part of memory where temporary variables are stored.
- It used to execute a thread and may have short-lived values as well as reference to other object.
- Variable that are stored on the stack exist long function that created them are running.
- Stack has limit size which can vary according to operating System used.
- The size of the stack should vary since method and fn should create and delete the local variable required.
-It is static Memory
- It access directly from memory
- Memory allocation begins when the program is compiled
Limitation of stack:
- Stack item can remove ur last item should add.
- This works perfectly for local Variables,since they come and go executions exists and enters fn.
- But does not work well for the data whose lifecycle does not depend on fn
- The memory of Heap allow you to add and remove data whatever you want


Heap Memory:
- Heap is in the area in the memory to store object.
- It is tightly Managed like stack.
- There is no size limited
- Compare to stack object in the heap are much slower to access.

Heap Area:
Young space and old space
- FIFO
-It is dynamic memory
-It not directly access
- Memory allocation begins at runtime


StringBuilder sb= new StringBuilder();


Weak Reference:
It does not survive after the next garbage collection process.
If we are not sure when the data will be requested again.
In this condition, we can create a weak reference to it.
In case, if the garbage collector processes, it destroys the object.
 When we again try to retrieve that object, we get a null value.
It is defined in java.lang.ref.WeakReference class.
We can create a weak reference by using the following statement:

WeakReference<StringBuilder> reference = new WeakReference<>(new StringBuilder());



Soft Reference:
It is collected when the application is running low on memory.
The garbage collector does not collect the softly reachable objects.
All soft referenced object s are collected before it throws an OutOfMemoryError.
We can create a soft reference by using the following statement:

SoftReference<StringBuilder> reference = new SoftReference<>(new StringBuilder());


Phantom Reference:
It is available in java.lang.ref package.
It is defined in java.lang.ref.PhantomReference class.
The object which has only phantom reference pointing them can be collected whenever garbage collector wants to collect.



PhantomReference<StringBuilder> reference = new PhantomReference<>(new StringBuilder());
 */