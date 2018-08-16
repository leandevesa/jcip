package com.jcip.controller.chapter.three.ex.four;

public class HttpHelper {

    public void get(String url) {
      //Acá tengo que llegar a obtener los valores de UOW y RequestID seteados al comienzo
      String uow = RequestContext.getUOW();
      String rid = RequestContext.getRID();
      
      System.out.println("UOW " + uow);
      System.out.println("RID " + rid);
    }
  }