/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reservationdesblocsop.frame;

import java.sql.Time;
import java.util.Date;







/**
 *
 * @author chayma
 */
class Bloc {
   
    private Date ddebutdis;
     private Time hdebutdis;
  
     private Time hfindis;
     
    
     public Bloc(Date ddebutdis,Time hdebutdis,Time hfindis){
        
         this.ddebutdis=ddebutdis;
         this.hdebutdis=hdebutdis;
      
           this.hfindis=hfindis;
         
         
     }
    
     public Date getddebutdis()
     {
         return ddebutdis;
     }
      public Time gethdebutdis()
     {
         return hdebutdis;
     }
      
        public Time gethfindis()
     {
         return hfindis;
     }
      
     }
    
    

