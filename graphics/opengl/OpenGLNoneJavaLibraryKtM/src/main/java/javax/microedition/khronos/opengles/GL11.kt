
        /* Generated Code Do Not Modify */
        package javax.microedition.khronos.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.Buffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
interface GL11 : GL10 {
        

        companion object {
            
    val GL_ACTIVE_TEXTURE: Int = 34016

    val GL_ADD_SIGNED: Int = 34164

    val GL_ALPHA_SCALE: Int = 3356

    val GL_ALPHA_TEST_FUNC: Int = 3009

    val GL_ALPHA_TEST_REF: Int = 3010

    val GL_ARRAY_BUFFER: Int = 34962

    val GL_ARRAY_BUFFER_BINDING: Int = 34964

    val GL_BLEND_DST: Int = 3040

    val GL_BLEND_SRC: Int = 3041

    val GL_BUFFER_ACCESS: Int = 35003

    val GL_BUFFER_SIZE: Int = 34660

    val GL_BUFFER_USAGE: Int = 34661

    val GL_CLIENT_ACTIVE_TEXTURE: Int = 34017

    val GL_CLIP_PLANE0: Int = 12288

    val GL_CLIP_PLANE1: Int = 12289

    val GL_CLIP_PLANE2: Int = 12290

    val GL_CLIP_PLANE3: Int = 12291

    val GL_CLIP_PLANE4: Int = 12292

    val GL_CLIP_PLANE5: Int = 12293

    val GL_COLOR_ARRAY_BUFFER_BINDING: Int = 34968

    val GL_COLOR_ARRAY_POINTER: Int = 32912

    val GL_COLOR_ARRAY_SIZE: Int = 32897

    val GL_COLOR_ARRAY_STRIDE: Int = 32899

    val GL_COLOR_ARRAY_TYPE: Int = 32898

    val GL_COLOR_CLEAR_VALUE: Int = 3106

    val GL_COLOR_WRITEMASK: Int = 3107

    val GL_COMBINE: Int = 34160

    val GL_COMBINE_ALPHA: Int = 34162

    val GL_COMBINE_RGB: Int = 34161

    val GL_CONSTANT: Int = 34166

    val GL_COORD_REPLACE_OES: Int = 34914

    val GL_CULL_FACE_MODE: Int = 2885

    val GL_CURRENT_COLOR: Int = 2816

    val GL_CURRENT_NORMAL: Int = 2818

    val GL_CURRENT_TEXTURE_COORDS: Int = 2819

    val GL_DEPTH_CLEAR_VALUE: Int = 2931

    val GL_DEPTH_FUNC: Int = 2932

    val GL_DEPTH_RANGE: Int = 2928

    val GL_DEPTH_WRITEMASK: Int = 2930

    val GL_DOT3_RGB: Int = 34478

    val GL_DOT3_RGBA: Int = 34479

    val GL_DYNAMIC_DRAW: Int = 35048

    val GL_ELEMENT_ARRAY_BUFFER: Int = 34963

    val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 34965

    val GL_FRONT_FACE: Int = 2886

    val GL_GENERATE_MIPMAP: Int = 33169

    val GL_GENERATE_MIPMAP_HINT: Int = 33170

    val GL_INTERPOLATE: Int = 34165

    val GL_LINE_WIDTH: Int = 2849

    val GL_LOGIC_OP_MODE: Int = 3056

    val GL_MATRIX_MODE: Int = 2976

    val GL_MAX_CLIP_PLANES: Int = 3378

    val GL_MODELVIEW_MATRIX: Int = 2982

    val GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES: Int = 35213

    val GL_MODELVIEW_STACK_DEPTH: Int = 2979

    val GL_NORMAL_ARRAY_BUFFER_BINDING: Int = 34967

    val GL_NORMAL_ARRAY_POINTER: Int = 32911

    val GL_NORMAL_ARRAY_STRIDE: Int = 32895

    val GL_NORMAL_ARRAY_TYPE: Int = 32894

    val GL_OPERAND0_ALPHA: Int = 34200

    val GL_OPERAND0_RGB: Int = 34192

    val GL_OPERAND1_ALPHA: Int = 34201

    val GL_OPERAND1_RGB: Int = 34193

    val GL_OPERAND2_ALPHA: Int = 34202

    val GL_OPERAND2_RGB: Int = 34194

    val GL_POINT_DISTANCE_ATTENUATION: Int = 33065

    val GL_POINT_FADE_THRESHOLD_SIZE: Int = 33064

    val GL_POINT_SIZE: Int = 2833

    val GL_POINT_SIZE_ARRAY_BUFFER_BINDING_OES: Int = 35743

    val GL_POINT_SIZE_ARRAY_OES: Int = 35740

    val GL_POINT_SIZE_ARRAY_POINTER_OES: Int = 35212

    val GL_POINT_SIZE_ARRAY_STRIDE_OES: Int = 35211

    val GL_POINT_SIZE_ARRAY_TYPE_OES: Int = 35210

    val GL_POINT_SIZE_MAX: Int = 33063

    val GL_POINT_SIZE_MIN: Int = 33062

    val GL_POINT_SPRITE_OES: Int = 34913

    val GL_POLYGON_OFFSET_FACTOR: Int = 32824

    val GL_POLYGON_OFFSET_UNITS: Int = 10752

    val GL_PREVIOUS: Int = 34168

    val GL_PRIMARY_COLOR: Int = 34167

    val GL_PROJECTION_MATRIX: Int = 2983

    val GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES: Int = 35214

    val GL_PROJECTION_STACK_DEPTH: Int = 2980

    val GL_RGB_SCALE: Int = 34163

    val GL_SAMPLE_BUFFERS: Int = 32936

    val GL_SAMPLE_COVERAGE_INVERT: Int = 32939

    val GL_SAMPLE_COVERAGE_VALUE: Int = 32938

    val GL_SAMPLES: Int = 32937

    val GL_SCISSOR_BOX: Int = 3088

    val GL_SHADE_MODEL: Int = 2900

    val GL_SRC0_ALPHA: Int = 34184

    val GL_SRC0_RGB: Int = 34176

    val GL_SRC1_ALPHA: Int = 34185

    val GL_SRC1_RGB: Int = 34177

    val GL_SRC2_ALPHA: Int = 34186

    val GL_SRC2_RGB: Int = 34178

    val GL_STATIC_DRAW: Int = 35044

    val GL_STENCIL_CLEAR_VALUE: Int = 2961

    val GL_STENCIL_FAIL: Int = 2964

    val GL_STENCIL_FUNC: Int = 2962

    val GL_STENCIL_PASS_DEPTH_FAIL: Int = 2965

    val GL_STENCIL_PASS_DEPTH_PASS: Int = 2966

    val GL_STENCIL_REF: Int = 2967

    val GL_STENCIL_VALUE_MASK: Int = 2963

    val GL_STENCIL_WRITEMASK: Int = 2968

    val GL_SUBTRACT: Int = 34023

    val GL_TEXTURE_BINDING_2D: Int = 32873

    val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING: Int = 34970

    val GL_TEXTURE_COORD_ARRAY_POINTER: Int = 32914

    val GL_TEXTURE_COORD_ARRAY_SIZE: Int = 32904

    val GL_TEXTURE_COORD_ARRAY_STRIDE: Int = 32906

    val GL_TEXTURE_COORD_ARRAY_TYPE: Int = 32905

    val GL_TEXTURE_MATRIX: Int = 2984

    val GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES: Int = 35215

    val GL_TEXTURE_STACK_DEPTH: Int = 2981

    val GL_VERTEX_ARRAY_BUFFER_BINDING: Int = 34966

    val GL_VERTEX_ARRAY_POINTER: Int = 32910

    val GL_VERTEX_ARRAY_SIZE: Int = 32890

    val GL_VERTEX_ARRAY_STRIDE: Int = 32892

    val GL_VERTEX_ARRAY_TYPE: Int = 32891

    val GL_VIEWPORT: Int = 2978

    val GL_WRITE_ONLY: Int = 35001

        }
            
open fun glBindBuffer(target: Int, buffer: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glBufferData(target: Int, size: Int, data: Buffer, usage: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glBufferSubData(target: Int, offset: Int, size: Int, data: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClipPlanef(plane: Int, equation: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClipPlanef(plane: Int, equation: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glColor4ub(red: Byte, green: Byte, blue: Byte, alpha: Byte)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glColorPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDeleteBuffers(n: Int, buffers: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDeleteBuffers(n: Int, buffers: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDrawElements(mode: Int, count: Int, type: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGenBuffers(n: Int, buffers: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGenBuffers(n: Int, buffers: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetBufferParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetBufferParameteriv(target: Int, pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetClipPlanef(pname: Int, eqn: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetClipPlanef(pname: Int, eqn: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetFloatv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetFloatv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetLightfv(light: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetLightfv(light: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetMaterialfv(face: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetMaterialfv(face: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexEnviv(env: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexEnviv(env: Int, pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexParameterfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexParameterfv(target: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetTexParameteriv(target: Int, pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glIsBuffer(buffer: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun glIsEnabled(cap: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun glIsTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun glNormalPointer(type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPointParameterf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPointParameterfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPointParameterfv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexCoordPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnvi(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnviv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnviv(target: Int, pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameterfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameterfv(target: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameteriv(target: Int, pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameteriv(target: Int, pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glVertexPointer(size: Int, type: Int, stride: Int, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

