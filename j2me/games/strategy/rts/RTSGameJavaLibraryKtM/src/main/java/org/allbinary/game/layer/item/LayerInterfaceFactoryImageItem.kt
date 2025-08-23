
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
        package org.allbinary.game.layer.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.form.item.CustomImageItem
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.layer.LayerInterfaceFactoryInterface

open public class LayerInterfaceFactoryImageItem : CustomImageItem {
        

    private val animationArray: Array<Animation?>

    private val layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface
public constructor        (label: String, img: Image, layout: Int, altText: String, basicColor: BasicColor, animationArray: Array<Animation?>, layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface)                        

                            : super(label, img, layout, altText, basicColor){

                    var label = label


                    var img = img


                    var layout = layout


                    var altText = altText


                    var basicColor = basicColor


                    var animationArray = animationArray


                    var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.animationArray= animationArray
this.layerInterfaceFactoryInterface= layerInterfaceFactoryInterface
}


open fun getLayerInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: LayerInterfaceFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerInterfaceFactoryInterface
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
super.paint(graphics, x, y)




                        for (index in this.animationArray!!.size  - 1  downTo 0)


        {this.animationArray[index]!!.paint(graphics, x, y)
}

}


}
                
            

