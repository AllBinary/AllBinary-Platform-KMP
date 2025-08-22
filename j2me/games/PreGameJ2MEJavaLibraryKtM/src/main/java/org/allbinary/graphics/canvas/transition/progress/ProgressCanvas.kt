
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
        package org.allbinary.graphics.canvas.transition.progress




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.NullCanvas
import org.allbinary.canvas.Processor
import org.allbinary.canvas.RunnableCanvas
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.form.item.CustomGaugeItem
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.midlet.AllBinaryMidlet
import org.allbinary.thread.PathFindingThreadPool
import org.allbinary.thread.ThreadPool

open public class ProgressCanvas : RunnableCanvas
                , PaintableInterface {
        

    var hasPainted: Boolean= false

    private val backgroundBasicColor: BasicColor

    val GAUGE_PAINTABLE: Paintable = object: Paintable()
                                {
                                
open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
paint2(graphics)
}

                                }
                            

    var allbinaryMidlet: AllBinaryMidlet = AllBinaryMidlet.NULL_ALLBINARY_MIDLET

    private var value: Float= 0.0f

    private val maxValue: Float = 100.0f

    val gauge: CustomGaugeItem

    private val TEXT: String = commonStrings!!.LOADING

    private var text: String = TEXT

    private var background: Boolean = true

    var paintable: PaintableInterface = GAUGE_PAINTABLE

    var inProgress: Boolean = false

    private val IN_GAME_PROCESSOR: Processor = object: Processor()
                                {
                                
    private val pathFindingThreadPool: ThreadPool = PathFindingThreadPool.getInstance()!!

                @Throws(Exception::class)
            
open override fun process()
        //nullable = true from not(false or (false and true)) = true
{pathFindingThreadPool!!.runAPriorityTask()
}

                                }
                            

    var inGameProcessor: Processor = Processor.getInstance()!!
 constructor        (){this.paintable= NullPaintable.getInstance()
this.backgroundBasicColor= BasicColorFactory.getInstance()!!.WHITE
this.gauge= CustomGaugeItem.NULL_GAUGE_ITEM
}

 constructor        (title: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor){

                    var title = title


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor
this.backgroundBasicColor= backgroundBasicColor
this.gauge= CustomGaugeItem(StringUtil.getInstance()!!.EMPTY_STRING, maxValue.toInt(), 0, backgroundBasicColor, foregroundBasicColor)
}


open fun init(gameMidlet: AllBinaryMidlet)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameMidlet = gameMidlet
this.allbinaryMidlet= gameMidlet
}


                @Throws(Exception::class)
            
open fun update(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
}


open fun getMaxValue()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxValue
}


open fun start()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.START_METHOD_NAME)
this.setBackground(true)
this.gauge.setHeight(30)
this.gauge.setLabel(commonStrings!!.PLEASE_WAIT)
this.setText(TEXT)
this.setValue(0)
this.inGameProcessor= Processor.getInstance()
this.paintable= GAUGE_PAINTABLE
this.inProgress= true
}


    private val backgroundLabel: String = "Background AI Game Loading..."

    private val START_BACKGROUND: String = "startBackground"

open fun startBackground(background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
logUtil!!.put(commonStrings!!.START, this, START_BACKGROUND)

    var myFont: MyFont = MyFont.getInstance()!!

this.setBackground(background)
this.gauge.setHeight(myFont!!.DEFAULT_CHAR_HEIGHT +2)
this.gauge.setLabel(backgroundLabel)
this.setText(TEXT)
this.setValue(0)
this.inGameProcessor= Processor.getInstance()
this.paintable= GAUGE_PAINTABLE
}


open fun endActual()
        //nullable = true from not(false or (false and true)) = true
{this.allbinaryMidlet!!.commandAction(GameCommandsFactory.getInstance()!!.SHOW_GAME_CANVAS, NullCanvas.NULL_CANVAS)
this.inProgress= false
this.inGame()
}


open fun inGame()
        //nullable = true from not(false or (false and true)) = true
{this.inGameProcessor= IN_GAME_PROCESSOR
}


open fun end()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.END_METHOD_NAME)
this.gauge.setValue(this.getMaxValue())
this.endActual()
this.paintable= NullPaintable.getInstance()
}


open fun endFromInitialLazyLoadingComplete()
        //nullable = true from not(false or (false and true)) = true
{this.gauge.setValue(this.getMaxValue())
this.inGameProcessor= IN_GAME_PROCESSOR
}


open fun endIfPaintedSinceStart()
        //nullable = true from not(false or (false and true)) = true
{}


    val ADD_PORTION: String = "addPortion"

    val ADD_EARLY_PORTION: String = "addEarlyPortion"

open fun addEarlyPortion(value: Int, text: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text


                    var index = index
this.setText(StringMaker().
                            append(text)!!.append(SmallIntegerSingletonFactory.getInstance()!!.getInstance(index)!!.toString())!!.toString())
this.gauge.setValue(this.gauge.getValue() +this.getMaxValue() /value)
}


open fun addPortion(value: Int, text: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text


                    var index = index
this.setText(StringMaker().
                            append(text)!!.append(SmallIntegerSingletonFactory.getInstance()!!.getInstance(index)!!.toString())!!.toString())
PreLogUtil.put(this.text, this, ADD_PORTION)
this.gauge.setValue(this.gauge.getValue() +this.getMaxValue() /value)
}


open fun addPortion(value: Int, text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text

    
                        if(this.text != text)
                        
                                    {
                                    PreLogUtil.put(text, this, ADD_PORTION)

                                    }
                                
this.setText(text)
this.gauge.setValue(this.gauge.getValue() +this.getMaxValue() /value)
}


open fun setValue(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.value= value.toFloat()
this.gauge.setValue(value.toFloat())
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.paintable.paint(graphics)
}


open fun paint2(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

graphics.setColor(backgroundBasicColor!!.toInt())
graphics.fillRect(0, 0, displayInfoSingleton!!.getLastWidth(), displayInfoSingleton!!.getLastHeight())
gauge.paint(graphics, 0, 0)
hasPainted= true
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var text = text
this.text= text
}


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return text
}


open fun setBackground(background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
this.background= background
}


open fun isBackground()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return background
}


}
                
            

