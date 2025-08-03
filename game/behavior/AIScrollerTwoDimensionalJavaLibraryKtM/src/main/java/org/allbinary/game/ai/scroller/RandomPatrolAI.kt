
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
        package org.allbinary.game.ai.scroller



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import org.allbinary.game.input.GameInput
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class RandomPatrolAI : BasePatrolAI {
        

    private var changedDirection: Boolean = true
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(hashtable, ownerLayerInterface, gameInput){

                    var hashtable = hashtable


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.updateRandomDistance()
}


open fun updateRandomDistance()
        //nullable = true from not(false or (false and true)) = true
{this.currentDistance= MyRandomFactory.getInstance()!!.getAbsoluteNextInt(this.maxDistance!!.toInt())
}


                @Throws(Exception::class)
            
open fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager
super.update()
super.processAI(this.keyDirection)

    
                        if(this.changedDirection)
                        
                                    {
                                    super.processAI(Canvas.KEY_NUM1)
this.updateRandomDistance()
this.changedDirection= false

                                    }
                                
}


open fun nextDirection()
        //nullable = true from not(false or (false and true)) = true
{super.nextDirection()
this.changedDirection= true
}


}
                
            

