
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
        package org.allbinary.util




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels

open public class CircularIndexUtil
            : Object
         {
        

        companion object {
            
    val NULL_CIRCULAR_INDEX_UTIL: CircularIndexUtil = CircularIndexUtil(0)

open fun getInstance(max: Int)
        //nullable =  from not(true or (false and false)) = 
: CircularIndexUtil{

                    var max = max



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CircularIndexUtil(max)
}


open fun getInstance(index: Int, max: Int)
        //nullable =  from not(true or (false and false)) = 
: CircularIndexUtil{

                    var index = index


                    var max = max



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CircularIndexUtil(index, max)
}


        }
            
    private var index: Int = 0

    private var lastIndex: Int = 0

    private var size: Int = 0
private constructor        (index: Int, size: Int)
            : super()
        {

                    var index = index


                    var size = size
this.setSize(size)
this.setIndex(index)
}

private constructor        (size: Int)
            : super()
        {

                    var size = size
this.setSize(size)
}


open fun next()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.index >= this.lastIndex)
                        
                                    {
                                    this.index= 0

                                    }
                                
                        else {
                            this.index++

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.index
}


open fun previous()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.index < 1)
                        
                                    {
                                    this.index= this.lastIndex

                                    }
                                
                        else {
                            this.index--

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.index
}


open fun setIndex(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index

    
                        if(index > this.lastIndex)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.index= index
}


open fun getIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.index
}


open fun setSize(size: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var size = size
this.size= size
this.lastIndex= size -1
this.index= 0
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return size
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(CommonLabels.getInstance()!!.INDEX_LABEL)!!.append(this.index)!!.append("lastIndex: ")!!.append(this.lastIndex)!!.append("size: ")!!.append(this.size)!!.toString()
}


}
                
            

