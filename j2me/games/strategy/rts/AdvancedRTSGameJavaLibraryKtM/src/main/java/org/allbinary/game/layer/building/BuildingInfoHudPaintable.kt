
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.building




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.layer.NullPathFindingLayer
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.hud.basic.NumberStringHud
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.math.MathUtil

open public class BuildingInfoHudPaintable : SelectionHudPaintable {
        
companion object {
            
    private val instance: BuildingInfoHudPaintable = BuildingInfoHudPaintable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BuildingInfoHudPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val HEALTH: String = "Health:"

    private val productivityHud: NumberStringHud

    private val efficiencyHud: NumberStringHud

    private val healthHud: NumberStringHud

    private val maxHealthHud: NumberStringHud

    private var rtsLayer: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER
private constructor (){

    var productivityHud: NumberStringHud = NumberStringHud.NULL_NUMBER_STRING_HUD


    var efficiencyHud: NumberStringHud = NumberStringHud.NULL_NUMBER_STRING_HUD


    var healthHud: NumberStringHud = NumberStringHud.NULL_NUMBER_STRING_HUD


    var maxHealthHud: NumberStringHud = NumberStringHud.NULL_NUMBER_STRING_HUD


        try {
            
    var index: Int = 0


    var basicHudFactory: BasicHudFactory = BasicHudFactory.getInstance()!!


    var DEFAULT_CHAR_HEIGHT: Int = myFont!!.DEFAULT_CHAR_HEIGHT

productivityHud= NumberStringHud("Productivity:", 999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, this.textX, y +((index +1) *DEFAULT_CHAR_HEIGHT), 0, this.getBasicColorP())
index++
efficiencyHud= NumberStringHud("Efficiency:", 999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, this.textX, y +((index +1) *DEFAULT_CHAR_HEIGHT), 0, this.getBasicColorP())
index++

    var totalLength: Int = HEALTH.length +1

healthHud= NumberStringHud(HEALTH, 99999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, this.textX, y +((index +1) *DEFAULT_CHAR_HEIGHT), 0, this.getBasicColorP())
maxHealthHud= NumberStringHud("/ ", 99999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, this.textX +(totalLength *DEFAULT_CHAR_HEIGHT), y +((index +1) *DEFAULT_CHAR_HEIGHT), 0, this.getBasicColorP())
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

this.productivityHud= productivityHud
this.efficiencyHud= efficiencyHud
this.healthHud= healthHud
this.maxHealthHud= maxHealthHud
}


    override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var basicColor = basicColor
super.setBasicColorP(basicColor)
this.productivityHud!!.setBasicColorP(basicColor)
this.efficiencyHud!!.setBasicColorP(basicColor)
this.healthHud!!.setBasicColorP(basicColor)
this.maxHealthHud!!.setBasicColorP(basicColor)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)
this.productivityHud!!.paint(graphics)
this.efficiencyHud!!.paint(graphics)
this.healthHud!!.paint(graphics)
this.maxHealthHud!!.paint(graphics)
this.getAnimationInterface()!!.paint(graphics, this.imageX, y)
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var buildingLayer: BuildingLayer = this.rtsLayer as BuildingLayer

this.setName(buildingLayer!!.getName())
this.setAnimationInterface(buildingLayer!!.getVerticleBuildAnimationInterface())
this.productivityHud!!.set(buildingLayer!!.getProductivity())
this.efficiencyHud!!.set(buildingLayer!!.getEfficiency() /100)

    var health: Int = buildingLayer!!.getHealthInterface()!!.getHealth()!!

this.healthHud!!.set(health)

    var totalLength: Int = HEALTH.length +MathUtil.getInstance()!!.getTotalDigits(health)

this.maxHealthHud!!.setX(this.textX +MyFont.getInstance()!!.stringWidth(totalLength))
this.maxHealthHud!!.set(buildingLayer!!.getHealthInterface()!!.getMaxHealth())
}


    open fun setRtsLayer(rtsLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.rtsLayer= rtsLayer
}


}
                
            

