
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
        package org.allbinary.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BasicLayerProcessor
            : Object
         {
        

        companion object {


    val NULL_LAYER_PROCESSOR: BasicLayerProcessor = BasicLayerProcessor()


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val list: BasicArrayList = BasicArrayList()
protected constructor        ()
            : super()
        {}


open fun add(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

    
                        if(!list.contains(layerInterface))
                        
                                    {
                                    list.add(layerInterface)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun process(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

