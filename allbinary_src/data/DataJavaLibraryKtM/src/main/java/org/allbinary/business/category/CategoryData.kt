
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
        package org.allbinary.business.category



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.file.DataFileData

open public class CategoryData
            : Object
         {
        

        companion object {


    private val instance: CategoryData = CategoryData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CategoryData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


    val PARENT: String = "CATEGORY_PARENT"

    val NAME: String = "CATEGORY_NAME"

    val PATH: String = "CATEGORY_PATH"

    val LABEL: String = "CATEGORY_LABEL"

    val VIEW: String = "CATEGORY_VIEW_CATEGORY"

    val LEVEL: String = "CATEGORY_LEVEL"

    val REQUEST: String = "request"

    val ROOTCATEGORY: String = "Category"

    val UNCRYPTED_EXTENSION: String = DataFileData.UNCRYPTED_EXTENSION

    val ENCRYPTED_EXTENSION: String = DataFileData.ENCRYPTED_EXTENSION

}
                
            

