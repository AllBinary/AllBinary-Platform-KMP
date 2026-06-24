
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.layer.NullPathFindingLayer
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.hud.basic.NumberStringHud
import org.allbinary.game.layer.hud.basic.NumberStringHudFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.logic.math.MathUtil

open public class BuildingInfoHudPaintable : SelectionHudPaintable {
        
companion object {
            
    private val instance: BuildingInfoHudPaintable = BuildingInfoHudPaintable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BuildingInfoHudPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BuildingInfoHudPaintable.instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val HEALTH: String = "Health:"

    private val productivityHud: NumberStringHud

    private val efficiencyHud: NumberStringHud

    private val healthHud: NumberStringHud

    private val maxHealthHud: NumberStringHud

    private var rtsLayer: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER

    private var currentHealth: Int = 0
private constructor (){

    var numberStringHudFactory: NumberStringHudFactory = NumberStringHudFactory.getInstance()!!


    var productivityHud: NumberStringHud = numberStringHudFactory!!.NULL_NUMBER_STRING_HUD


    var efficiencyHud: NumberStringHud = numberStringHudFactory!!.NULL_NUMBER_STRING_HUD


    var healthHud: NumberStringHud = numberStringHudFactory!!.NULL_NUMBER_STRING_HUD


    var maxHealthHud: NumberStringHud = numberStringHudFactory!!.NULL_NUMBER_STRING_HUD


        try {
            
    var index: Int = 0


    var basicHudFactory: BasicHudFactory = BasicHudFactory.getInstance()!!


    var basicColor: BasicColor = this.getBasicColorP()!!


    var textX: Int = this.textX


    var y: Int = this.y


    var firstIndex: Int = index


open class ProductivityNumberStringHud : NumberStringHud {
        
 constructor ()                        

                            : super("Productivity:", 999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, 0, basicColor){


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.updateMaxWidth= textX
this.updateMaxHeight= y +((firstIndex +1) *font.getHeight())
super.updateMeasurement(graphics)
}


}
                
            

                    //Otherwise - statement - EmptyStmt

productivityHud= ProductivityNumberStringHud()
index++

    var secondIndex: Int = index


open class EfficiencyNumberStringHud : NumberStringHud {
        
 constructor ()                        

                            : super("Efficiency:", 999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, 0, basicColor){


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
super.updateMeasurement(graphics)

    var font: Font = graphics.getFont()!!

this.updateMaxWidth= textX
this.updateMaxHeight= y +((secondIndex +1) *font.getHeight())
}


}
                
            

                    //Otherwise - statement - EmptyStmt

efficiencyHud= EfficiencyNumberStringHud()
index++

    var HEALTH: String = this.HEALTH


    var thirdIndex: Int = index


open class HealthNumberStringHud : NumberStringHud {
        
 constructor ()                        

                            : super(HEALTH, 99999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, 0, basicColor){


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.updateMaxWidth= textX
this.updateMaxHeight= y +((thirdIndex +1) *font.getHeight())
super.updateMeasurement(graphics)
}


}
                
            

                    //Otherwise - statement - EmptyStmt


    var totalLength: Int = HEALTH.length +1

healthHud= HealthNumberStringHud()

    var fourthIndex: Int = index


open class MaxHealthNumberStringHud : NumberStringHud {
        
 constructor ()                        

                            : super("/ ", 99999, basicHudFactory!!.ABSOLUTE, basicHudFactory!!.HORIZONTAL, 0, basicColor){


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
super.updateMeasurement(graphics)

    var font: Font = graphics.getFont()!!

this.updateMaxWidth= textX +(totalLength *font.getHeight())
this.updateMaxHeight= y +((fourthIndex +1) *font.getHeight())
}


}
                
            

                    //Otherwise - statement - EmptyStmt

maxHealthHud= MaxHealthNumberStringHud()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

this.productivityHud= productivityHud
this.efficiencyHud= efficiencyHud
this.healthHud= healthHud
this.maxHealthHud= maxHealthHud
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!


    var totalLength: Int = this.HEALTH.length +MathUtil.getInstance()!!.getTotalDigits(this.currentHealth)

this.maxHealthHud!!.setX(this.textX +MyFontProcessor.defaultStringWidth(font, totalLength))
this.myFontProcessor= MyFontProcessor.getInstance()
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
this.myFontProcessor!!.process(graphics)
this.productivityHud!!.paint(graphics)
this.efficiencyHud!!.paint(graphics)
this.healthHud!!.paint(graphics)
this.maxHealthHud!!.paint(graphics)
this.getAnimationInterface()!!.paintXY(graphics, this.imageX, this.y)
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var buildingLayer: BuildingLayer = this.rtsLayer as BuildingLayer

this.setName(buildingLayer!!.getName())
this.setAnimationInterface(buildingLayer!!.getVerticleBuildAnimationInterface())
this.productivityHud!!.set(buildingLayer!!.getProductivity())
this.efficiencyHud!!.set(buildingLayer!!.getEfficiency() /100)
this.currentHealth= buildingLayer!!.getHealthInterface()!!.getHealth()
this.healthHud!!.set(this.currentHealth)
this.myFontProcessor= this.updateMyFontProcessor
this.maxHealthHud!!.set(buildingLayer!!.getHealthInterface()!!.getMaxHealth())
}


    open fun setRtsLayer(rtsLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.rtsLayer= rtsLayer
}


}
                
            

