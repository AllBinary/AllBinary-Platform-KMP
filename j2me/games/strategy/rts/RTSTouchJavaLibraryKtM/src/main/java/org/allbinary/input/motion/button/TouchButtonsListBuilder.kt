
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2007 AllBinary 
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class TouchButtonsListBuilder : BaseTouchInput {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val baseTouchInputList: BasicArrayList = BasicArrayList()

open fun add(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var list = list

    var size: Int = baseTouchInputList!!.size()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
list.addAll(
                                    (get as BaseTouchInput).getList())
}

}


open fun add(baseTouchInput: BaseTouchInput)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var baseTouchInput = baseTouchInput
this.baseTouchInputList!!.add(baseTouchInput)
}


}
                
            

