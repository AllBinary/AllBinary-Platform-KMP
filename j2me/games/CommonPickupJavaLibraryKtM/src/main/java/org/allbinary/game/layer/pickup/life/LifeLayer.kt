
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
        package org.allbinary.game.layer.pickup.life




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.life.Life
import org.allbinary.game.life.LifeVisitorInterface
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.view.ViewPosition

open public class LifeLayer : AllBinaryLayer
                , LifeVisitorInterface {
        
public constructor        ()                        

                            : super(Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), ViewPosition()){


                            //For kotlin this is before the body of the constructor.
                    
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}

override fun visit(lifeInterface: Life)
        //nullable = true from not(false or (false and false)) = true
{
var lifeInterface = lifeInterface
lifeInterface!!.add(1.toShort())
}


}
                
            

