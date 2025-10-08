
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
        package org.allbinary.input.automation.module.actions.script.condition.processors.output




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface ImageActionScriptOutputInterface : ProfileActionScriptOutputInterface {
        

    open fun getImageTypes()
        //nullable = true from not(false or (false and true)) = true
: ImageTypes

    open fun setImageTypes(imageTypes: ImageTypes)
        //nullable = true from not(false or (false and false)) = true


    open fun isSaved()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun setSaved(saved: Boolean)
        //nullable = true from not(false or (false and false)) = true


    open fun isDisplay()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun setDisplay(display: Boolean)
        //nullable = true from not(false or (false and false)) = true


    open fun log()
        //nullable = true from not(false or (false and true)) = true


}
                
            

