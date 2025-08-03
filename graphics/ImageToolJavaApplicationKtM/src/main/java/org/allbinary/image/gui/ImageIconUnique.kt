
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
        package org.allbinary.image.gui



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import javax.swing

open public class ImageIconUnique : ImageIcon {
        

    private var id: Int= 0
public constructor        (bufferedImage: BufferedImage, index: Int)                        

                            : super(bufferedImage){

                    var bufferedImage = bufferedImage


                    var index = index


                            //For kotlin this is before the body of the constructor.
                    
this.setId(index)
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


open fun setId(id: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id
this.id= id
}


}
                
            

