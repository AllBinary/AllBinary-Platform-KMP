
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
        package org.allbinary.graphics.opengles.renderer




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import org.allbinary.emulator.InitEmulatorFactory
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil

open public class EmulatorCustomRenderer
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val renderStrings: RendererStrings = RendererStrings.getInstance()!!
            

open fun onSurfaceCreated(gl: GL10, eglConfig: EGLConfig)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var eglConfig = eglConfig
logUtil!!.put(commonStrings!!.START, this, this.renderStrings!!.ON_SURFACE_CREATED)

    var initEmulatorFactory: InitEmulatorFactory = InitEmulatorFactory.getInstance()!!
            


    
                        if(!initEmulatorFactory!!.isInitEmulator())
                        
                                    {
                                    
        try {
            
    var WAIT_FOR_EMULATOR: String = "Waiting on Emulator Initialization"


        while(!initEmulatorFactory!!.isInitEmulator())
        {PreLogUtil.put(WAIT_FOR_EMULATOR, this, this.renderStrings!!.ON_SURFACE_CREATED)
Thread.sleep(180)
}

} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.renderStrings!!.ON_SURFACE_CREATED, e)
}


                                    }
                                
}


}
                
            

