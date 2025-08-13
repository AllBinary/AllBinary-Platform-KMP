
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2022 AllBinary
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
        package org.allbinary.graphics.displayable.screen



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.paint.AboutPaintable
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.string.StringUtil

open public class AboutPaintableFactory
            : Object
         {
        

        companion object {
            
    private val instance: AboutPaintableFactory = AboutPaintableFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AboutPaintableFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
    var INFO: Array<String?> = arrayOf("Built with the","AllBinary Platform",StringUtil.getInstance()!!.EMPTY_STRING,"Comments or Questions:","support@allbinary.com")


    var DEVELOPERS: Array<String?> = arrayOf("Developed By:","Travis Berthelot")

this.paintableArray= AboutPaintable.getInstance(INFO, DEVELOPERS)!!.getPaintableArrayInstance()
}


    var paintableArray: Array<Paintable?> = arrayOf(NullPaintable.getInstance())

}
                
            

