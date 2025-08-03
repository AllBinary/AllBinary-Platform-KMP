
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
        package org.allbinary.graphics.j2me.workarea.tools



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class Points
            : Object
        
                , PointsInterface {
        

    private val pointVector: BasicArrayList
public constructor        ()
            : super()
        {this.pointVector= BasicArrayList()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.pointVector!!.clear()
}


open fun getPoints()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pointVector
}


open fun addPoints(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var vector = vector
this.pointVector!!.addAll2(vector)
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.pointVector!!.size() > 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pointVector!!.size()
}


}
                
            

