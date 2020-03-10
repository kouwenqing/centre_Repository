package com.kouwenqing.controller;

import com.kouwenqing.util.MyThreadLocal;

public class ThreadLoacaController {


       static MyThreadLocal<Long> v =  new MyThreadLocal<Long>(){

              @Override
              protected Long initialValue() {
                     return   Thread.currentThread().getId();
              }
       };


       public static void main(String[] args) {


              for(Integer i=0; i<1000; i++){

                 new Thread(()-> System.out.println(v.get())).start();

              }

       }







}
