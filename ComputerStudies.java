/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author PC
 */
class ComputerStudies extends DIT {
   String module_name = "Object Oriented";
   String module_code = "CSEU 07205";
   
   String module(){
       System.out.println("Module Name : Object oriented");
       return module_name;
   }
   String code (){
       System.out.println("Module Code : CSEU 07205");
       return module_code;
   }
    
    
}
