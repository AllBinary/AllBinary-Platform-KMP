
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.util.BasicArrayList

open public class OpenGLESImageExclusionUtil
            : Object
         {
        
companion object {
            
    private val instance: OpenGLESImageExclusionUtil = OpenGLESImageExclusionUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLESImageExclusionUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val EXCLUSION: String = "font"

    val list: BasicArrayList = BasicArrayList()
private constructor ()
            : super()
        {
}


    open fun isCustomScaling(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var image = image

    var imageName: String = image.getName()!!


    var isNormalScaling: Boolean = this.list.size() == 0 || imageName!!.startsWith(this.EXCLUSION)


    
                        if(isNormalScaling)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            
    var size: Int = this.list.size()!!


    var name: String





                        for (index in 0 until size)

        {
name= this.list.get(index) as String

    
                        if(imageName!!.startsWith(name))
                        
                                    {
                                    isNormalScaling= true

                                    }
                                
}


                        }
                            

    
                        if(isNormalScaling)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


}
                
            

