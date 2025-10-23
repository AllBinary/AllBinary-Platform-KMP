
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.java.character.CharArrayFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.input.motion.button.CommonButtons

open public class UpgradableRTSLayerHudPaintable : SelectionHudPaintable {
        
companion object {
            
    private val instance: UpgradableRTSLayerHudPaintable = UpgradableRTSLayerHudPaintable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UpgradableRTSLayerHudPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val PERCENT: String = "%"

    private var rtsLayer: CollidableDestroyableDamageableLayer = CollidableDestroyableDamageableLayer.NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER

    var costY: Int= 0

    var costY1: Int= 0

    private var percentCompleteX2: Int= 0

    private lateinit var rtsLayerCompositePaintableLateInit: RTSLayerCompositePaintable
private constructor (){
}


    override fun update()
        //nullable = true from not(false or (false and true)) = true
{
super.update()

    var myFont: MyFont = MyFont.getInstance()!!


    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT

this.costY= (y +CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE)
this.costY1= (y +CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE -(charHeight))
this.percentCompleteX2= this.imageX +CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE -myFont!!.charWidth()

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(displayInfoSingleton!!.getLastWidth() > 320)
                        
                                    {
                                    this.rtsLayerCompositePaintableLateInit= UpgradableWideRTSLayerPaintable(this)

                                    }
                                
                        else {
                            this.rtsLayerCompositePaintableLateInit= RTSLayerCompositePaintable(this)

                        }
                            
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var rtsLayer: RTSLayer = this.getRtsLayer() as RTSLayer

this.rtsLayerCompositePaintableLateInit!!.update(rtsLayer)
this.setAnimationInterface(rtsLayer!!.getVerticleBuildAnimationInterface())
this.setName(rtsLayer!!.getName())
}


    private var percentComplete: Int= 0

    private var percentCompleteX: Int= 0

    private var percentCompleteArray: CharArray = CharArrayFactory.getInstance()!!.getZeroCharArray()!!

    private var currentTotalDigits: Int= 0

    override fun updateInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var rtsLayer: RTSLayer = this.getRtsLayer() as RTSLayer

this.percentComplete= rtsLayer!!.getPercentComplete()

    
                        if(percentComplete < 10)
                        
                                    {
                                    this.percentCompleteX= 32

                                    }
                                
                             else 
    
                        if(percentComplete < 100)
                        
                                    {
                                    this.percentCompleteX= 24

                                    }
                                
                        else {
                            this.percentCompleteX= 16

                        }
                            
this.percentCompleteArray= this.getPrimitiveLongUtil()!!.getCharArray(percentComplete)
this.currentTotalDigits= this.getPrimitiveLongUtil()!!.getCurrentTotalDigits()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)
this.rtsLayerCompositePaintableLateInit!!.paint(graphics)
graphics.drawChars(percentCompleteArray, 0, this.currentTotalDigits, this.imageX +this.percentCompleteX, costY, 0)
graphics.drawString(this.PERCENT, this.percentCompleteX2, costY, 0)
this.getAnimationInterface()!!.paint(graphics, this.imageX, y)
}


    open fun setRtsLayer(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.rtsLayer= rtsLayer
}


    open fun getRtsLayer()
        //nullable = true from not(false or (false and true)) = true
: CollidableDestroyableDamageableLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayer
}


}
                
            

