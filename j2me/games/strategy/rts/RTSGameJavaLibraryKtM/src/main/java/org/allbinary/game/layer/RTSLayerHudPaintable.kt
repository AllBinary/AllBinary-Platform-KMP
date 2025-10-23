
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.AndroidUtil
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.part.weapon.BasicWeaponPart

open public class RTSLayerHudPaintable : SelectionHudPaintable {
        
companion object {
            
    private val instance: RTSLayerHudPaintable = RTSLayerHudPaintable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSLayerHudPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var weaponProperties: Array<String?> = StringUtil.getInstance()!!.getArrayInstance()!!

    private var rtsLayer: CollidableDestroyableDamageableLayer = CollidableDestroyableDamageableLayer.NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER

    var costY: Int= 0

    var costY1: Int= 0
private constructor (){
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var charHeight: Int = this.myFont!!.DEFAULT_CHAR_HEIGHT

this.setName(this.getRtsLayer()!!.getName())

    var partInterface: BasicWeaponPart = this.getRtsLayer()!!.getPartInterfaceArray()[0]!! as BasicWeaponPart

this.weaponProperties= partInterface!!.getWeaponProperties()!!.toStringArray()
this.costY1= (y +((weaponProperties!!.size +1) *charHeight))

    
                        if(!AndroidUtil.isAndroid())
                        
                                    {
                                    this.costY= this.costY1

                                    }
                                
                        else {
                            this.costY= (y +((weaponProperties!!.size +2) *charHeight))

                        }
                            
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)

    var charHeight: Int = this.myFont!!.DEFAULT_CHAR_HEIGHT


    var size: Int = weaponProperties!!.size
                





                        for (index in 0 until size)

        {
graphics.drawString(weaponProperties[index]!!, this.textX, y +((index +1) *charHeight), 0)
}

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
                
            

