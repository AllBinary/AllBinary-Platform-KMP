
        /* Generated Code Do Not Modify */
        package org.platform.opengl




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10

open public class OpenGLGLU
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLGLU = OpenGLGLU()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLGLU

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun gluLookAt(gl: GL10, eyeX: Float, eyeY: Float, eyeZ: Float, centerX: Float, centerY: Float, centerZ: Float, upX: Float, upY: Float, upZ: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
    //var eyeX = eyeX
    //var eyeY = eyeY
    //var eyeZ = eyeZ
    //var centerX = centerX
    //var centerY = centerY
    //var centerZ = centerZ
    //var upX = upX
    //var upY = upY
    //var upZ = upZ



                            throw RuntimeException()
}


open fun gluProject(gl: GL10, objX: Float, objY: Float, objZ: Float, model: FloatArray, modelOffset: Int, project: FloatArray, projectOffset: Int, view: IntArray, viewOffset: Int, win: FloatArray, winOffset: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var gl = gl
var objX = objX
var objY = objY
var objZ = objZ
var model = model
var modelOffset = modelOffset
var project = project
var projectOffset = projectOffset
var view = view
var viewOffset = viewOffset
var win = win
var winOffset = winOffset



                            throw RuntimeException()
}


open fun gluUnProject(gl: GL10, winX: Float, winY: Float, winZ: Float, model: FloatArray, modelOffset: Int, project: FloatArray, projectOffset: Int, view: IntArray, viewOffset: Int, obj: FloatArray, objOffset: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var gl = gl
    //var winX = winX
    //var winY = winY
    //var winZ = winZ
    //var model = model
    //var modelOffset = modelOffset
    //var project = project
    //var projectOffset = projectOffset
    //var view = view
    //var viewOffset = viewOffset
var obj = obj
    //var objOffset = objOffset



                            throw RuntimeException()
}


}
                
            

