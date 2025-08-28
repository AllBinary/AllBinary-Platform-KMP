
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.input.GameInput
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.PlayerQueue
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.Sound
import org.allbinary.time.TimeDelayHelper

open public class HorizontalScreenPatrolAI : BasicAI {
        

        companion object {
            
    val SOUND: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(433)!!

        }
            
    var keyDirection: Int = Canvas.LEFT

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private var firingX: Int = displayInfoSingleton!!.getLastHalfWidth()!!

    private var firedIndex: Int = 0

    private val MAX_FIRE: Int = 28

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(240)

    private val secondaryPlayerQueue: PlayerQueue = SecondaryPlayerQueueFactory.getInstance()!!

    private val sound: Sound
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput)

        Updates for KMP build        
        {
var hashtable = hashtable
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.sound= hashtable.get(SOUND as Object) as Sound

    
                        if(this.sound == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No Sound Provided!!")

                                    }
                                
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerManager = allBinaryLayerManager
super.processAI(this.keyDirection)

    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    
    var layerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    var currentOwnerLayerX: Int = layerInterface!!.getXP()!!


    
                        if(currentOwnerLayerX <  -layerInterface!!.getWidth())
                        
                                    {
                                    
    var y: Int = MyRandomFactory.getInstance()!!.getAbsoluteNextIntAllowZero(50)!!

layerInterface!!.setPosition(displayInfoSingleton!!.getLastWidth() +layerInterface!!.getWidth() +50, y, layerInterface!!.getZP())
firedIndex= 0
this.firingX= displayInfoSingleton!!.getLastHalfWidth() +MyRandomFactory.getInstance()!!.getNextInt(displayInfoSingleton!!.getLastHalfWidth())
secondaryPlayerQueue!!.add(this.sound)

                                    }
                                

    
                        if(currentOwnerLayerX < this.firingX && currentOwnerLayerX >  -layerInterface!!.getWidth())
                        
                                    {
                                    super.processAI(Canvas.KEY_NUM1)

    var gameLayerManager: AllBinaryGameLayerManager = allBinaryLayerManager as AllBinaryGameLayerManager


    var FIRE: Int = (gameLayerManager!!.getGameInfo()!!.getCurrentLevel() +12) shr 2


    
                        if(FIRE > MAX_FIRE)
                        
                                    {
                                    FIRE= MAX_FIRE

                                    }
                                

    
                        if(firedIndex > FIRE)
                        
                                    {
                                    firedIndex= 0
this.firingX= Integer.MIN_VALUE

                                    }
                                
firedIndex++

                                    }
                                

                                    }
                                
}


open fun nextDirection()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            

