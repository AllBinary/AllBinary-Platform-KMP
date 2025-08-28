
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
        
import com.jogamp.opengl.glu.GLU

open public class JOGL10
            : Object
        
                , javax.microedition.khronos.opengles.GL10 {
        

    val RED: String = "red: "

    val GREEN: String = " green: "

    val BLUE: String = " blue: "

    val ALPHA: String = " alpha: "

    val PNAME: String = "pname: "

    val _PNAME: String = " pname: "

    val PARAM: String = " param: "

    val PARAMS: String = " params: "

    val LIGHT: String = "light: "

    val FACE: String = "face: "

    val TARGET: String = "target: "

    private val gl10: com.jogamp.opengl.GL2

    val glu: GLU

    val GL_LINE: Int

    val GL_QUAD_STRIP: Int
public constructor        (gl: com.jogamp.opengl.GL)
            : super()
        {
var gl = gl

    var gl2: com.jogamp.opengl.GL2 = gl as com.jogamp.opengl.GL2

this.gl10= gl2
this.glu= GLU.createGLU(this.gl10)
this.GL_LINE= this.gl10.GL_LINE
this.GL_QUAD_STRIP= this.gl10.GL_QUAD_STRIP
}


open fun getJOGLGL()
        //nullable = true from not(false or (false and true)) = true
: com.jogamp.opengl.GL2{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl10
}


open fun glActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true
{
var texture = texture
this.gl10.glActiveTexture(texture)
}


open fun glAlphaFunc(func: Int, ref: Float)
        //nullable = true from not(false or (false and false)) = true
{
var func = func
var ref = ref
this.gl10.glAlphaFunc(func, ref)
}


open fun glBindTexture(target: Int, texture: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var texture = texture
this.gl10.glBindTexture(target, texture)
}


open fun glBlendFunc(sfactor: Int, dfactor: Int)
        //nullable = true from not(false or (false and false)) = true
{
var sfactor = sfactor
var dfactor = dfactor
this.gl10.glBlendFunc(sfactor, dfactor)
}


open fun glClear(mask: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mask = mask
this.gl10.glClear(mask)
}


open fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{
var red = red
var green = green
var blue = blue
var alpha = alpha
this.gl10.glClearColor(red, green, blue, alpha)
}


open fun glClearDepthf(depth: Float)
        //nullable = true from not(false or (false and false)) = true
{
var depth = depth
this.gl10.glClearDepthf(depth)
}


open fun glClearStencil(s: Int)
        //nullable = true from not(false or (false and false)) = true
{
var s = s
this.gl10.glClearStencil(s)
}


open fun glClientActiveTexture(texture: Int)
        //nullable = true from not(false or (false and false)) = true
{
var texture = texture
this.gl10.glClientActiveTexture(texture)
}


open fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{
var red = red
var green = green
var blue = blue
var alpha = alpha
this.gl10.glColor4f(red, green, blue, alpha)
}


open fun glColorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var red = red
var green = green
var blue = blue
var alpha = alpha
this.gl10.glColorMask(red, green, blue, alpha)
}


open fun glColorPointer(size: Int, type: Int, stride: Int, pointer: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
var type = type
var stride = stride
var pointer = pointer
this.gl10.glColorPointer(size, type, stride, pointer)
}


open fun glCompressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var internalformat = internalformat
var width = width
var height = height
var border = border
var imageSize = imageSize
var data = data
this.gl10.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data)
}


open fun glCompressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var xoffset = xoffset
var yoffset = yoffset
var width = width
var height = height
var format = format
var imageSize = imageSize
var data = data
this.gl10.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data)
}


open fun glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var internalformat = internalformat
var x = x
var y = y
var width = width
var height = height
var border = border
this.gl10.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border)
}


open fun glCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var xoffset = xoffset
var yoffset = yoffset
var x = x
var y = y
var width = width
var height = height
this.gl10.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height)
}


open fun glCullFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
this.gl10.glCullFace(mode)
}


open fun glDeleteTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var n = n
var textures = textures
var offset = offset
this.gl10.glDeleteTextures(n, textures, offset)
}


open fun glDeleteTextures(n: Int, textures: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var n = n
var textures = textures
this.gl10.glDeleteTextures(n, textures)
}


open fun glDepthFunc(func: Int)
        //nullable = true from not(false or (false and false)) = true
{
var func = func
this.gl10.glDepthFunc(func)
}


open fun glDepthMask(flag: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var flag = flag
this.gl10.glDepthMask(flag)
}


