
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
        package org.allbinary.game.health



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.layer.AllBinaryLayer

open public class HealthBarTwodAnimation : HealthBarAnimation {
        
public constructor        (layerInterface: AllBinaryLayer, location: Int)                        

                            : super(layerInterface, location){

                    var layerInterface = layerInterface


                    var location = location


                            //For kotlin this is before the body of the constructor.
                    
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y

    var ax: Int = this.allbinaryLayer!!.getViewPosition()!!.getX()!!
            

this.basicSetColorUtil!!.setBasicColorP(graphics, this.basicColor, this.colorP)
graphics!!.fillRect(ax, this.getY() -1, x2, this.thickness)
}


}
                
            

