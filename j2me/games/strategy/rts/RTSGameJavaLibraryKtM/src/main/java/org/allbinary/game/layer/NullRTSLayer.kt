
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import org.allbinary.game.combat.destroy.event.DestroyedEvent
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.game.input.form.NullRTSFormInputFactory
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.layer.hud.basic.notification.GameNotificationHud
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.media.audio.Sound

open public class NullRTSLayer : NullPathFindingLayer
                , RTSPlayerLayerInterface {
        
companion object {
            
    val NULL_RTS_LAYER: NullRTSLayer = NullRTSLayer()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager



                            throw RuntimeException()
}


    override fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


    override fun getGameNotificationHud()
        //nullable = true from not(false or (false and true)) = true
: GameNotificationHud{



                            throw RuntimeException()
}


    override fun getCurrentScrollSelectionForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{



                            throw RuntimeException()
}


    override fun setCurrentScrollSelectionForm(currentScrollSelectionForm: ScrollSelectionForm)
        //nullable = true from not(false or (false and false)) = true
{
var currentScrollSelectionForm = currentScrollSelectionForm



                            throw RuntimeException()
}


    override fun getBuildingScrollSelectionForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{



                            throw RuntimeException()
}


    override fun getPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: PlayerGameInput{



                            throw RuntimeException()
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun onDestroyed(destroyedEvent: DestroyedEvent)
        //nullable = true from not(false or (false and false)) = true
{
var destroyedEvent = destroyedEvent



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager



                            throw RuntimeException()
}


    override fun getCapital()
        //nullable = true from not(false or (false and true)) = true
: Capital{



                            throw RuntimeException()
}


    override fun getRTSFormInput()
        //nullable = true from not(false or (false and true)) = true
: RTSFormInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRTSFormInputFactory.getInstance()
}


    override fun add(sound: Sound)
        //nullable = true from not(false or (false and false)) = true
{
var sound = sound



                            throw RuntimeException()
}


    override fun getPlayerOwnedRTSLayers()
        //nullable = true from not(false or (false and true)) = true
: PlayerOwnedRTSLayers{



                            throw RuntimeException()
}


    override fun implmentsArtificialIntelligenceCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


}
                
            

