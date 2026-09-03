
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2026 AllBinary 
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TrackedStrings
            : Object
         {
        
companion object {
            
    private val instance: TrackedStrings = TrackedStrings()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrackedStrings{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val TARGET_PATH_WINDOWS: String = "\\target\\"

    val TARGET_PATH_UNIX: String = "/target/"

    val HTML_TEMP: String = "HTMLTemp"

    val APPLICATION: String = "Application"

    val APP: String = "\\app"

    val GIT_COMMAND: String = "git"

    val CHANGE_DIRECTORY_OPTION: String = "-C"

    val LIST_FILES_COMMAND: String = "ls-files"

    val ERROR_UNMATCH_OPTION: String = "--error-unmatch"

    val PATHSPEC_SEPARATOR: String = "--"

}
                
            

