
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
        package org.allbinary.business.init



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath

open public class InitInfo2
            : Object
         {
        

        companion object {


    private val instance: InitInfo2 = InitInfo2()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InitInfo2{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val directory: Directory = Directory.getInstance()!!
            

open fun isTestHtmlPathValid(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.create(value)
}


open fun isMainPathValid(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory.create(value)
}


}
                
            

