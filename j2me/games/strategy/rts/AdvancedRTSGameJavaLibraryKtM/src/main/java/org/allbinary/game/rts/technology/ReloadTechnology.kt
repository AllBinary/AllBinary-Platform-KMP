
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.rts.technology




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.RTSInterface

open public class ReloadTechnology
            : Object
        
                , RTSInterface {
        

    private var level: Int= 0

    private var maxLevel: Int
public constructor        (maxLevel: Int)
            : super()
        

        Updates for KMP build        
        {
var maxLevel = maxLevel
this.maxLevel= maxLevel
}


open fun isCompleted()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getPercentComplete()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level
}


open fun getMaxLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxLevel
}


open fun getCost()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun downgrade()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun getDowngradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun isDowngradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getLevel() *this.getLevel()) *1000
}


open fun isUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(this.getLevel() < this.getMaxLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun upgrade()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.level++

    var unitTechnologySingletonFactory: UnitTechnologySingletonFactory = UnitTechnologySingletonFactory.getInstance()!!

unitTechnologySingletonFactory!!.setReload(unitTechnologySingletonFactory!!.getReload() +(this.getLevel() *10))
}


open fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

