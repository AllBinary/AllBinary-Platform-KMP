
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
        package org.allbinary.game.configuration



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Gauge

open public class GameConfigurationGauge : Gauge {
        
public constructor        (gameConfiguration: GameConfiguration)                        

                            : super(gameConfiguration!!.getName(), gameConfiguration!!.isModifiable()!!, gameConfiguration!!.getMaxValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt(), gameConfiguration!!.getValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt()){

                    var gameConfiguration = gameConfiguration


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

