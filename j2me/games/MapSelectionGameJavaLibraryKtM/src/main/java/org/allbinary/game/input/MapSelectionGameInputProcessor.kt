
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.system.security.licensing.LockedFeatureNotificationUtil
import org.allbinary.logic.system.security.licensing.LockedUtil
import org.allbinary.canvas.Processor
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.PreGameSelectorPaintable
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEventUtil
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound
import org.allbinary.media.graphics.geography.map.racetrack.MultiLevelRaceTrackGeographicMapInterfaceFactoryInterface
import org.allbinary.thread.ABRunnable
import org.allbinary.thread.SoundThreadPool
import org.allbinary.time.TimeDelayHelper

open public class MapSelectionGameInputProcessor : Processor
                , GameInputProcessorInterface
                , PlayerGameInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val gameCanvas: AllBinaryGameCanvas

    private val raceTrackGeographicMapInterfaceFactoryInterface: MultiLevelRaceTrackGeographicMapInterfaceFactoryInterface

    private val preGameSelectorPaintable: PreGameSelectorPaintable

    private val inputTimeHelper: TimeDelayHelper = TimeDelayHelper(650)

    private val playerGameInput: PlayerGameInput

    private val lockedIndex: Int

    private val abRunnable: ABRunnable = object: ABRunnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.setRunning(true)
SecondaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())

    var track: Int = preGameSelectorPaintable!!.getPreGameSelectionForm()!!.getSelectedIndex() +1


    var wave: Int = raceTrackGeographicMapInterfaceFactoryInterface!!.getFirstWaveWithTrack(track)!!

gameCanvas!!.getLayerManager()!!.getGameInfo()!!.setCurrentLevel(wave)
gameCanvas!!.buildGame(false)
GameKeyEventHandler.getInstance()!!.removeListener(getPlayerGameInput())
this.setRunning(false)
} catch(e: Exception)
            {
this.setRunning(false)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            
public constructor        (gameCanvas: AllBinaryGameCanvas, raceTrackGeographicMapInterfaceFactoryInterface: MultiLevelRaceTrackGeographicMapInterfaceFactoryInterface, mapSelectorPaintable: PreGameSelectorPaintable, lockedIndex: Int){
var gameCanvas = gameCanvas
var raceTrackGeographicMapInterfaceFactoryInterface = raceTrackGeographicMapInterfaceFactoryInterface
var mapSelectorPaintable = mapSelectorPaintable
var lockedIndex = lockedIndex
this.gameCanvas= gameCanvas
this.raceTrackGeographicMapInterfaceFactoryInterface= raceTrackGeographicMapInterfaceFactoryInterface
this.preGameSelectorPaintable= mapSelectorPaintable
this.playerGameInput= GameInputProcessorComposite("Map Selection", this)
this.lockedIndex= lockedIndex
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{
this.getPlayerGameInput()!!.update()
}


                @Throws(Exception::class)
            
open fun onInput(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list

    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var anyType: Any = list.get(index)!!


    var key: Int = GameKeyEventUtil.getKey(anyType)!!


    
                        if(key == Canvas.LEFT || key == Canvas.RIGHT || key == Canvas.UP || key == Canvas.DOWN)
                        
                                    {
                                    
    
                        if(inputTimeHelper!!.isTime())
                        
                                    {
                                    SecondaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())
this.preGameSelectorPaintable!!.getPreGameSelectionForm()!!.processInput(key)
break;

                    

                                    }
                                

                                    }
                                
                             else 
    
                        if(key == Canvas.KEY_NUM0)
                        
                                    {
                                    
    var selectedIndex: Int = this.preGameSelectorPaintable!!.getPreGameSelectionForm()!!.getSelectedIndex()!!


    
                        if(selectedIndex < this.lockedIndex || !LockedUtil.getInstance()!!.isLockedFeature())
                        
                                    {
                                    
    
                        if(!abRunnable!!.isRunning())
                        
                                    {
                                    abRunnable!!.setRunning(true)

    var thread: Thread = Thread(abRunnable)

thread.start()

                                    }
                                
break;

                    

                                    }
                                
                        else {
                            LockedFeatureNotificationUtil.getInstance()!!.fire()

                        }
                            

                                    }
                                
list.clear()
}

}


                @Throws(Exception::class)
            
open fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager
}


open fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toString()
}


open fun getPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: PlayerGameInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerGameInput
}


}
                
            

