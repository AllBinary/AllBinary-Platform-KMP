
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
        package org.allbinary.logic.java.byteutil




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
        import kotlin.experimental.xor
        
        import kotlin.experimental.inv
        

open public class ByteUtil
            : Object
         {
        

        companion object {
            
    private val instance: ByteUtil = ByteUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ByteUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun xor(array: ByteArray, mask: Byte)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array


                    var mask = mask

    var bytes: ByteArray = ByteArray(array.size)


    var size: Int = array.size
                


    var index: Int = 0


    var currentByte: Byte


        while(index < size)
        {currentByte= array[index]!!
bytes[index]= (currentByte xor mask) as Byte
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bytes
}


open fun not(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array

    var bytes: ByteArray = ByteArray(array.size)


    var size: Int = array.size
                


    var index: Int = 0


        while(index < size)
        {bytes[index]= array[index].inv() as Byte
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bytes
}


open fun xorByte(array: ByteArray, index: Int)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array


                    var index = index

    var mask: Byte = 0


    
                        if(index == 0)
                        mask= 1

    
                        if(index == 1)
                        mask= 2

    
                        if(index == 2)
                        mask= 4

    
                        if(index == 3)
                        mask= 8

    
                        if(index == 4)
                        mask= 16

    
                        if(index == 5)
                        mask= 32

    
                        if(index == 6)
                        mask= 64

    
                        if(index == 7)
                        mask=  -127



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.xor(array, mask)
}


open fun compare(newByteArray: ByteArray, oldByteArray: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var newByteArray = newByteArray


                    var oldByteArray = oldByteArray

    
                        if(newByteArray!!.size != oldByteArray!!.size)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            
                        }
                            

    var size: Int = newByteArray!!.size
                





                        for (index in 0 until size)

        {
    
                        if(newByteArray[index] != oldByteArray[index])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun compare(newByteArray: ByteArray, newSize: Int, oldByteArray: ByteArray, stats: IntArray)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var newByteArray = newByteArray


                    var newSize = newSize


                    var oldByteArray = oldByteArray


                    var stats = stats

    
                        if(newSize != oldByteArray!!.size)
                        
                                    {
                                    stats[0]=  -1
stats[2]= newSize
stats[3]= oldByteArray!!.size



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            stats[0]= newSize

                        }
                            
stats[1]= 0

    var size: Int = newSize





                        for (index in 0 until size)

        {
    
                        if(newByteArray[index] != oldByteArray[index])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
stats[1]++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

