
        /*
                *  
                *  To change this license header, choose License Headers in Project Properties. 
                *  To change this template file, choose Tools | Templates  and open the template in the editor.  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.input.automation.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class JTreeInterfaceFactory
            : Object
         {
        

        companion object {
            
    private val instance: JTreeInterfaceFactory = JTreeInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: JTreeInterfaceFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var jTreeInterface: JTreeInterface

open fun set(jTreeInterface: JTreeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var jTreeInterface = jTreeInterface
this.jTreeInterface= jTreeInterface
}


open fun getJTreeInterface()
        //nullable = true from not(false or (false and true)) = true
: JTreeInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.jTreeInterface
}


}
                
            

