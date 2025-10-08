
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
        package org.allbinary.input.automation.module.game




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class MagicGameObject : MeteredGameObject
                , MagicGameObjectInterface {
        

    private val MP_LABEL: String = "MP:"
public constructor (bufferedImage: Array<BufferedImage?>, minX: Object, maxX: Object, y: Object)                        

                            : super(bufferedImage, minX, maxX, y){
var bufferedImage = bufferedImage
var minX = minX
var maxX = maxX
var y = y


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
stringBuffer!!.append(MP_LABEL)
stringBuffer!!.append(super.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