open fun glDepthRangef(zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true
{
var zNear = zNear
var zFar = zFar
this.gl10.glDepthRangef(zNear, zFar)
}


open fun glDisable(cap: Int)
        //nullable = true from not(false or (false and false)) = true
{
var cap = cap
this.gl10.glDisable(cap)
}


open fun glDisableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true
{
var array = array
this.gl10.glDisableClientState(array)
}


open fun glDrawArrays(mode: Int, first: Int, count: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
var first = first
var count = count
this.gl10.glDrawArrays(mode, first, count)
}


open fun glDrawElements(mode: Int, count: Int, type: Int, indices: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
var count = count
var type = type
var indices = indices
this.gl10.glDrawElements(mode, count, type, indices)
}


open fun glEnable(cap: Int)
        //nullable = true from not(false or (false and false)) = true
{
var cap = cap
this.gl10.glEnable(cap)
}


open fun glEnableClientState(array: Int)
        //nullable = true from not(false or (false and false)) = true
{
var array = array
this.gl10.glEnableClientState(array)
}


open fun glFinish()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glFinish()
}


open fun glFlush()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glFlush()
}


open fun glFogf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var param = param
this.gl10.glFogf(pname, param)
}


open fun glFogfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
var offset = offset
this.gl10.glFogfv(pname, params, offset)
}


open fun glFogfv(pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
this.gl10.glFogfv(pname, params)
}


open fun glFrontFace(mode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
this.gl10.glFrontFace(mode)
}


open fun glFrustumf(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true
{
var left = left
var right = right
var bottom = bottom
var top = top
var zNear = zNear
var zFar = zFar
this.gl10.glFrustumf(left, right, bottom, top, zNear, zFar)
}


open fun glGenTextures(n: Int, textures: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var n = n
var textures = textures
var offset = offset
this.gl10.glGenTextures(n, textures, offset)
}


open fun glGenTextures(n: Int, textures: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var n = n
var textures = textures
this.gl10.glGenTextures(n, textures)
}


open fun glGetError()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl10.glGetError()
}


open fun glGetIntegerv(pname: Int, params: IntArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
var offset = offset
this.gl10.glGetIntegerv(pname, params, offset)
}


open fun glGetIntegerv(pname: Int, params: java.nio.IntBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
this.gl10.glGetIntegerv(pname, params)
}


open fun glGetString(name: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gl10.glGetString(name)
}


open fun glHint(target: Int, mode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var mode = mode
this.gl10.glHint(target, mode)
}


open fun glLightModelf(pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var param = param
this.gl10.glLightModelf(pname, param)
}


open fun glLightModelfv(pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
var offset = offset
this.gl10.glLightModelfv(pname, params, offset)
}


open fun glLightModelfv(pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var params = params
this.gl10.glLightModelfv(pname, params)
}


open fun glLightf(light: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var light = light
var pname = pname
var param = param
this.gl10.glLightf(light, pname, param)
}


open fun glLightfv(light: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var light = light
var pname = pname
var params = params
var offset = offset
this.gl10.glLightfv(light, pname, params, offset)
}


open fun glLightfv(light: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var light = light
var pname = pname
var params = params
this.gl10.glLightfv(light, pname, params)
}


open fun glLineWidth(width: Float)
        //nullable = true from not(false or (false and false)) = true
{
var width = width
this.gl10.glLineWidth(width)
}


open fun glLoadIdentity()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glLoadIdentity()
}


open fun glLoadMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var m = m
var offset = offset
this.gl10.glLoadMatrixf(m, offset)
}


open fun glLoadMatrixf(m: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var m = m
this.gl10.glLoadMatrixf(m)
}


open fun glLogicOp(opcode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var opcode = opcode
this.gl10.glLogicOp(opcode)
}


open fun glMaterialf(face: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var face = face
var pname = pname
var param = param
this.gl10.glMaterialf(face, pname, param)
}


open fun glMaterialfv(face: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var face = face
var pname = pname
var params = params
var offset = offset
this.gl10.glMaterialfv(face, pname, params, offset)
}


open fun glMaterialfv(face: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var face = face
var pname = pname
var params = params
this.gl10.glMaterialfv(face, pname, params)
}


open fun glMatrixMode(mode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
this.gl10.glMatrixMode(mode)
}


open fun glMultMatrixf(m: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var m = m
var offset = offset
this.gl10.glMultMatrixf(m, offset)
}


open fun glMultMatrixf(m: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var m = m
this.gl10.glMultMatrixf(m)
}


open fun glMultiTexCoord4f(target: Int, s: Float, t: Float, r: Float, q: Float)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var s = s
var t = t
var r = r
var q = q
this.gl10.glMultiTexCoord4f(target, s, t, r, q)
}


open fun glNormal3f(nx: Float, ny: Float, nz: Float)
        //nullable = true from not(false or (false and false)) = true
{
var nx = nx
var ny = ny
var nz = nz
this.gl10.glNormal3f(nx, ny, nz)
}


open fun glNormalPointer(type: Int, stride: Int, pointer: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var type = type
var stride = stride
var pointer = pointer
this.gl10.glNormalPointer(type, stride, pointer)
}


open fun glOrthof(left: Float, right: Float, bottom: Float, top: Float, zNear: Float, zFar: Float)
        //nullable = true from not(false or (false and false)) = true
{
var left = left
var right = right
var bottom = bottom
var top = top
var zNear = zNear
var zFar = zFar
this.gl10.glOrthof(left, right, bottom, top, zNear, zFar)
}


