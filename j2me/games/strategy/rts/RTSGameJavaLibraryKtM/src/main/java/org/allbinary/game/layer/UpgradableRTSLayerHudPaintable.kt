
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.java.character.CharArrayFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.input.motion.button.CommonButtons

open public class UpgradableRTSLayerHudPaintable : SelectionHudPaintable {
        
companion object {
            
    private val instance: UpgradableRTSLayerHudPaintable = UpgradableRTSLayerHudPaintable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UpgradableRTSLayerHudPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UpgradableRTSLayerHudPaintable.instance
}


        }
            
    private val PERCENT: String = "%"

    private var rtsLayer: CollidableDestroyableDamageableLayer = CollidableDestroyableDamageableLayer.getNullInstance()!!

    var costY: Int= 0

    var costY1: Int= 0

    private var percentCompleteX2: Int= 0

    private lateinit var rtsLayerCompositePaintableLateInit: RTSLayerCompositePaintable

    private var charHeight: Int= 0

    private var charWidth: Int= 0
private constructor (){
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
super.updateMeasurement(graphics)

    var font: Font = graphics.getFont()!!

this.charHeight= font.getHeight()
this.charWidth= MyFontProcessor.defaultCharWidth(font)
}


    override fun update()
        //nullable = true from not(false or (false and true)) = true
{
super.update()

    var commonButtons: CommonButtons = CommonButtons.getInstance()!!

this.costY= (this.y +commonButtons!!.STANDARD_BUTTON_SIZE)
this.costY1= (this.y +commonButtons!!.STANDARD_BUTTON_SIZE -this.charHeight)
this.percentCompleteX2= this.imageX +commonButtons!!.STANDARD_BUTTON_SIZE -this.charWidth

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

    
                        if(this.percentComplete < 10)
                        
                                    {
                                    this.percentCompleteX= 32

                                    }
                                
                             else 
    
                        if(this.percentComplete < 100)
                        
                                    {
                                    this.percentCompleteX= 24

                                    }
                                
                        else {
                            this.percentCompleteX= 16

                        }
                            
this.percentCompleteArray= this.getPrimitiveLongUtil()!!.getCharArray(this.percentComplete)
this.currentTotalDigits= this.getPrimitiveLongUtil()!!.getCurrentTotalDigits()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)
this.rtsLayerCompositePaintableLateInit!!.paint(graphics)
graphics.drawChars(this.percentCompleteArray, 0, this.currentTotalDigits, this.imageX +this.percentCompleteX, this.costY, 0)
graphics.drawString(this.PERCENT, this.percentCompleteX2, this.costY, 0)
this.getAnimationInterface()!!.paintXY(graphics, this.imageX, this.y)
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
                        return this.rtsLayer
}


}
                
            

