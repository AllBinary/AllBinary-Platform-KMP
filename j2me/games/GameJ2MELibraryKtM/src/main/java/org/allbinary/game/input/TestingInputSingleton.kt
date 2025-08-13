
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.util.BasicArrayList

open public class TestingInputSingleton : AllBinaryGameLayer
                , GameInputInterface {
        

        companion object {
            
    private val instance: TestingInputSingleton = TestingInputSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TestingInputSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val inputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)
private constructor        ()                        

                            : super(RectangleFactory.SINGLETON){

                            //For kotlin this is before the body of the constructor.
                    
GameInputProcessorUtil.init(this.inputProcessorArray)
}


    private var paintable: PaintableInterface = NullPaintable.getInstance()!!
            
override fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{}


open fun initInputProcessors(aTestInputInterface: TestInputInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var aTestInputInterface = aTestInputInterface

    var testInputInterface: TestInputInterface = aTestInputInterface

this.paintable= testInputInterface
this.inputProcessorArray[Canvas.UP]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.up()
}

                                }
                            
this.inputProcessorArray[Canvas.DOWN]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.down()
}

                                }
                            
this.inputProcessorArray[Canvas.LEFT]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.left()
}

                                }
                            
this.inputProcessorArray[Canvas.RIGHT]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.right()
}

                                }
                            
this.inputProcessorArray[Canvas.KEY_NUM7]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.strafeLeft()
}

                                }
                            
this.inputProcessorArray[Canvas.KEY_NUM9]= object: GameInputProcessor()
                                {
                                
                @Throws(Exception::class)
            
open override fun process(allbinaryLayerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var gameKeyEvent = gameKeyEvent
testInputInterface!!.strafeRight()
}

                                }
                            
GameInputProcessorUtil.init(this.inputProcessorArray)
}


                @Throws(Exception::class)
            
open fun processInput(allbinaryLayerManager: AllBinaryLayerManager, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var list = list

    var key: Int = 0


    var gameKeyEvent: GameKeyEvent


    var size: Int = list.size()!!
            





                        for (index in 0 until size)


        {gameKeyEvent= (list.objectArray[index]!! as GameKeyEvent)
key= gameKeyEvent!!.getKey()
inputProcessorArray[key]!!.process(allbinaryLayerManager, GameKeyEvent.NONE)
}

}


                @Throws(Exception::class)
            override fun processInput(allbinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager
this.processInput(allbinaryLayerManager, this.getGameKeyEventList())
this.getGameKeyEventList()!!.clear()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.paintable.paint(graphics)
}

override fun implmentsGameInputInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

