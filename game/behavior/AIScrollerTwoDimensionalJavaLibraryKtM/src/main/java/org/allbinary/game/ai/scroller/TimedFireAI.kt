
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
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class TimedFireAI : BasicAI {
        

        companion object {
            
    val TIME: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(1)!!
            

        }
            
    val maxFireDelayTimeHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val delay: Int
public constructor        (delay: Int, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){

                    var delay = delay


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.delay= delay
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    var timeFiredInterface: TimeFiredInterface = this.getOwnerLayerInterface() as TimeFiredInterface


    
                        if(this.maxFireDelayTimeHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime) && timeFiredInterface!!.getLastFireTime() +this.maxFireDelayTimeHelper!!.delay < this.maxFireDelayTimeHelper!!.getStartTime())
                        
                                    {
                                    super.processAI(Canvas.KEY_NUM1)
this.maxFireDelayTimeHelper!!.delay= delay

                                    }
                                
}


}
                
            

