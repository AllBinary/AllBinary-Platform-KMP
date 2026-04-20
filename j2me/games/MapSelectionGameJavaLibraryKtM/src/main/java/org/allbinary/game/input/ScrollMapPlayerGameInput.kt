
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.util.BasicArrayList
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.event.ScrollMapEvent
import org.allbinary.layer.event.ScrollMapEventHandler
import org.allbinary.media.graphics.geography.map.BasicGeographicMap

open public class ScrollMapPlayerGameInput : PlayerGameInput {
        

    val inputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)

    private val border: Int = 150

    private val inputList: BasicArrayList

    val isSingleKeyProcessing: Boolean = Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS) || Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_PRESS)

    private val geographicMapInterface: BasicGeographicMap

    private var maxBottom: Int= 0

    private var maxRight: Int= 0
public constructor (geographicMapInterface: BasicGeographicMap, list: BasicArrayList, playerInputId: Int)                        

                            : super(list, playerInputId){
var geographicMapInterface = geographicMapInterface
var list = list
var playerInputId = playerInputId


                            //For kotlin this is before the body of the constructor.
                    
this.initInputProcessors()
this.geographicMapInterface= geographicMapInterface
this.inputList= list
this.init()
}


    private val scrollMapEvent: ScrollMapEvent = ScrollMapEvent(this)

                @Throws(Exception::class)
            
    open fun move(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
var dx = dx
var dy = dy

    var terrainTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!

terrainTiledLayer!!.move( -dx,  -dy)
this.scrollMapEvent!!.setDxDy( -dx,  -dy)
ScrollMapEventHandler.getInstance()!!.fireEvent(this.scrollMapEvent)
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.maxBottom= this.getSpecialHeight()
this.maxRight= this.getSpecialWidth()
}


                @Throws(Exception::class)
            
    open fun scrollMiddleX()
        //nullable = true from not(false or (false and true)) = true
{

    var terrainTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

this.move( -terrainTiledLayer!!.getXP(), 0)

    
                        if(terrainTiledLayer!!.getWidth() < displayInfo!!.getLastWidth())
                        
                                    {
                                    
    var diffX: Int = ((displayInfo!!.getLastWidth() -terrainTiledLayer!!.getWidth()) shr 1)

this.move( -diffX, 0)

                                    }
                                
                        else {
                            
    var diffX: Int = ((terrainTiledLayer!!.getWidth() -displayInfo!!.getLastWidth()) shr 1)

this.move(diffX, 0)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun scrollY(anchor: Int)
        //nullable = true from not(false or (false and false)) = true
{
var anchor = anchor

    var terrainTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(anchor == Graphics.TOP)
                        
                                    {
                                    this.logUtil!!.putF("Top", this, "scrollY")

                                    }
                                
                             else 
    
                        if(anchor == Graphics.BOTTOM)
                        
                                    {
                                    this.logUtil!!.putF("Bottom", this, "scrollY")

    var diffY: Int = (terrainTiledLayer!!.getHeight() -displayInfo!!.getLastHeight())

this.move(0, diffY)

                                    }
                                
                             else 
    
                        if(anchor == Graphics.VCENTER)
                        
                                    {
                                    this.logUtil!!.putF("Center", this, "scrollY")

    var diffY: Int = (terrainTiledLayer!!.getHeight() -displayInfo!!.getLastHeight()) /2

this.move(0, diffY)

                                    }
                                
                        else {
                            


                            throw Exception("No Such Anchor Supported")

                        }
                            
}


                @Throws(Exception::class)
            
    open fun up()
        //nullable = true from not(false or (false and true)) = true
{

    var y: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP() -10


    
                        if(this.keepOnMapMinY(y))
                        
                                    {
                                    this.move(0,  -10)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun down()
        //nullable = true from not(false or (false and true)) = true
{

    var y: Int =  -this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP() +10


    
                        if(this.keepOnMapMaxY(y))
                        
                                    {
                                    this.move(0, 10)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun right()
        //nullable = true from not(false or (false and true)) = true
{

    var x: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP() +10


    
                        if(this.keepOnMapMinX(x))
                        
                                    {
                                    this.move(10, 0)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun left()
        //nullable = true from not(false or (false and true)) = true
{

    var x: Int =  -this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP() -10


    
                        if(this.keepOnMapMaxX(x))
                        
                                    {
                                    this.move( -10, 0)

                                    }
                                
}


    open fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{
this.inputProcessorArray[Canvas.UP]= ScrollMapUpGameInputProcessor(this)
this.inputProcessorArray[Canvas.DOWN]= ScrollMapDownGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_NUM9]= ScrollMapRightGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_NUM7]= ScrollMapLeftGameInputProcessor(this)
GameInputProcessorUtil.init(this.inputProcessorArray)
}


                @Throws(Exception::class)
            
    open fun processInput(key: Int)
        //nullable = true from not(false or (false and false)) = true
{
var key = key
this.inputProcessorArray[key]!!.process(AllBinaryGameLayerManager.NULL_ALLBINARY_LAYER_MANAGER, GameKeyEvent.NONE)
}


                @Throws(Exception::class)
            
    open fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager

        try {
            
    var size: Int = this.inputList!!.size()!!


    var key: Int = 0





                        for (index in 0 until size)

        {

    var gameKeyEvent: GameKeyEvent = this.inputList!!.get(index) as GameKeyEvent

key= gameKeyEvent!!.getKey()
this.processInput(key)
}


    
                        if(isSingleKeyProcessing)
                        
                                    {
                                    this.clear()

                                    }
                                
                        else {
                            this.update()

                        }
                            
} catch(e: Exception)
            {
this.logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.PROCESS_INPUT, e)
}

}


    open fun getSpecialHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var terrainTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(terrainTiledLayer!!.getHeight() > displayInfo!!.getLastHeight())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return terrainTiledLayer!!.getHeight() -displayInfo!!.getLastHeight()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return displayInfo!!.getLastHeight() -terrainTiledLayer!!.getHeight() +terrainTiledLayer!!.getCellHeight()

                        }
                            
}


    open fun getSpecialWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var terrainTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(terrainTiledLayer!!.getWidth() > displayInfo!!.getLastWidth())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return terrainTiledLayer!!.getWidth() -displayInfo!!.getLastWidth()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return displayInfo!!.getLastWidth() -terrainTiledLayer!!.getWidth() +terrainTiledLayer!!.getCellWidth()

                        }
                            
}


    open fun keepOnMapMaxY(newY: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var newY = newY

    var y: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP()!!


    
                        if(y > this.maxBottom +this.border)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


    open fun keepOnMapMinY(newY: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var newY = newY

    var y: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getYP()!!


    
                        if(y <  -this.border)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


    open fun keepOnMapMaxX(newX: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var newX = newX

    var x: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getXP()!!


    
                        if(x <  -this.maxRight -this.border)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


    open fun keepOnMapMinX(newX: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var newX = newX

    var x: Int = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!.getXP()!!


    
                        if(x > this.border)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


}
                
            

