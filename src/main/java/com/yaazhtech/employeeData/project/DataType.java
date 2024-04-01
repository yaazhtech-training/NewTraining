package com.yaazhtech.employeeData.project;

import java.util.stream.IntStream;

public class DataType {
    // primitive type byte-1bytes,short-2bytes,int-4byte,long-8byte  // float-4byte,double-8byte // boolean-1bit //char-2bytes,
    // [primitive does not have class,functions] [it also has ref,value]
    byte abc=01;// 1byte
    short ght=32767;
    int aadhar=1234567891;// 4byte
    long phoneNo=345; // 12 digit 8byte
    float amount=1.0f;
    char charVariable='4';// Acii value [0 to 256] // alphabets (a 97.b 98.z) alphabets (A 65. B66.Z) // number (0..9) // specialChara
    /*=====================================yaazhtech==================================*/
    int [] intArray=new int[39]; // 0 to 38
    char [] charArray=new char[10];// words 11 char? ArrayIndexOutOfBoundException [runTime?]

    // continous memory allocation
    // index based // 0 to 9
// wrapper object - Java,C++,Golang,Phython
    Byte byteObject=12; // objectClass
    Short shortObject=455;
    Integer integerObject=2343434; // 4byte // objectClass
    Long longObject=2423423432L; // 8byte
    Float floatObject=3324.0f;
    Double doubleObject=243243.0d;
    Character characterObject='c'; // Acii value [0 to 256] // alphabets (a 97.b 98.z) alphabets (A 65. B66.Z) // number (0..9) // specialChara
    String strABc=new String("abc");
// 1.8 fucntional programming , stream
    // wrapper stream

    IntStream intStream= IntStream.of(100,10,100,500,78,29,30,30); // divide subset odd, even// 5GB interMetiate (filter,predicate), terminal (collect,foreach)

   // for()// n th time
    //autoboxing unboxing -
    // what are all the inbuild immutable classes in java?

    private void constructArrayOfAttributes(){
        intStream.distinct();

        // primitive to wrapper or vice versa
        for(int i=0;i<12;i++){
            Integer count=+intArray[i]; // i is primitive, count is wrapper // this will create autoboxing unboxing issue
          intArray[i]=i; //
        }
    }

    // why?


//Divya
    //Arrays // index
    // primitive array
    //declaration
    int arr[];
    //allocating memory
    int arr1[]=new int[]{1,3,4,4}; // how to iterate the elemnet, using forloop
    // wrapper array
    Integer arrWrapper[];
    Integer arrWrapperWithMemory[]=new Integer[]{1,3,4,4};

//================inBuild object/primitive is done=============================


    // user-defined/custom object
/*
Pavithra:

1. according to your business problems/requirement.
User -> int abc, String email,ph,name,int number[],Employement->LeaveData->CL->List<Leaves>,Salary-> List<Statement>
Repository-> functions, no attribute
ServiceImp-> attribute,functions

// Model(dao) view() controller
User annaLakshmi=new User();// data DAO (Data access object layer)
Repository repo=new Respository(); // repo will talk to db connection object it will retirve data from db (CRUD)
ServiceImp impl=ServiceImp();
ControllerImp impl=ServiceImp();//int abc, String email,ph,name,int number[],Employement->LeaveData->CL->List<Leaves>,Salary-> List<Statement>
Is it possible or not? possible still it work, bad design
can we have controllerImpl alone?//


==========================

User sunnel=new User();
User rupa=new User();
Emloyment e=new Employees();
 u.email// heap// null pointer
List<LeaveData> leafLlis=new ArrayList();// empty
for(int i=0;i<1000;i++){

LeaveData l=new LeaveData();

leafLlis.add(l);// i=0,size 1, i=999, size=1000



u.getEmployment()
LeaveData le=new LeaveData();
e.setLeaveData(le);
u.SetEm(e);
u.getE.getL
annaLakshmi.get
a. Train and hire , direct hire, only Training
b. hireDeveloper, webDeveloper

//

 */ //1.2 Venu
    //what is collection framework
    // details about each collection (wrapper /custom)
    // when will you go for particular collect the reason behind.
 //collection    - multi item,group of object, multiple data
    //int,Integer,Employee(int)
    // array - because its nature structure (fixed size,index based)
    // DSA - traverse,search,retrieve,delete,modify,add
    // 100 - i =0.....n, if (isExist) search,read,retrieve from whole data
    // Directory book - search index based is quicker
    // Linked list,map, queue, stack, Heap(min,max),,table,graph,BT,BST,RBT, priorityQu

    // collection framework is based DSA
    // 1m
    // parent interfaces of collection is set,queue,List
    // Map is seperate family - Map is partent interface for Abstract map and sorted map
//ArrayList
    // load factor
    // behaviour
    // thread safe
    // concurenncy
    // internal impl


    //collection of wrapper object
    // collection of user-defined object

}
