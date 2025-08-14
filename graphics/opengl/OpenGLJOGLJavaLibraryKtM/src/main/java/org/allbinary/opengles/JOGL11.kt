
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import com.jogamp.opengl.GL2
import com.jogamp.opengl.GL

open public class JOGL11 : JOGL10
                , javax.microedition.khronos.opengles.GL11 {
        

    private val gl11: GL2
public constructor        (gl: GL)                        

                            : super(gl){

                    var gl = gl


                            //For kotlin this is before the body of the constructor.
                    
this.gl11= getJOGLGL()
}


open fun glBindBuffer(target: Int, buffer: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var buffer = buffer
this.gl11.glBindBuffer(target, buffer)
}


open fun glBufferData(target: Int, size: Int, data: java.nio.Buffer, usage: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var size = size


                    var data = data


                    var usage = usage
this.gl11.glBufferData(target, size, data, usage)
}


open fun glBufferSubData(target: Int, offset: Int, size: Int, data: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var offset = offset


                    var size = size


                    var data = data
this.gl11.glBufferSubData(target, offset, size, data)
}


open fun glClipPlanef(plane: Int, equation: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var plane = plane


                    var equation = equation


                    var offset = offset
this.gl11.glClipPlanef(plane, equation, offset)
}


open fun glClipPlanef(plane: Int, equation: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var plane = plane


                    var equation = equation
this.gl11.glClipPlanef(plane, equation)
}


open fun glColor4ub(red: Byte, green: Byte, blue: Byte, alpha: Byte)
        //nullable = true from not(false or (false and false)) = true
{

                    var red = red


                    var green = green


                    var blue = blue


                    var alpha = alpha
this.gl11.glColor4ub(red, green, blue, alpha)
}


open fun glColorPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var size = size


                    var type = type


                    var stride = stride


                    var offset = offset
this.gl11.glColorPointer(size, type, stride, offset)
}


open fun glDeleteBuffers(n: Int, buffers: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var n = n


                    var buffers = buffers


                    var offset = offset
this.gl11.glDeleteBuffers(n, buffers, offset)
}


open fun glDeleteBuffers(n: Int, buffers: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var n = n


                    var buffers = buffers
this.gl11.glDeleteBuffers(n, buffers)
}


open fun glDrawElements(mode: Int, count: Int, type: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mode = mode


                    var count = count


                    var type = type


                    var offset = offset
this.gl11.glDrawElements(mode, count, type, offset)
}


open fun glGenBuffers(n: Int, buffers: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var n = n


                    var buffers = buffers


                    var offset = offset
this.gl11.glGenBuffers(n, buffers, offset)
}


open fun glGenBuffers(n: Int, buffers: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var n = n


                    var buffers = buffers
this.gl11.glGenBuffers(n, buffers)
}


open fun glGetBufferParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetBufferParameteriv(target, pname, params, offset)
}


open fun glGetBufferParameteriv(target: Int, pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glGetBufferParameteriv(target, pname, params)
}


open fun glGetClipPlanef(pname: Int, eqn: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var eqn = eqn


                    var offset = offset
this.gl11.glGetClipPlanef(pname, eqn, offset)
}


open fun glGetClipPlanef(pname: Int, eqn: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var eqn = eqn
this.gl11.glGetClipPlanef(pname, eqn)
}


open fun glGetFloatv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetFloatv(pname, params, offset)
}


open fun glGetFloatv(pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var params = params
this.gl11.glGetFloatv(pname, params)
}


open fun glGetLightfv(light: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var light = light


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetLightfv(light, pname, params, offset)
}


open fun glGetLightfv(light: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var light = light


                    var pname = pname


                    var params = params
this.gl11.glGetLightfv(light, pname, params)
}


open fun glGetMaterialfv(face: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var face = face


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetMaterialfv(face, pname, params, offset)
}


open fun glGetMaterialfv(face: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var face = face


                    var pname = pname


                    var params = params
this.gl11.glGetMaterialfv(face, pname, params)
}


open fun glGetTexEnviv(env: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var env = env


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetTexEnviv(env, pname, params, offset)
}


open fun glGetTexEnviv(env: Int, pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var env = env


                    var pname = pname


                    var params = params
this.gl11.glGetTexEnviv(env, pname, params)
}


open fun glGetTexParameterfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetTexParameterfv(target, pname, params, offset)
}


open fun glGetTexParameterfv(target: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glGetTexParameterfv(target, pname, params)
}


open fun glGetTexParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glGetTexParameteriv(target, pname, params, offset)
}


open fun glGetTexParameteriv(target: Int, pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glGetTexParameteriv(target, pname, params)
}


open fun glIsBuffer(buffer: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var buffer = buffer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl11.glIsBuffer(buffer)
}


open fun glIsEnabled(cap: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var cap = cap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl11.glIsEnabled(cap)
}


open fun glIsTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var texture = texture



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl11.glIsTexture(texture)
}


open fun glNormalPointer(type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var type = type


                    var stride = stride


                    var offset = offset
this.gl11.glNormalPointer(type, stride, offset)
}


open fun glPointParameterf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var param = param
this.gl11.glPointParameterf(pname, param)
}


open fun glPointParameterfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glPointParameterfv(pname, params, offset)
}


open fun glPointParameterfv(pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var pname = pname


                    var params = params
this.gl11.glPointParameterfv(pname, params)
}


open fun glTexCoordPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var size = size


                    var type = type


                    var stride = stride


                    var offset = offset
this.gl11.glTexCoordPointer(size, type, stride, offset)
}


open fun glTexEnvi(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var param = param
this.gl11.glTexEnvi(target, pname, param)
}


open fun glTexEnviv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glTexEnviv(target, pname, params, offset)
}


open fun glTexEnviv(target: Int, pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glTexEnviv(target, pname, params)
}


open fun glTexParameterfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glTexParameterfv(target, pname, params, offset)
}


open fun glTexParameterfv(target: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glTexParameterfv(target, pname, params)
}


open fun glTexParameteri(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var param = param
this.gl11.glTexParameteri(target, pname, param)
}


open fun glTexParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glTexParameteriv(target, pname, params, offset)
}


open fun glTexParameteriv(target: Int, pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params
this.gl11.glTexParameteriv(target, pname, params)
}


open fun glTexParameterxv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var target = target


                    var pname = pname


                    var params = params


                    var offset = offset
this.gl11.glTexParameteriv(target, pname, params, offset)
}


open fun glVertexPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var size = size


                    var type = type


                    var stride = stride


                    var offset = offset
this.gl11.glVertexPointer(size, type, stride, offset)
}


}
                
            

