
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
        package org.allbinary.graphics.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class FormTypeFactory
            : Object
         {
        

        companion object {


    private val instance: FormTypeFactory = FormTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FormTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val UNK: String = "Unknown FormType"

    val NULL_FORM_TYPE: FormType = FormType()

    val TEMP_HORIZONTAL_FORM: FormType = FormType()

    val HORIZONTAL_FORM: FormType = FormType()

    val VERTICAL_CENTER_FORM: FormType = FormType()

open fun getFormType()
        //nullable = true from not(false or (false and true)) = true
: FormType{
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var formType: FormType


    
                        if(displayInfo!!.isPortrait())
                        
                                    {
                                    formType= this.VERTICAL_CENTER_FORM

                                    }
                                
                        else {
                            formType= this.HORIZONTAL_FORM

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return formType
}


}
                
            

