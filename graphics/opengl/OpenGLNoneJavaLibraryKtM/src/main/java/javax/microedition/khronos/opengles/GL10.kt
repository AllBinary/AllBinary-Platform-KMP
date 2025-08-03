
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
interface GL10 : GL {
        

open fun glActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glAlphaFunc(func: Int, ref: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glBindTexture(target: Int, texture: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glBlendFunc(sfactor: Int, dfactor: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glClear(mask: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glClearDepthf(depth: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glClearStencil(s: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glClientActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glColorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun glColorPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glCompressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glCompressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glCullFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDeleteTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDeleteTextures(n: Int, textures: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glDepthFunc(func: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDepthMask(flag: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun glDepthRangef(zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glDisable(cap: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDisableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawArrays(mode: Int, first: Int, count: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glDrawElements(mode: Int, count: Int, type: Int, indices: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glEnable(cap: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glEnableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glFinish()
        //nullable = true from not(false or (false and true)) = true


open fun glFlush()
        //nullable = true from not(false or (false and true)) = true


open fun glFogf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glFogfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glFogfv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glFrontFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glFrustumf(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glGenTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glGenTextures(n: Int, textures: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glGetError()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun glGetIntegerv(pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glGetIntegerv(pname: Int, params: IntBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glGetString(name: Int)
        //nullable = true from not(false or (false and false)) = true
: String

open fun glHint(target: Int, mode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glLightModelf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glLightModelfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glLightModelfv(pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glLightf(light: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glLightfv(light: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glLightfv(light: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glLineWidth(width: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glLoadIdentity()
        //nullable = true from not(false or (false and true)) = true


open fun glLoadMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glLoadMatrixf(m: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glLogicOp(opcode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glMaterialf(face: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glMaterialfv(face: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glMaterialfv(face: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glMatrixMode(mode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glMultMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glMultMatrixf(m: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glMultiTexCoord4f(target: Int, s: Float, t: Float, r: Float, q: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glNormal3f(nx: Float, ny: Float, nz: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glNormalPointer(type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glOrthof(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glPixelStorei(pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glPointSize(size: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glPolygonOffset(factor: Float, units: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glPopMatrix()
        //nullable = true from not(false or (false and true)) = true


open fun glPushMatrix()
        //nullable = true from not(false or (false and true)) = true


open fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glRotatef(angle: Float, x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glRotatex(angle: Int, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glSampleCoverage(value: Float, invert: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun glScalef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glScalex(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glScissor(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glShadeModel(mode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glStencilFunc(func: Int, ref: Int, mask: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glStencilMask(mask: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glStencilOp(fail: Int, zfail: Int, zpass: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glTexCoordPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glTexEnvf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glTexEnvfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glTexEnvfv(target: Int, pname: Int, params: FloatBuffer)
        //nullable = true from not(false or (false and false)) = true


open fun glTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glTexParameterf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glTexParameteri(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glTranslatef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glVertexPointer(size: Int, type: Int, stride: Int, pointer: Buffer)
        //nullable = true from not(false or (false and false)) = true


open fun glViewport(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glBegin(i: Int)
        //nullable = true from not(false or (false and false)) = true


open fun glEnd()
        //nullable = true from not(false or (false and true)) = true


open fun glVertex3f(f: Float, f2: Float, f3: Float)
        //nullable = true from not(false or (false and false)) = true


open fun glPolygonMode(i: Int, i1: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

