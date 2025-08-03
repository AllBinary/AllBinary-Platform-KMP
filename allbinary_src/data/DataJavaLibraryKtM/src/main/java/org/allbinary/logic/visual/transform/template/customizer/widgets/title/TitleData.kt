
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
        package org.allbinary.logic.visual.transform.template.customizer.widgets.title



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TitleData
            : Object
         {
        

        companion object {


    private val instance: TitleData = TitleData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TitleData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


    val NAME: String = "TITLE_NAME"

    val TEXT: String = "TITLE_TEXT"

    val VIEWNAMEKEY: String = "Title"

    val MAXLEN: Int = 255

}
                
            

