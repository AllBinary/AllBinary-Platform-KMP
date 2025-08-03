
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
        package org.allbinary.logic.io.path



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AbFilePath : AbPath {
        
public constructor        (aPath: String)                        

                            : super(){

                    var aPath = aPath


                            //For kotlin this is before the body of the constructor.
                    

    var abPathUtil: PathUtil = PathUtil.getInstance()!!
            

this.schema= this.getSchema(aPath)
this.name= abPathUtil!!.getNameFromPath(aPath)
this.setPath(abPathUtil!!.adjust(this.getPath(abPathUtil!!.removeNameFromPath(aPath)!!.toString())))
}


}
                
            

