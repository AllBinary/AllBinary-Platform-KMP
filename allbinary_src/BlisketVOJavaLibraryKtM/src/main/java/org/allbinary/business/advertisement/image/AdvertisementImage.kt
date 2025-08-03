
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
        package org.allbinary.business.advertisement.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.control.contraints.size.TwoDimensionalConstraintInterface

open public class AdvertisementImage
            : Object
        
                , AdvertisementImageInterface {
        

    private var imageFileName: String

    private var imageUrl: String

    private var constraint: TwoDimensionalConstraintInterface
public constructor        ()
            : super()
        {}


open fun getFileName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.imageFileName
}


open fun getUrl()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.imageUrl
}


open fun getTwoDimensionalConstraint()
        //nullable = true from not(false or (false and true)) = true
: TwoDimensionalConstraintInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.constraint
}


}
                
            

