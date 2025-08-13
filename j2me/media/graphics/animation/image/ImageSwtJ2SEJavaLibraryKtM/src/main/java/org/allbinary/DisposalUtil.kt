
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
        package org.allbinary



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.string.CommonStrings
import org.eclipse.swt.graphics.Resource
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

open public class DisposalUtil
            : Object
         {
        

        companion object {
            
    private val instance: DisposalUtil = DisposalUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DisposalUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

open fun dispose(image: Image)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image

    
                        if(image == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(image.isMutable())
                        
                                    {
                                    
    var mutableImage: SwtMutableImage = image as SwtMutableImage

this.dispose(mutableImage!!.getImage() as Resource)

                                    }
                                
                        else {
                            
                        }
                            
}


open fun dispose(resource: Resource)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource

    
                        if(!resource.isDisposed())
                        
                                    {
                                    System.out.println(commonStrings!!.CLOSE)
resource.dispose()

                                    }
                                
}


}
                
            

