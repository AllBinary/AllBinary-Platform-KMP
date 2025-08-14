
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.view.ViewPosition
import org.allbinary.view.event.ViewPositionEvent
import org.allbinary.view.event.ViewPositionEventListenerInterface

open public class AllBinaryGameLayer : AllBinaryLayer
                , ViewPositionEventListenerInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val RED: BasicColor = BasicColorFactory.getInstance()!!.RED

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!
            

    private val paintable: Paintable = if(SWTUtil.isSWT) {
                            
                            object: Paintable()
                                {
                                
    private val BLACK: BasicColor = BasicColorFactory.getInstance()!!.BLACK

open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
basicSetColorUtil!!.setBasicColorP(graphics, BLACK)
}

                                }
                            
                        
                            } else {
                            NullPaintable.getInstance()
                            }
    

    private val gameKeyEventList: BasicArrayList = BasicArrayList()
public constructor        (layerInfo: Rectangle)                        

                            : this(layerInfo, ViewPosition()){

                    var layerInfo = layerInfo


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(layerInfo, viewPosition){

                    var layerInfo = layerInfo


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(name, layerInfo, viewPosition){

                    var name = name


                    var layerInfo = layerInfo


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}


open fun move()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getGameKeyEventList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEventList
}


                @Throws(Exception::class)
            
open fun processInput(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun onViewPositionChangeEvent()
        //nullable = true from not(false or (false and true)) = true
{this.onChangeEvent(this.viewPositionEvent)
}


                @Throws(Exception::class)
            override fun onChangeEvent(layerManagerEvent: ViewPositionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManagerEvent = layerManagerEvent

    
                        if(GameLayerUtil.isOnScreen(this))
                        
                                    {
                                    this.setVisible(true)

                                    }
                                
                        else {
                            this.setVisible(false)

                        }
                            
}


open fun paintFirst(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.paintable.paint(graphics)
}


open fun paintDebug(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var viewPosition: ViewPosition = this.getViewPosition()!!
            


    var viewX: Int = viewPosition!!.getX()!!
            


    var viewY: Int = viewPosition!!.getY()!!
            

this.basicSetColorUtil!!.setBasicColorP(graphics, RED)
graphics.drawRect(viewX, viewY, this.getWidth(), this.getHeight())
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width
super.setLayerWidth(width)
this.setHalfWidth(width shr 1)
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height
super.setLayerHeight(height)
this.setHalfHeight(height shr 1)
}


}
                
            

