
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
        package org.allbinary.game.layer.pickup.health



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.health.HealthInterface
import org.allbinary.game.health.HealthVisitorInterface
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.view.ViewPosition

open public class HealLayer : AllBinaryLayer
                , HealthVisitorInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()                        

                            : super(Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), ViewPosition()){

                            //For kotlin this is before the body of the constructor.
                    
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun visit(healthInterface: HealthInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var healthInterface = healthInterface

    
                        if(healthInterface!!.isAlive())
                        
                                    {
                                    healthInterface!!.heal()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Heal attempt on dead: Does not currently occur", this, 
                            "visit")

                        }
                            
}


}
                
            