open fun glPixelStorei(pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true
{
var pname = pname
var param = param
this.gl10.glPixelStorei(pname, param)
}


open fun glPointSize(size: Float)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
this.gl10.glPointSize(size)
}


open fun glPolygonOffset(factor: Float, units: Float)
        //nullable = true from not(false or (false and false)) = true
{
var factor = factor
var units = units
this.gl10.glPolygonOffset(factor, units)
}


open fun glPopMatrix()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glPopMatrix()
}


open fun glPushMatrix()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glPushMatrix()
}


open fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var width = width
var height = height
var format = format
var type = type
var pixels = pixels
this.gl10.glReadPixels(x, y, width, height, format, type, pixels)
}


open fun glRotatef(angle: Float, x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
var x = x
var y = y
var z = z
this.gl10.glRotatef(angle, x, y, z)
}


open fun glRotatex(angle: Int, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
var x = x
var y = y
var z = z
this.gl10.glRotatef(angle, x, y, z)
}


open fun glSampleCoverage(value: Float, invert: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
var invert = invert
this.gl10.glSampleCoverage(value, invert)
}


open fun glScalef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var z = z
this.gl10.glScalef(x, y, z)
}


open fun glScalex(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var z = z
this.gl10.glScalef(x, y, z)
}


open fun glScissor(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var width = width
var height = height
this.gl10.glScissor(x, y, width, height)
}


open fun glShadeModel(mode: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mode = mode
this.gl10.glShadeModel(mode)
}


open fun glStencilFunc(func: Int, ref: Int, mask: Int)
        //nullable = true from not(false or (false and false)) = true
{
var func = func
var ref = ref
var mask = mask
this.gl10.glStencilFunc(func, ref, mask)
}


open fun glStencilMask(mask: Int)
        //nullable = true from not(false or (false and false)) = true
{
var mask = mask
this.gl10.glStencilMask(mask)
}


open fun glStencilOp(fail: Int, zfail: Int, zpass: Int)
        //nullable = true from not(false or (false and false)) = true
{
var fail = fail
var zfail = zfail
var zpass = zpass
this.gl10.glStencilOp(fail, zfail, zpass)
}


open fun glTexCoordPointer(size: Int, type: Int, stride: Int, pointer: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
var type = type
var stride = stride
var pointer = pointer
this.gl10.glTexCoordPointer(size, type, stride, pointer)
}


open fun glTexEnvf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var pname = pname
var param = param
this.gl10.glTexEnvf(target, pname, param)
}


open fun glTexEnvfv(target: Int, pname: Int, params: FloatArray, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var pname = pname
var params = params
var offset = offset
this.gl10.glTexEnvfv(target, pname, params, offset)
}


open fun glTexEnvfv(target: Int, pname: Int, params: java.nio.FloatBuffer)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var pname = pname
var params = params
this.gl10.glTexEnvfv(target, pname, params)
}


open fun glTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var internalformat = internalformat
var width = width
var height = height
var border = border
var format = format
var type = type
var pixels = pixels
this.gl10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels)
}


open fun glTexParameterf(target: Int, pname: Int, param: Float)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var pname = pname
var param = param
this.gl10.glTexParameterf(target, pname, param)
}


open fun glTexParameteri(target: Int, pname: Int, param: Int)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var pname = pname
var param = param
this.gl10.glTexParameteri(target, pname, param)
}


open fun glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var target = target
var level = level
var xoffset = xoffset
var yoffset = yoffset
var width = width
var height = height
var format = format
var type = type
var pixels = pixels
this.gl10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels)
}


open fun glTranslatef(x: Float, y: Float, z: Float)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var z = z
this.gl10.glTranslatef(x, y, z)
}


open fun glVertexPointer(size: Int, type: Int, stride: Int, pointer: java.nio.Buffer)
        //nullable = true from not(false or (false and false)) = true
{
var size = size
var type = type
var stride = stride
var pointer = pointer
this.gl10.glVertexPointer(size, type, stride, pointer)
}


open fun glViewport(x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var width = width
var height = height
this.gl10.glViewport(x, y, width, height)
}


open fun glBegin(i: Int)
        //nullable = true from not(false or (false and false)) = true
{
var i = i
this.gl10.glBegin(i)
}


open fun glEnd()
        //nullable = true from not(false or (false and true)) = true
{
this.gl10.glEnd()
}


open fun glVertex3f(f: Float, f2: Float, f3: Float)
        //nullable = true from not(false or (false and false)) = true
{
var f = f
var f2 = f2
var f3 = f3
this.gl10.glVertex3f(f, f2, f3)
}


open fun glPolygonMode(i: Int, i1: Int)
        //nullable = true from not(false or (false and false)) = true
{
var i = i
var i1 = i1
this.gl10.glPolygonMode(i, i1)
}


}
                
            

