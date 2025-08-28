
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
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory

open public class ColorFillPaintableFactory
            : Object
         {
        

        companion object {
            
    private val instance: ColorFillPaintableFactory = ColorFillPaintableFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ColorFillPaintableFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getInstance(basicColor: BasicColor, forThreedCanvas: Boolean)
        //nullable =  from not(true or (false and false)) = 
: ColorFillBasePaintable{
    //var basicColor = basicColor
    //var forThreedCanvas = forThreedCanvas

    var operatingSystem: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystem!!.isOverScan())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OverScanColorFillPaintable(basicColor)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ColorFillPaintable(basicColor)

                        }
                            
}


}
                
            

