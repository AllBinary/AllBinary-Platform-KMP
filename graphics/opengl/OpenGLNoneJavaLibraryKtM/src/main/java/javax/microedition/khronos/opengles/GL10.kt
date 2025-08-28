
        /* Generated Code Do Not Modify */
        package javax.microedition.khronos.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.Buffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
interface GL10 : GL {
        

        companion object {
            
    val GL_ADD: Int = 260

    val GL_ALIASED_LINE_WIDTH_RANGE: Int = 33902

    val GL_ALIASED_POINT_SIZE_RANGE: Int = 33901

    val GL_ALPHA: Int = 6406

    val GL_ALPHA_BITS: Int = 3413

    val GL_ALPHA_TEST: Int = 3008

    val GL_ALWAYS: Int = 519

    val GL_AMBIENT: Int = 4608

    val GL_AMBIENT_AND_DIFFUSE: Int = 5634

    val GL_AND: Int = 5377

    val GL_AND_INVERTED: Int = 5380

    val GL_AND_REVERSE: Int = 5378

    val GL_BACK: Int = 1029

    val GL_BLEND: Int = 3042

    val GL_BLUE_BITS: Int = 3412

    val GL_BYTE: Int = 5120

    val GL_CCW: Int = 2305

    val GL_CLAMP_TO_EDGE: Int = 33071

    val GL_CLEAR: Int = 5376

    val GL_COLOR_ARRAY: Int = 32886

    val GL_COLOR_BUFFER_BIT: Int = 16384

    val GL_COLOR_LOGIC_OP: Int = 3058

    val GL_COLOR_MATERIAL: Int = 2903

    val GL_COMPRESSED_TEXTURE_FORMATS: Int = 34467

    val GL_CONSTANT_ATTENUATION: Int = 4615

    val GL_COPY: Int = 5379

    val GL_COPY_INVERTED: Int = 5388

    val GL_CULL_FACE: Int = 2884

    val GL_CW: Int = 2304

    val GL_DECAL: Int = 8449

    val GL_DECR: Int = 7683

    val GL_DEPTH_BITS: Int = 3414

    val GL_DEPTH_BUFFER_BIT: Int = 256

    val GL_DEPTH_TEST: Int = 2929

    val GL_DIFFUSE: Int = 4609

    val GL_DITHER: Int = 3024

    val GL_DONT_CARE: Int = 4352

    val GL_DST_ALPHA: Int = 772

    val GL_DST_COLOR: Int = 774

    val GL_EMISSION: Int = 5632

    val GL_EQUAL: Int = 514

    val GL_EQUIV: Int = 5385

    val GL_EXP: Int = 2048

    val GL_EXP2: Int = 2049

    val GL_EXTENSIONS: Int = 7939

    val GL_FALSE: Int = 0

    val GL_FASTEST: Int = 4353

    val GL_FIXED: Int = 5132

    val GL_FLAT: Int = 7424

    val GL_FLOAT: Int = 5126

    val GL_FOG: Int = 2912

    val GL_FOG_COLOR: Int = 2918

    val GL_FOG_DENSITY: Int = 2914

    val GL_FOG_END: Int = 2916

    val GL_FOG_HINT: Int = 3156

    val GL_FOG_MODE: Int = 2917

    val GL_FOG_START: Int = 2915

    val GL_FRONT: Int = 1028

    val GL_FRONT_AND_BACK: Int = 1032

    val GL_GEQUAL: Int = 518

    val GL_GREATER: Int = 516

    val GL_GREEN_BITS: Int = 3411

    val GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES: Int = 35739

    val GL_IMPLEMENTATION_COLOR_READ_TYPE_OES: Int = 35738

    val GL_INCR: Int = 7682

    val GL_INVALID_ENUM: Int = 1280

    val GL_INVALID_OPERATION: Int = 1282

    val GL_INVALID_VALUE: Int = 1281

    val GL_INVERT: Int = 5386

    val GL_KEEP: Int = 7680

    val GL_LEQUAL: Int = 515

    val GL_LESS: Int = 513

    val GL_LIGHT_MODEL_AMBIENT: Int = 2899

    val GL_LIGHT_MODEL_TWO_SIDE: Int = 2898

    val GL_LIGHT0: Int = 16384

    val GL_LIGHT1: Int = 16385

    val GL_LIGHT2: Int = 16386

    val GL_LIGHT3: Int = 16387

    val GL_LIGHT4: Int = 16388

    val GL_LIGHT5: Int = 16389

    val GL_LIGHT6: Int = 16390

    val GL_LIGHT7: Int = 16391

    val GL_LIGHTING: Int = 2896

    val GL_LINE_LOOP: Int = 2

    val GL_LINE_SMOOTH: Int = 2848

    val GL_LINE_SMOOTH_HINT: Int = 3154

    val GL_LINE_STRIP: Int = 3

    val GL_LINEAR: Int = 9729

    val GL_LINEAR_ATTENUATION: Int = 4616

    val GL_LINEAR_MIPMAP_LINEAR: Int = 9987

    val GL_LINEAR_MIPMAP_NEAREST: Int = 9985

    val GL_LINES: Int = 1

    val GL_LUMINANCE: Int = 6409

    val GL_LUMINANCE_ALPHA: Int = 6410

    val GL_MAX_ELEMENTS_INDICES: Int = 33001

    val GL_MAX_ELEMENTS_VERTICES: Int = 33000

    val GL_MAX_LIGHTS: Int = 3377

    val GL_MAX_MODELVIEW_STACK_DEPTH: Int = 3382

    val GL_MAX_PROJECTION_STACK_DEPTH: Int = 3384

    val GL_MAX_TEXTURE_SIZE: Int = 3379

    val GL_MAX_TEXTURE_STACK_DEPTH: Int = 3385

    val GL_MAX_TEXTURE_UNITS: Int = 34018

    val GL_MAX_VIEWPORT_DIMS: Int = 3386

    val GL_MODELVIEW: Int = 5888

    val GL_MODULATE: Int = 8448

    val GL_MULTISAMPLE: Int = 32925

    val GL_NAND: Int = 5390

    val GL_NEAREST: Int = 9728

    val GL_NEAREST_MIPMAP_LINEAR: Int = 9986

    val GL_NEAREST_MIPMAP_NEAREST: Int = 9984

    val GL_NEVER: Int = 512

    val GL_NICEST: Int = 4354

    val GL_NO_ERROR: Int = 0

    val GL_NOOP: Int = 5381

    val GL_NOR: Int = 5384

    val GL_NORMAL_ARRAY: Int = 32885

    val GL_NORMALIZE: Int = 2977

    val GL_NOTEQUAL: Int = 517

    val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 34466

    val GL_ONE: Int = 1

    val GL_ONE_MINUS_DST_ALPHA: Int = 773

    val GL_ONE_MINUS_DST_COLOR: Int = 775

    val GL_ONE_MINUS_SRC_ALPHA: Int = 771

    val GL_ONE_MINUS_SRC_COLOR: Int = 769

    val GL_OR: Int = 5383

    val GL_OR_INVERTED: Int = 5389

    val GL_OR_REVERSE: Int = 5387

    val GL_OUT_OF_MEMORY: Int = 1285

    val GL_PACK_ALIGNMENT: Int = 3333

    val GL_PALETTE4_R5_G6_B5_OES: Int = 35730

    val GL_PALETTE4_RGB5_A1_OES: Int = 35732

    val GL_PALETTE4_RGB8_OES: Int = 35728

    val GL_PALETTE4_RGBA4_OES: Int = 35731

    val GL_PALETTE4_RGBA8_OES: Int = 35729

    val GL_PALETTE8_R5_G6_B5_OES: Int = 35735

    val GL_PALETTE8_RGB5_A1_OES: Int = 35737

    val GL_PALETTE8_RGB8_OES: Int = 35733

    val GL_PALETTE8_RGBA4_OES: Int = 35736

    val GL_PALETTE8_RGBA8_OES: Int = 35734

    val GL_PERSPECTIVE_CORRECTION_HINT: Int = 3152

    val GL_POINT_SMOOTH: Int = 2832

    val GL_POINT_SMOOTH_HINT: Int = 3153

    val GL_POINTS: Int = 0

    val GL_POINT_FADE_THRESHOLD_SIZE: Int = 33064

    val GL_POINT_SIZE: Int = 2833

    val GL_POLYGON_OFFSET_FILL: Int = 32823

    val GL_POLYGON_SMOOTH_HINT: Int = 3155

    val GL_POSITION: Int = 4611

    val GL_PROJECTION: Int = 5889

    val GL_QUADRATIC_ATTENUATION: Int = 4617

    val GL_RED_BITS: Int = 3410

    val GL_RENDERER: Int = 7937

    val GL_REPEAT: Int = 10497

    val GL_REPLACE: Int = 7681

    val GL_RESCALE_NORMAL: Int = 32826

    val GL_RGB: Int = 6407

    val GL_RGBA: Int = 6408

    val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 32926

    val GL_SAMPLE_ALPHA_TO_ONE: Int = 32927

    val GL_SAMPLE_COVERAGE: Int = 32928

    val GL_SCISSOR_TEST: Int = 3089

    val GL_SET: Int = 5391

    val GL_SHININESS: Int = 5633

    val GL_SHORT: Int = 5122

    val GL_SMOOTH: Int = 7425

    val GL_SMOOTH_LINE_WIDTH_RANGE: Int = 2850

    val GL_SMOOTH_POINT_SIZE_RANGE: Int = 2834

    val GL_SPECULAR: Int = 4610

    val GL_SPOT_CUTOFF: Int = 4614

    val GL_SPOT_DIRECTION: Int = 4612

    val GL_SPOT_EXPONENT: Int = 4613

    val GL_SRC_ALPHA: Int = 770

    val GL_SRC_ALPHA_SATURATE: Int = 776

    val GL_SRC_COLOR: Int = 768

    val GL_STACK_OVERFLOW: Int = 1283

    val GL_STACK_UNDERFLOW: Int = 1284

    val GL_STENCIL_BITS: Int = 3415

    val GL_STENCIL_BUFFER_BIT: Int = 1024

    val GL_STENCIL_TEST: Int = 2960

    val GL_SUBPIXEL_BITS: Int = 3408

    val GL_TEXTURE: Int = 5890

    val GL_TEXTURE_2D: Int = 3553

    val GL_TEXTURE_COORD_ARRAY: Int = 32888

    val GL_TEXTURE_ENV: Int = 8960

    val GL_TEXTURE_ENV_COLOR: Int = 8705

    val GL_TEXTURE_ENV_MODE: Int = 8704

    val GL_TEXTURE_MAG_FILTER: Int = 10240

    val GL_TEXTURE_MIN_FILTER: Int = 10241

    val GL_TEXTURE_WRAP_S: Int = 10242

    val GL_TEXTURE_WRAP_T: Int = 10243

    val GL_TEXTURE0: Int = 33984

    val GL_TEXTURE1: Int = 33985

    val GL_TEXTURE2: Int = 33986

    val GL_TEXTURE3: Int = 33987

    val GL_TEXTURE4: Int = 33988

    val GL_TEXTURE5: Int = 33989

    val GL_TEXTURE6: Int = 33990

    val GL_TEXTURE7: Int = 33991

    val GL_TEXTURE8: Int = 33992

    val GL_TEXTURE9: Int = 33993

    val GL_TEXTURE10: Int = 33994

    val GL_TEXTURE11: Int = 33995

    val GL_TEXTURE12: Int = 33996

    val GL_TEXTURE13: Int = 33997

    val GL_TEXTURE14: Int = 33998

    val GL_TEXTURE15: Int = 33999

    val GL_TEXTURE16: Int = 34000

    val GL_TEXTURE17: Int = 34001

    val GL_TEXTURE18: Int = 34002

    val GL_TEXTURE19: Int = 34003

    val GL_TEXTURE20: Int = 34004

    val GL_TEXTURE21: Int = 34005

    val GL_TEXTURE22: Int = 34006

    val GL_TEXTURE23: Int = 34007

    val GL_TEXTURE24: Int = 34008

    val GL_TEXTURE25: Int = 34009

    val GL_TEXTURE26: Int = 34010

    val GL_TEXTURE27: Int = 34011

    val GL_TEXTURE28: Int = 34012

    val GL_TEXTURE29: Int = 34013

    val GL_TEXTURE30: Int = 34014

    val GL_TEXTURE31: Int = 34015

    val GL_TRIANGLE_FAN: Int = 6

    val GL_TRIANGLE_STRIP: Int = 5

    val GL_TRIANGLES: Int = 4

    val GL_TRUE: Int = 1

    val GL_UNPACK_ALIGNMENT: Int = 3317

    val GL_UNSIGNED_BYTE: Int = 5121

    val GL_UNSIGNED_SHORT: Int = 5123

    val GL_UNSIGNED_SHORT_4_4_4_4: Int = 32819

    val GL_UNSIGNED_SHORT_5_5_5_1: Int = 32820

    val GL_UNSIGNED_SHORT_5_6_5: Int = 33635

    val GL_VENDOR: Int = 7936

    val GL_VERSION: Int = 7938

    val GL_VERTEX_ARRAY: Int = 32884

    val GL_XOR: Int = 5382

    val GL_ZERO: Int = 0

        }
            
open fun glActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glAlphaFunc(func: Int, ref: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glBindTexture(target: Int, texture: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glBlendFunc(sfactor: Int, dfactor: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClear(mask: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClearDepthf(depth: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClearStencil(s: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glClientActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glColorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glColorPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glCompressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glCompressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glCullFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDeleteTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDeleteTextures(n: Int, textures: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDepthFunc(func: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDepthMask(flag: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDepthRangef(zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDisable(cap: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDisableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDrawArrays(mode: Int, first: Int, count: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glDrawElements(mode: Int, count: Int, type: Int, indices: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glEnable(cap: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glEnableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glFinish()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glFlush()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glFogf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glFogfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glFogfv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glFrontFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glFrustumf(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGenTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGenTextures(n: Int, textures: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetError()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun glGetIntegerv(pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetIntegerv(pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glGetString(name: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        

open fun glHint(target: Int, mode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightModelf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightModelfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightModelfv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightf(light: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightfv(light: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLightfv(light: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLineWidth(width: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLoadIdentity()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glLoadMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLoadMatrixf(m: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glLogicOp(opcode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMaterialf(face: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMaterialfv(face: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMaterialfv(face: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMatrixMode(mode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMultMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMultMatrixf(m: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glMultiTexCoord4f(target: Int, s: Float, t: Float, r: Float, q: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glNormal3f(nx: Float, ny: Float, nz: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glNormalPointer(type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glOrthof(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPixelStorei(pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPointSize(size: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPolygonOffset(factor: Float, units: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPopMatrix()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glPushMatrix()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glRotatef(angle: Float, x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glRotatex(angle: Int, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glSampleCoverage(value: Float, invert: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glScalef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glScalex(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glScissor(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glShadeModel(mode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glStencilFunc(func: Int, ref: Int, mask: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glStencilMask(mask: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glStencilOp(fail: Int, zfail: Int, zpass: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexCoordPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnvf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnvfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexEnvfv(target: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameterf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexParameteri(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glTranslatef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glVertexPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glViewport(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glBegin(i: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glEnd()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun glVertex3f(f: Float, f2: Float, f3: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun glPolygonMode(i: Int, i1: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

