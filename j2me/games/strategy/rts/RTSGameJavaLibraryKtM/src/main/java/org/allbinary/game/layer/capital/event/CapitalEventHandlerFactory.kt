
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer.capital.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.Group

open public class CapitalEventHandlerFactory
            : Object
         {
        
companion object {
            
    private val capitalEventHandlerArray: Array<CapitalEventHandler?>

                init{
capitalEventHandlerArray= arrayOfNulls(10)




                        for (index in capitalEventHandlerArray!!.size -1 downTo 0)

        {
capitalEventHandlerArray[index]= CapitalEventHandler()
}

}

    open fun getInstance(groupInterface: Group)
        //nullable =  from not(true or (false and false)) = 
: CapitalEventHandler{
var groupInterface = groupInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return capitalEventHandlerArray[groupInterface!!.getGroupId().toInt()]!!
}


    open fun removeAll()
        //nullable = true from not(false or (false and true)) = true
{




                        for (index in capitalEventHandlerArray!!.size -1 downTo 0)

        {
capitalEventHandlerArray[index]!!.removeAllListeners()
}

}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

