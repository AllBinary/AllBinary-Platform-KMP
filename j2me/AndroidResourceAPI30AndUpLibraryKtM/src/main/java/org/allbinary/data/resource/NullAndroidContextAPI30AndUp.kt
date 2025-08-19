
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
        
        /* Do not generate this file */
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

    override fun bindService(
        service: Intent,
        conn: ServiceConnection,
        flags: Int
    ): Boolean {
        throw RuntimeException()
    }

    override fun checkCallingOrSelfPermission(permission: String): Int {
        throw RuntimeException()
    }

    override fun checkCallingOrSelfUriPermission(
        uri: Uri?,
        modeFlags: Int
    ): Int {
        throw RuntimeException()
    }

    override fun checkCallingPermission(permission: String): Int {
        throw RuntimeException()
    }

    override fun checkCallingUriPermission(
        uri: Uri?,
        modeFlags: Int
    ): Int {
        throw RuntimeException()
    }

    override fun checkPermission(
        permission: String,
        pid: Int,
        uid: Int
    ): Int {
        throw RuntimeException()
    }

    override fun checkSelfPermission(permission: String): Int {
        throw RuntimeException()
    }

    override fun checkUriPermission(
        uri: Uri?,
        pid: Int,
        uid: Int,
        modeFlags: Int
    ): Int {
        throw RuntimeException()
    }

    override fun checkUriPermission(
        uri: Uri?,
        readPermission: String?,
        writePermission: String?,
        pid: Int,
        uid: Int,
        modeFlags: Int
    ): Int {
        throw RuntimeException()
    }

    override fun clearWallpaper() {
        throw RuntimeException()
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context? {
        throw RuntimeException()
    }

    override fun createContextForSplit(splitName: String?): Context? {
        throw RuntimeException()
    }

    override fun createDeviceProtectedStorageContext(): Context? {
        throw RuntimeException()
    }

    override fun createDisplayContext(display: Display): Context? {
        throw RuntimeException()
    }

    override fun createPackageContext(
        packageName: String?,
        flags: Int
    ): Context? {
        throw RuntimeException()
    }

    override fun databaseList(): Array<out String?>? {
        throw RuntimeException()
    }

    override fun deleteDatabase(name: String?): Boolean {
        throw RuntimeException()
    }

    override fun deleteFile(name: String?): Boolean {
        throw RuntimeException()
    }

    override fun deleteSharedPreferences(name: String?): Boolean {
        throw RuntimeException()
    }

    override fun enforceCallingOrSelfPermission(
        permission: String,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun enforceCallingOrSelfUriPermission(
        uri: Uri?,
        modeFlags: Int,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun enforceCallingPermission(permission: String, message: String?) {
        throw RuntimeException()
    }

    override fun enforceCallingUriPermission(
        uri: Uri?,
        modeFlags: Int,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun enforcePermission(
        permission: String,
        pid: Int,
        uid: Int,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun enforceUriPermission(
        uri: Uri?,
        pid: Int,
        uid: Int,
        modeFlags: Int,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun enforceUriPermission(
        uri: Uri?,
        readPermission: String?,
        writePermission: String?,
        pid: Int,
        uid: Int,
        modeFlags: Int,
        message: String?
    ) {
        throw RuntimeException()
    }

    override fun fileList(): Array<out String?>? {
        throw RuntimeException()
    }

    override fun getApplicationContext(): Context? {
        throw RuntimeException()
    }

    override fun getApplicationInfo(): ApplicationInfo? {
        throw RuntimeException()
    }

    override fun getAssets(): AssetManager? {
        throw RuntimeException()
    }

    override fun getCacheDir(): File? {
        throw RuntimeException()
    }

    override fun getClassLoader(): ClassLoader? {
        throw RuntimeException()
    }

    override fun getCodeCacheDir(): File? {
        throw RuntimeException()
    }

    override fun getContentResolver(): ContentResolver? {
        throw RuntimeException()
    }

    override fun getDataDir(): File? {
        throw RuntimeException()
    }

    override fun getDatabasePath(name: String?): File? {
        throw RuntimeException()
    }

    override fun getDir(name: String?, mode: Int): File? {
        throw RuntimeException()
    }

    override fun getExternalCacheDir(): File? {
        throw RuntimeException()
    }

    override fun getExternalCacheDirs(): Array<out File?>? {
        throw RuntimeException()
    }

    override fun getExternalFilesDir(type: String?): File? {
        throw RuntimeException()
    }

    override fun getExternalFilesDirs(type: String?): Array<out File?>? {
        throw RuntimeException()
    }

    override fun getExternalMediaDirs(): Array<out File?>? {
        throw RuntimeException()
    }

    override fun getFileStreamPath(name: String?): File? {
        throw RuntimeException()
    }

    override fun getFilesDir(): File? {
        throw RuntimeException()
    }

    override fun getMainLooper(): Looper? {
        throw RuntimeException()
    }

    override fun getNoBackupFilesDir(): File? {
        throw RuntimeException()
    }

    override fun getObbDir(): File? {
        throw RuntimeException()
    }

    override fun getObbDirs(): Array<out File?>? {
        throw RuntimeException()
    }

    override fun getPackageCodePath(): String? {
        throw RuntimeException()
    }

    override fun getPackageManager(): PackageManager? {
        throw RuntimeException()
    }

    override fun getPackageName(): String? {
        throw RuntimeException()
    }

    override fun getPackageResourcePath(): String? {
        throw RuntimeException()
    }

    override fun getResources(): Resources? {
        throw RuntimeException()
    }

    override fun getSharedPreferences(
        name: String?,
        mode: Int
    ): SharedPreferences? {
        throw RuntimeException()
    }

    override fun getSystemService(name: String): Any? {
        throw RuntimeException()
    }

    override fun getSystemServiceName(serviceClass: Class<*>): String? {
        throw RuntimeException()
    }

    override fun getTheme(): Theme? {
        throw RuntimeException()
    }

    override fun getWallpaper(): Drawable? {
        throw RuntimeException()
    }

    override fun getWallpaperDesiredMinimumHeight(): Int {
        throw RuntimeException()
    }

    override fun getWallpaperDesiredMinimumWidth(): Int {
        throw RuntimeException()
    }

    override fun grantUriPermission(
        toPackage: String?,
        uri: Uri?,
        modeFlags: Int
    ) {
        throw RuntimeException()
    }

    override fun isDeviceProtectedStorage(): Boolean {
        throw RuntimeException()
    }

    override fun moveDatabaseFrom(
        sourceContext: Context?,
        name: String?
    ): Boolean {
        throw RuntimeException()
    }

    override fun moveSharedPreferencesFrom(
        sourceContext: Context?,
        name: String?
    ): Boolean {
        throw RuntimeException()
    }

    override fun openFileInput(name: String?): FileInputStream? {
        throw RuntimeException()
    }

    override fun openFileOutput(name: String?, mode: Int): FileOutputStream? {
        throw RuntimeException()
    }

    override fun openOrCreateDatabase(
        name: String?,
        mode: Int,
        factory: CursorFactory?
    ): SQLiteDatabase? {
        throw RuntimeException()
    }

    override fun openOrCreateDatabase(
        name: String?,
        mode: Int,
        factory: CursorFactory?,
        errorHandler: DatabaseErrorHandler?
    ): SQLiteDatabase? {
        throw RuntimeException()
    }

    override fun peekWallpaper(): Drawable? {
        throw RuntimeException()
    }

    override fun registerReceiver(
        receiver: BroadcastReceiver?,
        filter: IntentFilter?
    ): Intent? {
        throw RuntimeException()
    }

    override fun registerReceiver(
        receiver: BroadcastReceiver?,
        filter: IntentFilter?,
        flags: Int
    ): Intent? {
        throw RuntimeException()
    }

    override fun registerReceiver(
        receiver: BroadcastReceiver?,
        filter: IntentFilter?,
        broadcastPermission: String?,
        scheduler: Handler?
    ): Intent? {
        throw RuntimeException()
    }

    override fun registerReceiver(
        receiver: BroadcastReceiver?,
        filter: IntentFilter?,
        broadcastPermission: String?,
        scheduler: Handler?,
        flags: Int
    ): Intent? {
        throw RuntimeException()
    }

    override fun removeStickyBroadcast(intent: Intent?) {
        throw RuntimeException()
    }

    override fun removeStickyBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?
    ) {
        throw RuntimeException()
    }

    override fun revokeUriPermission(uri: Uri?, modeFlags: Int) {
        throw RuntimeException()
    }

    override fun revokeUriPermission(
        toPackage: String?,
        uri: Uri?,
        modeFlags: Int
    ) {
        throw RuntimeException()
    }

    override fun sendBroadcast(intent: Intent?) {
        throw RuntimeException()
    }

    override fun sendBroadcast(
        intent: Intent?,
        receiverPermission: String?
    ) {
        throw RuntimeException()
    }

    override fun sendBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?
    ) {
        throw RuntimeException()
    }

    override fun sendBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?,
        receiverPermission: String?
    ) {
        throw RuntimeException()
    }

    override fun sendOrderedBroadcast(
        intent: Intent?,
        receiverPermission: String?
    ) {
        throw RuntimeException()
    }

    override fun sendOrderedBroadcast(
        intent: Intent,
        receiverPermission: String?,
        resultReceiver: BroadcastReceiver?,
        scheduler: Handler?,
        initialCode: Int,
        initialData: String?,
        initialExtras: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun sendOrderedBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?,
        receiverPermission: String?,
        resultReceiver: BroadcastReceiver?,
        scheduler: Handler?,
        initialCode: Int,
        initialData: String?,
        initialExtras: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun sendStickyBroadcast(intent: Intent?) {
        throw RuntimeException()
    }

    override fun sendStickyBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?
    ) {
        throw RuntimeException()
    }

    override fun sendStickyOrderedBroadcast(
        intent: Intent?,
        resultReceiver: BroadcastReceiver?,
        scheduler: Handler?,
        initialCode: Int,
        initialData: String?,
        initialExtras: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun sendStickyOrderedBroadcastAsUser(
        intent: Intent?,
        user: UserHandle?,
        resultReceiver: BroadcastReceiver?,
        scheduler: Handler?,
        initialCode: Int,
        initialData: String?,
        initialExtras: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun setTheme(resid: Int) {
        throw RuntimeException()
    }

    override fun setWallpaper(bitmap: Bitmap?) {
        throw RuntimeException()
    }

    override fun setWallpaper(data: InputStream?) {
        throw RuntimeException()
    }

    override fun startActivities(intents: Array<out Intent?>?) {
        throw RuntimeException()
    }

    override fun startActivities(
        intents: Array<out Intent?>?,
        options: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun startActivity(intent: Intent?) {
        throw RuntimeException()
    }

    override fun startActivity(intent: Intent?, options: Bundle?) {
        throw RuntimeException()
    }

    override fun startForegroundService(service: Intent?): ComponentName? {
        throw RuntimeException()
    }

    override fun startInstrumentation(
        className: ComponentName,
        profileFile: String?,
        arguments: Bundle?
    ): Boolean {
        throw RuntimeException()
    }

    override fun startIntentSender(
        intent: IntentSender?,
        fillInIntent: Intent?,
        flagsMask: Int,
        flagsValues: Int,
        extraFlags: Int
    ) {
        throw RuntimeException()
    }

    override fun startIntentSender(
        intent: IntentSender?,
        fillInIntent: Intent?,
        flagsMask: Int,
        flagsValues: Int,
        extraFlags: Int,
        options: Bundle?
    ) {
        throw RuntimeException()
    }

    override fun startService(service: Intent?): ComponentName? {
        throw RuntimeException()
    }

    override fun stopService(service: Intent?): Boolean {
        throw RuntimeException()
    }

    override fun unbindService(conn: ServiceConnection) {
        throw RuntimeException()
    }

    override fun unregisterReceiver(receiver: BroadcastReceiver?) {
        throw RuntimeException()
    }

}
                
            

