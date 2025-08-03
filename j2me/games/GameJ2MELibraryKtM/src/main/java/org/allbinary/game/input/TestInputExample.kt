
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
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics

open public class TestInputExample
            : Object
        
                , TestInputInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var testValue: Int= 0
override fun up()
        //nullable = true from not(false or (false and true)) = true
{}

override fun down()
        //nullable = true from not(false or (false and true)) = true
{}

override fun left()
        //nullable = true from not(false or (false and true)) = true
{this.testValue++
}

override fun right()
        //nullable = true from not(false or (false and true)) = true
{this.testValue--
}

override fun strafeLeft()
        //nullable = true from not(false or (false and true)) = true
{}

override fun strafeRight()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


}
                
            

