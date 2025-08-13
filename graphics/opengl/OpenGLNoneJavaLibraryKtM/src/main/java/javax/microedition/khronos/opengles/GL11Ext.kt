
        /* Generated Code Do Not Modify */
        package javax.microedition.khronos.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.Buffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.ShortBuffer
interface GL11Ext : GL {
        

        companion object {
            
    val GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES: Int = 35742

    val GL_MATRIX_INDEX_ARRAY_OES: Int = 34884

    val GL_MATRIX_INDEX_ARRAY_POINTER_OES: Int = 34889

    val GL_MATRIX_INDEX_ARRAY_SIZE_OES: Int = 34886

    val GL_MATRIX_INDEX_ARRAY_STRIDE_OES: Int = 34888

    val GL_MATRIX_INDEX_ARRAY_TYPE_OES: Int = 34887

    val GL_MATRIX_PALETTE_OES: Int = 34880

    val GL_MAX_PALETTE_MATRICES_OES: Int = 34882

    val GL_MAX_VERTEX_UNITS_OES: Int = 34468

    val GL_TEXTURE_CROP_RECT_OES: Int = 35741

    val GL_WEIGHT_ARRAY_BUFFER_BINDING_OES: Int = 34974

    val GL_WEIGHT_ARRAY_OES: Int = 34477

    val GL_WEIGHT_ARRAY_POINTER_OES: Int = 34476

    val GL_WEIGHT_ARRAY_SIZE_OES: Int = 34475

    val GL_WEIGHT_ARRAY_STRIDE_OES: Int = 34474

    val GL_WEIGHT_ARRAY_TYPE_OES: Int = 34473

        }
            
open fun glTexParameterfv(target: Int, pname: Int, param: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glCurrentPaletteMatrixOES(matrixpaletteindex: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexfOES(x: Float, y: Float, z: Float, width: Float, height: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexfvOES(coords: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexfvOES(coords: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexiOES(x: Int, y: Int, z: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexivOES(coords: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexivOES(coords: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexsOES(x: Short, y: Short, z: Short, width: Short, height: Short)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexsvOES(coords: ShortArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexsvOES(coords: ShortBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexxOES(x: Int, y: Int, z: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexxvOES(coords: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawTexxvOES(coords: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glEnable(cap: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glEnableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glLoadPaletteFromModelViewMatrixOES()
        //nullable = true from not(false or (false and true)) = true


open fun glMatrixIndexPointerOES(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glMatrixIndexPointerOES(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glWeightPointerOES(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glWeightPointerOES(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

