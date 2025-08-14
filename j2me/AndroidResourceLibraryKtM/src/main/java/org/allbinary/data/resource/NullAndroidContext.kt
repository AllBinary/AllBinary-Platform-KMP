
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.data.resource




        import java.lang.Object        
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.content.pm.PackageManager.NameNotFoundException
import android.content.res.AssetManager
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

open public class NullAndroidContext : Context {
        

        companion object {
            
    val NULL_ANDROID_CONTEXT: NullAndroidContext = NullAndroidContext()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun getAssets()
        //nullable = true from not(false or (false and true)) = true
: AssetManager{


                            throw RuntimeException()
}

override fun getResources()
        //nullable = true from not(false or (false and true)) = true
: Resources{


                            throw RuntimeException()
}

override fun getPackageManager()
        //nullable = true from not(false or (false and true)) = true
: PackageManager{


                            throw RuntimeException()
}

override fun getContentResolver()
        //nullable = true from not(false or (false and true)) = true
: ContentResolver{


                            throw RuntimeException()
}

override fun getMainLooper()
        //nullable = true from not(false or (false and true)) = true
: Looper{


                            throw RuntimeException()
}

override fun getApplicationContext()
        //nullable = true from not(false or (false and true)) = true
: Context{


                            throw RuntimeException()
}

override fun setTheme(resid: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var resid = resid



                            throw RuntimeException()
}

override fun getTheme()
        //nullable = true from not(false or (false and true)) = true
: Theme{


                            throw RuntimeException()
}

override fun getClassLoader()
        //nullable = true from not(false or (false and true)) = true
: ClassLoader{


                            throw RuntimeException()
}

override fun getPackageName()
        //nullable = true from not(false or (false and true)) = true
: String{


                            throw RuntimeException()
}

override fun getSharedPreferences(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: SharedPreferences{

                    var name = name


                    var mode = mode



                            throw RuntimeException()
}


                @Throws(FileNotFoundException::class)
            override fun openFileInput(name: String)
        //nullable = true from not(false or (false and false)) = true
: FileInputStream{

                    var name = name



                            throw RuntimeException()
}


                @Throws(FileNotFoundException::class)
            override fun openFileOutput(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: FileOutputStream{

                    var name = name


                    var mode = mode



                            throw RuntimeException()
}

override fun deleteFile(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name



                            throw RuntimeException()
}

override fun getFileStreamPath(name: String)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name



                            throw RuntimeException()
}

override fun getFilesDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                            throw RuntimeException()
}

override fun getCacheDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                            throw RuntimeException()
}

override fun fileList()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                            throw RuntimeException()
}

override fun getDir(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name


                    var mode = mode



                            throw RuntimeException()
}

override fun openOrCreateDatabase(name: String, mode: Int, factory: CursorFactory)
        //nullable = true from not(false or (false and false)) = true
: SQLiteDatabase{

                    var name = name


                    var mode = mode


                    var factory = factory



                            throw RuntimeException()
}

override fun deleteDatabase(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name



                            throw RuntimeException()
}

override fun getDatabasePath(name: String)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name



                            throw RuntimeException()
}

override fun databaseList()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                            throw RuntimeException()
}

override fun getWallpaper()
        //nullable = true from not(false or (false and true)) = true
: Drawable{


                            throw RuntimeException()
}

override fun peekWallpaper()
        //nullable = true from not(false or (false and true)) = true
: Drawable{


                            throw RuntimeException()
}

override fun getWallpaperDesiredMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw RuntimeException()
}

override fun getWallpaperDesiredMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw RuntimeException()
}


                @Throws(IOException::class)
            override fun setWallpaper(bitmap: Bitmap)
        //nullable = true from not(false or (false and false)) = true
{

                    var bitmap = bitmap



                            throw RuntimeException()
}


                @Throws(IOException::class)
            override fun setWallpaper(data: InputStream)
        //nullable = true from not(false or (false and false)) = true
{

                    var data = data



                            throw RuntimeException()
}


                @Throws(IOException::class)
            override fun clearWallpaper()
        //nullable = true from not(false or (false and true)) = true
{


                            throw RuntimeException()
}

override fun startActivity(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent



                            throw RuntimeException()
}


