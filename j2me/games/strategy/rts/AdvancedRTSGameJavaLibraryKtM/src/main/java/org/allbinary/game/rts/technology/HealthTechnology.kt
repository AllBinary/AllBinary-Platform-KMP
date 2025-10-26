
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

open public class HealthTechnology
            : Object
        
                , RTSInterface {
        

    private var level: Int= 0

    private var maxLevel: Int
public constructor (maxLevel: Int)
            : super()
        {
var maxLevel = maxLevel
this.maxLevel= maxLevel
}


    override fun isCompleted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun getPercentComplete()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    override fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level
}


    override fun getMaxLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxLevel
}


    override fun getCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    override fun downgrade()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun getDowngradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    override fun isDowngradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getLevel() *this.getLevel()) *1000
}


    override fun isUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
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


    override fun upgrade()
        //nullable = true from not(false or (false and true)) = true
{
this.level++

    var unitTechnologySingletonFactory: UnitTechnologySingletonFactory = UnitTechnologySingletonFactory.getInstance()!!

unitTechnologySingletonFactory!!.setHealth(unitTechnologySingletonFactory!!.getHealth() +(this.getLevel() *100))
}


    override fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

