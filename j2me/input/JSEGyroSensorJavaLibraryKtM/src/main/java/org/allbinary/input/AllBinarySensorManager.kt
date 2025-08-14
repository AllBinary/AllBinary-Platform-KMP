
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
        package org.allbinary.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class AllBinarySensorManager
            : Object
         {
        

        companion object {
            
    private val SINGLETON: AllBinarySensorManager = AllBinarySensorManager()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinarySensorManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val ORIENTATION_SENSOR_INPUT: String = "Orientation Sensor Input"

    val ORIENTATION_TYPE: String = "Orientation Type"
private constructor        ()
            : super()
        {}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{}


    private val list: BasicArrayList = BasicArrayList()

open fun getSensorNamesList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


open fun shutdown()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

