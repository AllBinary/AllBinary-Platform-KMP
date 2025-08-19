
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
import android.content.IntentSender
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.content.pm.PackageManager.NameNotFoundException
import android.content.res.AssetManager
import android.content.res.Configuration
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.UserHandle
import android.view.Display
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

open public class NullAndroidContextAPI30AndUp : Context {
        

        companion object {
            
    private val NULL_ANDROID_CONTEXT: Context = NullAndroidContextAPI30AndUp()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Context{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_ANDROID_CONTEXT
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun bindService(service: Intent, conn: ServiceConnection, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var service = service


                    var conn = conn


                    var flags = flags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun checkCallingOrSelfPermission(permission: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkCallingOrSelfUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var modeFlags = modeFlags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkCallingPermission(permission: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkCallingUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var modeFlags = modeFlags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkPermission(permission: String, pid: Int, uid: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission


                    var pid = pid


                    var uid = uid



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkSelfPermission(permission: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var permission = permission



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun checkUriPermission(uri: Uri, pid: Int, uid: Int, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var uri = uri


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(IOException::class)
            override fun clearWallpaper()
        //nullable = true from not(false or (false and true)) = true
{}

override fun createConfigurationContext(overrideConfiguration: Configuration)
        //nullable = true from not(false or (false and false)) = true
: Context{

                    var overrideConfiguration = overrideConfiguration



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(NameNotFoundException::class)
            override fun createContextForSplit(splitName: String)
        //nullable = true from not(false or (false and false)) = true
: Context{

                    var splitName = splitName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun createDeviceProtectedStorageContext()
        //nullable = true from not(false or (false and true)) = true
: Context{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun createDisplayContext(display: Display)
        //nullable = true from not(false or (false and false)) = true
: Context{

                    var display = display



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(NameNotFoundException::class)
            override fun createPackageContext(packageName: String, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Context{

                    var packageName = packageName


                    var flags = flags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun databaseList()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun deleteDatabase(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun deleteFile(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun deleteSharedPreferences(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun enforceCallingOrSelfPermission(permission: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var message = message
}

override fun enforceCallingOrSelfUriPermission(uri: Uri, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags


                    var message = message
}

override fun enforceCallingPermission(permission: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var message = message
}

override fun enforceCallingUriPermission(uri: Uri, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags


                    var message = message
}

override fun enforcePermission(permission: String, pid: Int, uid: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var permission = permission


                    var pid = pid


                    var uid = uid


                    var message = message
}

override fun enforceUriPermission(uri: Uri, pid: Int, uid: Int, modeFlags: Int, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var pid = pid


                    var uid = uid


                    var modeFlags = modeFlags


                    var message = message
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
}

override fun fileList()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun getApplicationContext()
        //nullable = true from not(false or (false and true)) = true
: Context{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getApplicationInfo()
        //nullable = true from not(false or (false and true)) = true
: ApplicationInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getAssets()
        //nullable = true from not(false or (false and true)) = true
: AssetManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getCacheDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getClassLoader()
        //nullable = true from not(false or (false and true)) = true
: ClassLoader{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getCodeCacheDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getContentResolver()
        //nullable = true from not(false or (false and true)) = true
: ContentResolver{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getDataDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getDatabasePath(name: String)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getDir(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name


                    var mode = mode



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getExternalCacheDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getExternalCacheDirs()
        //nullable = true from not(false or (false and true)) = true
: Array<File?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun getExternalFilesDir(type: String)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getExternalFilesDirs(type: String)
        //nullable = true from not(false or (false and false)) = true
: Array<File?>{

                    var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun getExternalMediaDirs()
        //nullable = true from not(false or (false and true)) = true
: Array<File?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun getFileStreamPath(name: String)
        //nullable = true from not(false or (false and false)) = true
: File{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getFilesDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getMainLooper()
        //nullable = true from not(false or (false and true)) = true
: Looper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getNoBackupFilesDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getObbDir()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getObbDirs()
        //nullable = true from not(false or (false and true)) = true
: Array<File?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun getPackageCodePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ""
}

override fun getPackageManager()
        //nullable = true from not(false or (false and true)) = true
: PackageManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getPackageName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ""
}

override fun getPackageResourcePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ""
}

override fun getResources()
        //nullable = true from not(false or (false and true)) = true
: Resources{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getSharedPreferences(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: SharedPreferences{

                    var name = name


                    var mode = mode



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getSystemService(name: String)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getSystemServiceName(serviceClass: KClass<*><
                //Otherwise - typeArguments - type - WildcardType
>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var serviceClass = serviceClass



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ""
}

override fun getTheme()
        //nullable = true from not(false or (false and true)) = true
: Theme{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getWallpaper()
        //nullable = true from not(false or (false and true)) = true
: Drawable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun getWallpaperDesiredMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun getWallpaperDesiredMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun grantUriPermission(toPackage: String, uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var toPackage = toPackage


                    var uri = uri


                    var modeFlags = modeFlags
}

override fun isDeviceProtectedStorage()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun moveDatabaseFrom(sourceContext: Context, name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var sourceContext = sourceContext


                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun moveSharedPreferencesFrom(sourceContext: Context, name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var sourceContext = sourceContext


                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(FileNotFoundException::class)
            override fun openFileInput(name: String)
        //nullable = true from not(false or (false and false)) = true
: FileInputStream{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(FileNotFoundException::class)
            override fun openFileOutput(name: String, mode: Int)
        //nullable = true from not(false or (false and false)) = true
: FileOutputStream{

                    var name = name


                    var mode = mode



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun openOrCreateDatabase(name: String, mode: Int, factory: CursorFactory)
        //nullable = true from not(false or (false and false)) = true
: SQLiteDatabase{

                    var name = name


                    var mode = mode


                    var factory = factory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun openOrCreateDatabase(name: String, mode: Int, factory: CursorFactory, errorHandler: DatabaseErrorHandler)
        //nullable = true from not(false or (false and false)) = true
: SQLiteDatabase{

                    var name = name


                    var mode = mode


                    var factory = factory


                    var errorHandler = errorHandler



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun peekWallpaper()
        //nullable = true from not(false or (false and true)) = true
: Drawable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter


                    var flags = flags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter, broadcastPermission: String, scheduler: Handler)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter


                    var broadcastPermission = broadcastPermission


                    var scheduler = scheduler



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter, broadcastPermission: String, scheduler: Handler, flags: Int)
        //nullable = true from not(false or (false and false)) = true
: Intent{

                    var receiver = receiver


                    var filter = filter


                    var broadcastPermission = broadcastPermission


                    var scheduler = scheduler


                    var flags = flags



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun removeStickyBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent
}

override fun removeStickyBroadcastAsUser(intent: Intent, user: UserHandle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user
}

override fun revokeUriPermission(uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var uri = uri


                    var modeFlags = modeFlags
}

override fun revokeUriPermission(toPackage: String, uri: Uri, modeFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var toPackage = toPackage


                    var uri = uri


                    var modeFlags = modeFlags
}

override fun sendBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent
}

override fun sendBroadcast(intent: Intent, receiverPermission: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var receiverPermission = receiverPermission
}

override fun sendBroadcastAsUser(intent: Intent, user: UserHandle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user
}

override fun sendBroadcastAsUser(intent: Intent, user: UserHandle, receiverPermission: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user


                    var receiverPermission = receiverPermission
}

override fun sendOrderedBroadcast(intent: Intent, receiverPermission: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var receiverPermission = receiverPermission
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
}

override fun sendOrderedBroadcastAsUser(intent: Intent, user: UserHandle, receiverPermission: String, resultReceiver: BroadcastReceiver, scheduler: Handler, initialCode: Int, initialData: String, initialExtras: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user


                    var receiverPermission = receiverPermission


                    var resultReceiver = resultReceiver


                    var scheduler = scheduler


                    var initialCode = initialCode


                    var initialData = initialData


                    var initialExtras = initialExtras
}

override fun sendStickyBroadcast(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent
}

override fun sendStickyBroadcastAsUser(intent: Intent, user: UserHandle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user
}

override fun sendStickyOrderedBroadcast(intent: Intent, resultReceiver: BroadcastReceiver, scheduler: Handler, initialCode: Int, initialData: String, initialExtras: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var resultReceiver = resultReceiver


                    var scheduler = scheduler


                    var initialCode = initialCode


                    var initialData = initialData


                    var initialExtras = initialExtras
}

override fun sendStickyOrderedBroadcastAsUser(intent: Intent, user: UserHandle, resultReceiver: BroadcastReceiver, scheduler: Handler, initialCode: Int, initialData: String, initialExtras: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var user = user


                    var resultReceiver = resultReceiver


                    var scheduler = scheduler


                    var initialCode = initialCode


                    var initialData = initialData


                    var initialExtras = initialExtras
}

override fun setTheme(resid: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var resid = resid
}


                @Throws(IOException::class)
            override fun setWallpaper(bitmap: Bitmap)
        //nullable = true from not(false or (false and false)) = true
{

                    var bitmap = bitmap
}


                @Throws(IOException::class)
            override fun setWallpaper(data: InputStream)
        //nullable = true from not(false or (false and false)) = true
{

                    var data = data
}

override fun startActivities(intents: Array<Intent?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var intents = intents
}

override fun startActivities(intents: Array<Intent?>, options: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intents = intents


                    var options = options
}

override fun startActivity(intent: Intent)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent
}

override fun startActivity(intent: Intent, options: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var options = options
}

override fun startForegroundService(service: Intent)
        //nullable = true from not(false or (false and false)) = true
: ComponentName{

                    var service = service



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun startInstrumentation(className: ComponentName, profileFile: String, arguments: Bundle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var className = className


                    var profileFile = profileFile


                    var arguments = arguments



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(SendIntentException::class)
            override fun startIntentSender(intent: IntentSender, fillInIntent: Intent, flagsMask: Int, flagsValues: Int, extraFlags: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var fillInIntent = fillInIntent


                    var flagsMask = flagsMask


                    var flagsValues = flagsValues


                    var extraFlags = extraFlags
}


                @Throws(SendIntentException::class)
            override fun startIntentSender(intent: IntentSender, fillInIntent: Intent, flagsMask: Int, flagsValues: Int, extraFlags: Int, options: Bundle)
        //nullable = true from not(false or (false and false)) = true
{

                    var intent = intent


                    var fillInIntent = fillInIntent


                    var flagsMask = flagsMask


                    var flagsValues = flagsValues


                    var extraFlags = extraFlags


                    var options = options
}

override fun startService(service: Intent)
        //nullable = true from not(false or (false and false)) = true
: ComponentName{

                    var service = service



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

override fun stopService(service: Intent)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var service = service



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun unbindService(conn: ServiceConnection)
        //nullable = true from not(false or (false and false)) = true
{

                    var conn = conn
}

override fun unregisterReceiver(receiver: BroadcastReceiver)
        //nullable = true from not(false or (false and false)) = true
{

                    var receiver = receiver
}


}
                
            

