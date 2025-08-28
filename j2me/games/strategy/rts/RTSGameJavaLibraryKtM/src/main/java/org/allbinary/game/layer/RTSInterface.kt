
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface RTSInterface {
        

open fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isCompleted()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun getPercentComplete()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getMaxLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getCost()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun downgrade()
        //nullable = true from not(false or (false and true)) = true


open fun getDowngradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun isDowngradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun isUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun upgrade()
        //nullable = true from not(false or (false and true)) = true


}
                
            

