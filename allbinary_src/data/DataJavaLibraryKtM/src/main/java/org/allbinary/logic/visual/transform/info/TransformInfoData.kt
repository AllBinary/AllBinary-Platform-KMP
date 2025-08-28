
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TransformInfoData
            : Object
         {
        

        companion object {
            
    private val instance: TransformInfoData = TransformInfoData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    val PARENT: String = "TRANSFORM_INFO_PARENT"

    val MAPPED: String = "TRANSFORM_INFO_MAPPED"

    val NAME: String = "TRANSFORM_INFO_NAME"

    val DESCRIPTION: String = "TRANSFORM_INFO_DESCRIPTION"

    val CATEGORY: String = "TRANSFORM_INFO_CATEGORY"

    val OBJECTFILENAME: String = "TRANSFORM_INFO_OBJECTFILENAME"

    val OBJECT: String = "TRANSFORM_INFO_OBJECT"

    val OBJECTCONFIGFILENAME: String = "TRANSFORM_INFO_OBJECTCONFIGFILENAME"

    val OBJECTCONFIG: String = "TRANSFORM_INFO_OBJECTCONFIG"

    val TEMPLATEFILENAME: String = "TRANSFORM_INFO_TEMPLATEFILENAME"

    val TEMPLATE: String = "TRANSFORM_INFO_TEMPLATE"

    val DATAFILENAME: String = "TRANSFORM_INFO_DATAFILENAME"

    val DATA: String = "TRANSFORM_INFO_DATA"

    val LABEL: String = "TRANSFORM_INFO_LABEL"

    val OWNER: String = "OWNER_" +NAME

    val PARTIAL: String = "PARTIAL_" +NAME

}
                
            

