
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
        package org.allbinary.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.image.gui.ImageToolJFrame
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ImageTool
            : Object
         {
        

        companion object {


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args
java!!.awt!!.EventQueue.invokeLater(object: Runnable()
                                {
                                
open fun run()
        //nullable = true from not(false or (false and true)) = true
{
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.RUN)
ImageToolJFrame().
                            setVisible(true)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            )
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {}


}
                
            

