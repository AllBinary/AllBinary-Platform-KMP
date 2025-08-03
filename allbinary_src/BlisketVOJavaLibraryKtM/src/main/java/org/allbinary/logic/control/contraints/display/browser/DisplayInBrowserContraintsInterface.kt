
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
        package org.allbinary.logic.control.contraints.display.browser



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface DisplayInBrowserContraintsInterface {
        

open fun isMountable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isFrameable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isQuickFrameable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun setMountable(canBeMounted: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setFrameable(canBeFramed: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setQuickFrameable(canBeQuickFramed: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setMountedLink(mountedLink: String)
        //nullable = true from not(false or (false and false)) = true


open fun getMountedLink()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

