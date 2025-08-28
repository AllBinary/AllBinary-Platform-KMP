
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
        package org.allbinary.media.image.filter




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import javax.swing.filechooser.FileFilter

open public class ImageFileFilter : FileFilter {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun accept(f: File)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var f = f

    
                        if(f.isDirectory())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    var s: String = f.getName()!!


    var i: Int = s.lastIndexOf('.')!!


    
                        if(i > 0 && i < s.length -1)
                        
                                    {
                                    
    var ext: String = s.substring(i +1)!!.lowercase()!!


    
                        if(ext.equals("jpg") || ext.equals("jpeg"))
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Accepts .jpg and .jpeg files"
}


}
                
            

