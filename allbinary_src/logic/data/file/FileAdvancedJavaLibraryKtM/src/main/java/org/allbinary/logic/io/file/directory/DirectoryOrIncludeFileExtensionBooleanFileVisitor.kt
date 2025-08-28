
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.visitor.IncludeFileExtensionsBooleanFileVisitor
import org.allbinary.util.BasicArrayList

open public class DirectoryOrIncludeFileExtensionBooleanFileVisitor : IncludeFileExtensionsBooleanFileVisitor {
        

    private val includesString: String
public constructor        (filterStringBasicArrayList: BasicArrayList)                        

                            : super(filterStringBasicArrayList){
    //var filterStringBasicArrayList = filterStringBasicArrayList


                            //For kotlin this is before the body of the constructor.
                    
this.includesString= 
                                        null
                                    
}

public constructor        (filterStringBasicArrayList: BasicArrayList, includesString: String)                        

                            : super(filterStringBasicArrayList){
    //var filterStringBasicArrayList = filterStringBasicArrayList
    //var includesString = includesString


                            //For kotlin this is before the body of the constructor.
                    
this.includesString= includesString
}


open fun visit(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var file = file

    
                        if(file.isDirectory())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

    
                        if(this.includesString == 
                                    null
                                 || file.getAbsolutePath()!!.indexOf(this.includesString) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.visit(file)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
}


}
                
            

