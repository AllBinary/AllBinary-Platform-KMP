
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.graphics.font




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics

open public class UpdateMyFontProcessor : MyFontProcessor {
        

    private val updateMeasurementProcessor: UpdateMyFontInterface
public constructor (keyValueDrawCharArray: UpdateMyFontInterface){
    //var keyValueDrawCharArray = keyValueDrawCharArray
this.updateMeasurementProcessor= keyValueDrawCharArray
}


    override fun process(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
this.updateMeasurementProcessor!!.updateMeasurement(graphics)
}


}
                
            

