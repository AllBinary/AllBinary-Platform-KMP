
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
        package org.allbinary.opengles




        import java.lang.Object        
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import org.allbinary.graphics.opengles.OpenGLCapabilities

open public class GLUtil
            : Object
         {
        

        companion object {
            
    private val instance: GLUtil = GLUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GLUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val BYTES_PER_FLOAT: Int = 4

open fun makeFloatBuffer3(p_a: Float, p_b: Float, p_c: Float)
        //nullable = true from not(false or (false and false)) = true
: FloatBuffer{

                    var p_a = p_a


                    var p_b = p_b


                    var p_c = p_c

    var b: ByteBuffer = ByteBuffer.allocateDirect(3 *BYTES_PER_FLOAT)!!

b.order(ByteOrder.nativeOrder())

    var buffer: FloatBuffer = b.asFloatBuffer()!!

buffer.put(p_a)
buffer.put(p_b)
buffer.put(p_c)
this.position(buffer, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buffer
}


open fun makeFloatBuffer4(p_a: Float, p_b: Float, p_c: Float, p_d: Float)
        //nullable = true from not(false or (false and false)) = true
: FloatBuffer{

                    var p_a = p_a


                    var p_b = p_b


                    var p_c = p_c


                    var p_d = p_d

    var b: ByteBuffer = ByteBuffer.allocateDirect(4 *BYTES_PER_FLOAT)!!

b.order(ByteOrder.nativeOrder())

    var buffer: FloatBuffer = b.asFloatBuffer()!!

buffer.put(p_a)
buffer.put(p_b)
buffer.put(p_c)
buffer.put(p_d)
this.position(buffer, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buffer
}


open fun makeFloatBuffer(byteBuffer: ByteBuffer)
        //nullable = true from not(false or (false and false)) = true
: FloatBuffer{

                    var byteBuffer = byteBuffer

    var b: ByteBuffer = ByteBuffer.allocateDirect(byteBuffer!!.limit() *BYTES_PER_FLOAT)!!

b.order(ByteOrder.nativeOrder())

    var buffer: FloatBuffer = b.asFloatBuffer()!!


    var unsigned: Int= 0


    var v: Float= 0.0f


        while(byteBuffer!!.hasRemaining())
        {unsigned= byteBuffer!!.get() and 0xFF
v= (unsigned.toFloat()) /255f
buffer.put(v)
}

this.position(buffer, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buffer
}


open fun position(buffer: Buffer, newPosition: Int)
        //nullable = true from not(false or (false and false)) = true
: Buffer{

                    var buffer = buffer


                    var newPosition = newPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buffer.position(newPosition)
}


open fun rotateUVs(uvs: FloatArray, angleDegrees: Float, pivotU: Float, pivotV: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var uvs = uvs


                    var angleDegrees = angleDegrees


                    var pivotU = pivotU


                    var pivotV = pivotV

    var angleRad: Double = Math.toRadians(angleDegrees)!!


    var cosA: Double = Math.cos(angleRad)!!


    var sinA: Double = Math.sin(angleRad)!!





                        for (i in 0 until uvs.size)

        {
    var u: Float = uvs[i]!!


    var v: Float = uvs[i +1]!!


    var du: Float = u -pivotU


    var dv: Float = v -pivotV


    var ru: Float = (du *cosA -dv *sinA).toFloat() +pivotU


    var rv: Float = (du *sinA +dv *cosA).toFloat() +pivotV

uvs[i]= ru
uvs[i +1]= rv
}

}


}
                
            

