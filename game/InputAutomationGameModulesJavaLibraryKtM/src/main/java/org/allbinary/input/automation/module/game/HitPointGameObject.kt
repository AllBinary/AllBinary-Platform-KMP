
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
        package org.allbinary.input.automation.module.game



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class HitPointGameObject : MeteredGameObject
                , HitPointGameObjectInterface {
        

    private var damaged: Boolean = false

    private var closeDeath: Boolean = false

    private val HP_LABEL: String = "HP: "

    private val IS_DAMAGED_LABEL: String = "isDamaged: "

    private val IS_CLOSE_DEATH_LABEL: String = "isCloseDeath: "
public constructor        (bufferedImage: Array<BufferedImage?>, minX: Integer, maxX: Integer, y: Integer)                        

                            : super(bufferedImage, minX, maxX, y){

                    var bufferedImage = bufferedImage


                    var minX = minX


                    var maxX = maxX


                    var y = y


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(this.getRatios()[bufferedImage!!.size -1]!!.doubleValue() < 1.0F)
                        
                                    {
                                    this.setDamaged(true)

                                    }
                                
                        else {
                            this.setDamaged(false)

                        }
                            

    
                        if(this.getRatios()[bufferedImage!!.size -1]!!.doubleValue() > 0.25F)
                        
                                    {
                                    this.closeDeath= false

                                    }
                                
                        else {
                            this.closeDeath= true

                        }
                            
}


open fun isMoreThan(aFloat: Float)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var aFloat = aFloat

    
                        if(this.getRatios()[this.getRatios()!!.length -1]!!.doubleValue() > aFloat)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun isCloseDeath()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return closeDeath
}


open fun setCloseDeath(closeDeath: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var closeDeath = closeDeath
this.closeDeath= closeDeath
}


open fun isDamaged()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damaged
}


open fun setDamaged(damaged: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var damaged = damaged
this.damaged= damaged
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(HP_LABEL)
stringBuffer!!.append(super.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(IS_DAMAGED_LABEL)
stringBuffer!!.append(this.isDamaged())
stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(IS_CLOSE_DEATH_LABEL)
stringBuffer!!.append(this.isCloseDeath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

