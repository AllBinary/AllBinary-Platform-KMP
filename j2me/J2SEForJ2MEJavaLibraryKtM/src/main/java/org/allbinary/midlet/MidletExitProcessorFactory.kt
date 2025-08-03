
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
        package org.allbinary.midlet



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.midlet.MIDlet
import org.allbinary.AppletUtil
import org.allbinary.J2MEUtil
import org.allbinary.canvas.Processor

open public class MidletExitProcessorFactory
            : Object
         {
        

        companion object {


    private val instance: MidletExitProcessorFactory = MidletExitProcessorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MidletExitProcessorFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getInstance(midlet: MIDlet)
        //nullable =  from not(true or (false and false)) = 
: Processor{

                    var midlet = midlet

    
                        if(AppletUtil.isAppletLoader(midlet) || J2MEUtil.isJ2ME())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Processor.getInstance()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MidletExitProcessor(midlet)

                        }
                            
}


}
                
            

