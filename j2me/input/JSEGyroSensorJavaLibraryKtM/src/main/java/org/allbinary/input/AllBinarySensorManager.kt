
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
        
import org.allbinary.logic.NullUtil
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class AllBinarySensorManager
            : Object
         {
        
companion object {
            
    private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinarySensorManager{

    
                        if(AllBinarySensorManager.instance == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    AllBinarySensorManager.instance= AllBinarySensorManager()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySensorManager.instance as AllBinarySensorManager
}


        }
            
    val ORIENTATION_SENSOR_INPUT: String = "Orientation Sensor Input"

    val ORIENTATION_TYPE: String = "Orientation Type"
private constructor ()
            : super()
        {
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
}


    private val list: BasicArrayList = BasicArrayListD()

    open fun getSensorNamesList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list
}


    open fun shutdown()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

