
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
        package org.allbinary.input.automation.module




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import javax.swing

open public class DefaultListModelHelper
            : Object
         {
        

    private var defaultListModel: DefaultListModel

    private var vector: Vector
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.vector= Vector()
this.defaultListModel= DefaultListModel()
}


open fun initDefaultModelList()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.defaultListModel= DefaultListModel()

    var size: Int = this.vector.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var moduleName: String = this.vector.get(index) as String

this.defaultListModel!!.addElement(moduleName)
}

}


open fun getListModel()
        //nullable = true from not(false or (false and true)) = true
: ListModel

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.defaultListModel as ListModel
}


open fun add(string: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var string = string
this.vector.add(string)
}


open fun remove(string: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var string = string
this.vector.remove(string)
}


}
                
            

