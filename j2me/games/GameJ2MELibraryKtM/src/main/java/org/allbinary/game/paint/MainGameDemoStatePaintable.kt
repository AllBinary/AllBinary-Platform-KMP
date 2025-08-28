
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.paint.Paintable

open public class MainGameDemoStatePaintable : Paintable {
        

    private val ownershipPaintableInterface: Paintable

    private val menuPaintableInterface: Paintable
public constructor        (ownershipPaintableInterface: Paintable, menuPaintableInterface: Paintable){
var ownershipPaintableInterface = ownershipPaintableInterface
var menuPaintableInterface = menuPaintableInterface
this.ownershipPaintableInterface= ownershipPaintableInterface
this.menuPaintableInterface= menuPaintableInterface
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.menuPaintableInterface!!.paint(graphics)
this.ownershipPaintableInterface!!.paint(graphics)
}


open fun getOwnershipPaintableInterface()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ownershipPaintableInterface
}


open fun getMenuPaintableInterface()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return menuPaintableInterface
}


}
                
            