open fun startActivities(intents: Array<Intent?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var intents = intents



                            throw RuntimeException()
}

override fun sendBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent



                            throw RuntimeException()
}

override fun sendBroadcast(intent: Intent, receiverPermission: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var receiverPermission = receiverPermission



                            throw RuntimeException()
}

override fun sendOrderedBroadcast(intent: Intent, receiverPermission: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var receiverPermission = receiverPermission



                            throw RuntimeException()
}

override fun sendOrderedBroadcast(intent: Intent, receiverPermission: String, resultReceiver: BroadcastReceiver, scheduler: Handler, initialCode: Int, initialData: String, initialExtras: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var receiverPermission = receiverPermission


                    var resultReceiver = resultReceiver


                    var scheduler = scheduler


                    var initialCode = initialCode


                    var initialData = initialData


                    var initialExtras = initialExtras



                            throw RuntimeException()
}

override fun sendStickyBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent



                            throw RuntimeException()
}

override fun removeStickyBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent



                            throw RuntimeException()
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter



                            throw RuntimeException()
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter, broadcastPermission: String, scheduler: Handler)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter


                    var broadcastPermission = broadcastPermission


                    var scheduler = scheduler



                            throw RuntimeException()
}

override fun unregisterReceiver(receiver: BroadcastReceiver)
        //nullable = true from not(false or (false and false)) = true
{

                    var receiver = receiver



                            throw RuntimeException()
}

override fun startService(service: Intent)
        //nullable = true from not(false or (false and false)) = true
: ComponentName{

                    var service = service



                            throw RuntimeException()
}

override fun stopService(service: Intent)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var service = service



                            throw RuntimeException()
}

override fun bindService(service: Intent, conn: ServiceConnection, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var service = service


                    var conn = conn


                    var flags = flags



                            throw RuntimeException()
}

override fun unbindService(conn: ServiceConnection)
        //nullable = true from not(false or (false and false)) = true
{

                    var conn = conn



                            throw RuntimeException()
}

override fun startInstrumentation(className: ComponentName, profileFile: String, arguments: Bundle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var className = className


                    var profileFile = profileFile


                    var arguments = arguments



                            throw RuntimeException()
}

override fun getSystemService(name: String)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var name = name



                            throw RuntimeException()
}

override fun checkPermission(permission: String, pid: Int, uid: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission


                    var pid = pid


                    var uid = uid



                            throw RuntimeException()
}

override fun checkCallingPermission(permission: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission



                            throw RuntimeException()
}

override fun checkCallingOrSelfPermission(permission: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission



                            throw RuntimeException()
}

override fun enforcePermission(permission: String, pid: Int, uid: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var pid = pid


                    var uid = uid


                    var message = message



                            throw RuntimeException()
}

override fun enforceCallingPermission(permission: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var message = message



                            throw RuntimeException()
}

override fun enforceCallingOrSelfPermission(permission: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var message = message



                            throw RuntimeException()
}

override fun grantUriPermission(toPackage: String, uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var toPackage = toPackage


                    var uri = uri


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun revokeUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun checkUriPermission(uri: Uri, pid: Int, uid: Int, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun checkCallingUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun checkCallingOrSelfUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun checkUriPermission(uri: Uri, readPermission: String, writePermission: String, pid: Int, uid: Int, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var readPermission = readPermission


                    var writePermission = writePermission


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags



                            throw RuntimeException()
}

override fun enforceUriPermission(uri: Uri, pid: Int, uid: Int, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags


                    var message = message



                            throw RuntimeException()
}

override fun enforceCallingUriPermission(uri: Uri, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags


                    var message = message



                            throw RuntimeException()
}

override fun enforceCallingOrSelfUriPermission(uri: Uri, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags


                    var message = message



                            throw RuntimeException()
}

override fun enforceUriPermission(uri: Uri, readPermission: String, writePermission: String, pid: Int, uid: Int, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var readPermission = readPermission


                    var writePermission = writePermission


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags


                    var message = message



                            throw RuntimeException()
}


                @Throws(NameNotFoundException::class)
            override fun createPackageContext(packageName: String, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Context{

                    var packageName = packageName


                    var flags = flags



                            throw RuntimeException()
}


}
                
            

