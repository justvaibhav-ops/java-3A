package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Dao {
    public List<student1> calluser(){
        student1 s1=new student1(20,"Vaibhav",95);
        student1 s2=new student1(30,"Shayan",99);
        System.out.println(s1 +" "+ s2);
        List<student1> list=new ArrayList<student1>();
        list.add(s1);
        list.add(s2);
        return list;
    }


    }
}
