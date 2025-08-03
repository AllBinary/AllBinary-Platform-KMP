
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2011 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *   
                *  Created By: Travis Berthelot    
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.math.permutations



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ComparableObject
            : Object
        
                , Comparable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun compareTo(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var anyType = anyType

    
                        if(this.hashCode() < anyType!!.hashCode())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                                    }
                                
                             else 
    
                        if(this.hashCode() > anyType!!.hashCode())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

