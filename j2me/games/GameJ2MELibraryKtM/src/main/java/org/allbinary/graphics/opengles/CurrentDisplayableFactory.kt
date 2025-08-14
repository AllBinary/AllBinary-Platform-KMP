
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
        package org.allbinary.graphics.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.DemoCanvas
import org.allbinary.game.displayable.canvas.GameInputMappingCanvas
import org.allbinary.game.displayable.canvas.GameInputMappingInstructionsCanvas
import org.allbinary.game.displayable.canvas.GameRunnable
import org.allbinary.game.displayable.canvas.NullDisplayable
import org.allbinary.game.displayable.canvas.NullWaitGameRunnable
import org.allbinary.game.layer.SWTUtil
import org.allbinary.game.score.displayable.HighScoresCanvas
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.thread.NullRunnable
import org.allbinary.util.BasicArrayList

open public class CurrentDisplayableFactory
            : Object
         {
        

        companion object {
            
    private val instance: CurrentDisplayableFactory = CurrentDisplayableFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CurrentDisplayableFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!
            

    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    private val SET_DISPLAYABLE: String = "setDisplayable"

    private val SET_RUNNABLE: String = "setRunnable"

    private val CLEAR_RUNNABLE: String = "clearRunnable"

    private val SET_USED_RUNNABLE: String = "setUsedRunnable"

    private val RUNNABLE: String = "Runnable: "

    private val RUNNABLE_WAS_ALREADY_IN_USE: String = "Runnable was already in use: "

    val DEFAULT_CHILD_NAME_LIST: BasicArrayList = BasicArrayList()

    private var displayable: Displayable = NullDisplayable.getInstance()!!
            

    private var openGlReadydisplayable: Displayable = NullDisplayable.getInstance()!!
            

    private var runnable: GameRunnable = NullWaitGameRunnable.getInstance()!!
            

    private var usedRunnable: GameRunnable = NullWaitGameRunnable.getInstance()!!
            
private constructor        ()
            : super()
        {this.DEFAULT_CHILD_NAME_LIST.add(this.canvasStrings!!.ABOUT)
this.DEFAULT_CHILD_NAME_LIST.add(this.canvasStrings!!.OPTIONS)
this.DEFAULT_CHILD_NAME_LIST.add(GameInputMappingCanvas.NAME)
this.DEFAULT_CHILD_NAME_LIST.add(GameInputMappingInstructionsCanvas.NAME)
this.DEFAULT_CHILD_NAME_LIST.add(HighScoresCanvas.NAME)
}


open fun setMyCanvas(displayable: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayable = displayable

    
                        if(this.displayable is MyCanvas)
                        
                                    {
                                    
    
                        if(displayable.hasChild(this.displayable as MyCanvas))
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(
                            "Child Displayable is already set for: ")!!.append(this.stringUtil!!.toString(displayable))!!.toString(), this, SET_DISPLAYABLE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

                                    }
                                
this.setDisplayable(displayable)
}


open fun setDisplayable(displayable: Displayable)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayable = displayable
this.displayable= displayable
this.setOpenGlReadydisplayable(displayable)
}


open fun setOpenGlReadydisplayable(openGlReadydisplayable: Displayable)
        //nullable = true from not(false or (false and false)) = true
{

                    var openGlReadydisplayable = openGlReadydisplayable
this.openGlReadydisplayable= openGlReadydisplayable
this.update()
}


open fun getOpenGlReadydisplayable()
        //nullable = true from not(false or (false and true)) = true
: Displayable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return openGlReadydisplayable
}


open fun setRunnable(runnable: GameRunnable)
        //nullable = true from not(false or (false and false)) = true
{

                    var runnable = runnable
PreLogUtil.put(StringMaker().
                            append(RUNNABLE)!!.append(this.stringUtil!!.toString(runnable))!!.toString(), this, SET_RUNNABLE)
this.runnable= runnable

    
                        if(this.usedRunnable != this.runnable)
                        
                                    {
                                    this.update()

                                    }
                                
                        else {
                            PreLogUtil.put(StringMaker().
                            append(RUNNABLE_WAS_ALREADY_IN_USE)!!.append(this.stringUtil!!.toString(runnable))!!.toString(), this, SET_RUNNABLE)

                        }
                            
}


open fun clearRunnable()
        //nullable = true from not(false or (false and true)) = true
{PreLogUtil.put(StringMaker().
                            append(RUNNABLE)!!.append(this.stringUtil!!.toString(NullRunnable.getInstance()))!!.toString(), this, CLEAR_RUNNABLE)
this.setUsedRunnable(NullWaitGameRunnable.getInstance())
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{
        
        //synchronized(this) 
        //mutex.withLock
        
    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    var stringMaker: StringMaker = StringMaker()

stringMaker!!.append(this.stringUtil!!.toString(openGlReadydisplayable))

    
                        if(SWTUtil.isSWT && !features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    PreLogUtil.put(stringMaker!!.append(commonSeps!!.SPACE)!!.append(SWTUtil.SWT)!!.append(commonSeps!!.SPACE)!!.append(RUNNABLE)!!.append(this.stringUtil!!.toString(NullRunnable.getInstance()))!!.toString(), this, commonStrings!!.UPDATE)
this.setUsedRunnable(NullWaitGameRunnable.getInstance())

                                    }
                                
                             else 
    
                        if(features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML))
                        
                                    {
                                    PreLogUtil.put(stringMaker!!.append(commonSeps!!.SPACE)!!.append(HTMLFeatureFactory.getInstance()!!.HTML.toString())!!.append(commonSeps!!.SPACE)!!.append(RUNNABLE)!!.append(this.stringUtil!!.toString(runnable))!!.toString(), this, commonStrings!!.UPDATE)
this.setUsedRunnable(runnable)

                                    }
                                
                             else 
    
                        if(openGlReadydisplayable is DemoCanvas || openGlReadydisplayable is AllBinaryGameCanvas || features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    PreLogUtil.put(stringMaker!!.append(commonSeps!!.SPACE)!!.append(OpenGLFeatureFactory.getInstance()!!.OPENGL.toString())!!.append(commonSeps!!.SPACE)!!.append(RUNNABLE)!!.append(this.stringUtil!!.toString(runnable))!!.toString(), this, commonStrings!!.UPDATE)
this.setUsedRunnable(runnable)

                                    }
                                
                        else {
                            PreLogUtil.put(stringMaker!!.append(RUNNABLE)!!.append(this.stringUtil!!.toString(NullRunnable.getInstance()))!!.toString(), this, commonStrings!!.UPDATE)
this.setUsedRunnable(NullWaitGameRunnable.getInstance())

                        }
                            


}


open fun getDisplayable()
        //nullable = true from not(false or (false and true)) = true
: Displayable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return displayable
}


open fun getUsedRunnable()
        //nullable = true from not(false or (false and true)) = true
: GameRunnable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usedRunnable
}


open fun setUsedRunnable(usedRunnable: GameRunnable)
        //nullable = true from not(false or (false and false)) = true
{

                    var usedRunnable = usedRunnable
PreLogUtil.put(StringMaker().
                            append(RUNNABLE)!!.append(this.stringUtil!!.toString(runnable))!!.toString(), this, SET_USED_RUNNABLE)
this.usedRunnable= usedRunnable
}


}
                
            

