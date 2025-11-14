
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
        package org.allbinary.graphics.j2me




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.io.File
import java.util.HashMap
import javax.swing
import org.allbinary.data.tree.dom.XslHelper
import org.allbinary.dom.DomHelper
import org.allbinary.graphics.j2me.dialog.NewWorkAreaJDialog
import org.allbinary.graphics.j2me.dialog.RotateJDialog
import org.allbinary.graphics.j2me.workarea.WorkAreaDom
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanel
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanelInterface
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEvent
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventService
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventSource
import org.allbinary.gui.dialog.FileJDialog
import org.allbinary.gui.dialog.FileJDialogListenerInterface
import org.allbinary.gui.dialog.HashMapJDialogListenerInterface
import org.allbinary.log.LOGGING
import org.allbinary.logic.communication.log.GuiLog
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.math.AngleFactory
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document

open public class MyFrame : javax.swing.JFrame
                , FileJDialogListenerInterface
                , HashMapJDialogListenerInterface
                , java.awt.event.KeyListener {
        
companion object {
            
    private val MAXWORKAREAS: Int = 10

    private var numberOfWorkAreas: Int = 0

    private val PATH: String = "G:/mnt/bc/mydev/work/graphics/AllBinaryGraphicsJavaApplication"

    private val SAVE_PATH: String = PATH +"/save"

    private val TEMPLATE_EXPORT_PATH: String = PATH +"/templates/export"

    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args

        try {
            AngleFactory.getInstance()
SmallIntegerSingletonFactory.getInstance()!!.init()
MyFrame().
                            show()
} catch(e: Exception)
            {

    var logUtil: LogUtil = LogUtil.getInstance()!!

logUtil!!.put(CommonStrings.getInstance()!!.EXCEPTION, 
                            null, "main", e)
}

}


    var statusJLabel: javax.swing.JLabel

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val guiLog: GuiLog = GuiLog.getInstance()!!

    private val xslHelper: XslHelper = XslHelper.getInstance()!!

    private val JAVA_TEMPLATE: String = "svgExport.xsl"

    private val SAVEEXTENSION: String = ".gxml"

    private val JAVAEXTENSION: String = ".javax"

    private var fileJDialog: FileJDialog

    private var rotateJDialog: RotateJDialog
public constructor (){
initComponents()
this.setSize(Dimension(550, 400))
this.mainJPanel!!.setSize(Dimension(550, 400))
this.jTabbedPane!!.setSize(Dimension(550, 400))
fileJDialog= FileJDialog()
fileJDialog!!.addFinishedListener(this)
this.rotateJDialog= RotateJDialog(this, false)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
jToolBar1= javax.swing.JToolBar()
jButton2= javax.swing.JButton()
saveJButton= javax.swing.JButton()
jButton1= javax.swing.JButton()
openJButton= javax.swing.JButton()
jButton3= javax.swing.JButton()
jButton4= javax.swing.JButton()
jButton41= javax.swing.JButton()
jButton5= javax.swing.JButton()
animateJButton= javax.swing.JButton()
playJButton= javax.swing.JButton()
stopJjButton= javax.swing.JButton()
jPanel1= javax.swing.JPanel()
mainJPanel= javax.swing.JPanel()
jTabbedPane= javax.swing.JTabbedPane()
statusJPanel= javax.swing.JPanel()
statusJLabel= javax.swing.JLabel()
menuJMenuBar= javax.swing.JMenuBar()
fileJMenu= javax.swing.JMenu()
newJMenuItem= javax.swing.JMenuItem()
openJMenuItem= javax.swing.JMenuItem()
saveJMenuItem= javax.swing.JMenuItem()
saveAsJMenuItem= javax.swing.JMenuItem()
exportJMenuItem1= javax.swing.JMenuItem()
exitJMenuItem= javax.swing.JMenuItem()
viewJMenu= javax.swing.JMenu()
zoomInJMenuItem= javax.swing.JMenuItem()
zoomOutJMenuItem= javax.swing.JMenuItem()
objectJMenu= javax.swing.JMenu()
explodeAllJMenuItem= javax.swing.JMenuItem()
frameJMenu= javax.swing.JMenu()
previousFrameJMenuItem= javax.swing.JMenuItem()
nextFrameJMenuItem= javax.swing.JMenuItem()
removeJMenuItem= javax.swing.JMenuItem()
copyJMenuItem1= javax.swing.JMenuItem()
insertAfterJMenuItem= javax.swing.JMenuItem()
insertBeforeJMenuItem= javax.swing.JMenuItem()
generateJMenu= javax.swing.JMenu()
centerJMenuItem= javax.swing.JMenuItem()
autoDamageJMenuItem= javax.swing.JMenuItem()
autoExplodeJMenuItem= javax.swing.JMenuItem()
autoGrowJMenuItem= javax.swing.JMenuItem()
jMenuItem1= javax.swing.JMenuItem()
autoRotateGenerationJMenuItem= javax.swing.JMenuItem()
autoSheildMenuItem= javax.swing.JMenuItem()
autoShrinkJMenuItem= javax.swing.JMenuItem()
jMenu1= javax.swing.JMenu()
addWindowListener(object: java.awt.event.WindowAdapter()
                                {
                                
    open override fun windowClosing(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
exitForm(evt)
}

                                }
                            )
jButton2!!.setText("New")
jButton2!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton2ActionPerformed(evt)
}

                                }
                            )
jToolBar1!!.add(jButton2)
saveJButton!!.setText("Save")
saveJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
saveJButtonActionPerformed(evt)
}

                                }
                            )
jToolBar1!!.add(saveJButton)
jButton1!!.setText("Export")
jButton1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
jToolBar1!!.add(jButton1)
openJButton!!.setText("Open")
openJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
openJButtonActionPerformed(evt)
}

                                }
                            )
jToolBar1!!.add(openJButton)
jButton3!!.setText("Copy")
jToolBar1!!.add(jButton3)
jButton4!!.setText("Insert Before")
jToolBar1!!.add(jButton4)
jButton41!!.setText("Insert After")
jToolBar1!!.add(jButton41)
jButton5!!.setText("Delete")
jToolBar1!!.add(jButton5)
animateJButton!!.setText("AnimateEdit")
jToolBar1!!.add(animateJButton)
playJButton!!.setText("Play")
playJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
playJButtonMousePressed(evt)
}

                                }
                            )
jToolBar1!!.add(playJButton)
stopJjButton!!.setText("Stop")
stopJjButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stopJjButtonMousePressed(evt)
}

                                }
                            )
jToolBar1!!.add(stopJjButton)
getContentPane()!!.add(jToolBar1, java.awt.BorderLayout.NORTH)
jPanel1!!.setLayout(java.awt.GridLayout(1, 0))
mainJPanel!!.setLayout(java.awt.GridLayout(1, 0))
jTabbedPane!!.setMinimumSize(java.awt.Dimension(550, 400))
jTabbedPane!!.addChangeListener(object: javax.swing.event.ChangeListener()
                                {
                                
    open override fun stateChanged(evt: javax.swing.event.ChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jTabbedPaneStateChanged(evt)
}

                                }
                            )
mainJPanel!!.add(jTabbedPane)
jPanel1!!.add(mainJPanel)
getContentPane()!!.add(jPanel1, java.awt.BorderLayout.CENTER)
statusJPanel!!.setLayout(java.awt.GridLayout(1, 0))
statusJLabel!!.setText("Status Bar")
statusJPanel!!.add(statusJLabel)
getContentPane()!!.add(statusJPanel, java.awt.BorderLayout.SOUTH)
fileJMenu!!.setText("File")
fileJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fileJMenuActionPerformed(evt)
}

                                }
                            )
newJMenuItem!!.setText("New")
newJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newJMenuItemActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(newJMenuItem)
openJMenuItem!!.setText("Open")
openJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
openJMenuItemActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(openJMenuItem)
saveJMenuItem!!.setText("Save")
saveJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
saveJMenuItemMousePressed(evt)
}

                                }
                            )
fileJMenu!!.add(saveJMenuItem)
saveAsJMenuItem!!.setText("SaveAs")
fileJMenu!!.add(saveAsJMenuItem)
exportJMenuItem1!!.setText("Export")
exportJMenuItem1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
exportJMenuItem1ActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(exportJMenuItem1)
exitJMenuItem!!.setText("Exit")
exitJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
exitJMenuItemActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(exitJMenuItem)
menuJMenuBar!!.add(fileJMenu)
viewJMenu!!.setText("View")
zoomInJMenuItem!!.setText("Zoom In")
zoomInJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
zoomInJMenuItemMousePressed(evt)
}

                                }
                            )
viewJMenu!!.add(zoomInJMenuItem)
zoomOutJMenuItem!!.setText("Zoom Out")
zoomOutJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
zoomOutJMenuItemMousePressed(evt)
}

                                }
                            )
viewJMenu!!.add(zoomOutJMenuItem)
menuJMenuBar!!.add(viewJMenu)
objectJMenu!!.setText("Objects")
explodeAllJMenuItem!!.setText("Explode All")
explodeAllJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
explodeAllJMenuItemMousePressed(evt)
}

                                }
                            )
objectJMenu!!.add(explodeAllJMenuItem)
menuJMenuBar!!.add(objectJMenu)
frameJMenu!!.setText("Frame")
frameJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
frameJMenuActionPerformed(evt)
}

                                }
                            )
previousFrameJMenuItem!!.setText("Previous")
frameJMenu!!.add(previousFrameJMenuItem)
nextFrameJMenuItem!!.setText("Next")
frameJMenu!!.add(nextFrameJMenuItem)
removeJMenuItem!!.setText("Remove")
frameJMenu!!.add(removeJMenuItem)
copyJMenuItem1!!.setText("Copy")
frameJMenu!!.add(copyJMenuItem1)
insertAfterJMenuItem!!.setText("Ins After")
frameJMenu!!.add(insertAfterJMenuItem)
insertBeforeJMenuItem!!.setText("Ins Before")
frameJMenu!!.add(insertBeforeJMenuItem)
menuJMenuBar!!.add(frameJMenu)
generateJMenu!!.setText("Generate")
centerJMenuItem!!.setText("Center")
centerJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
centerJMenuItemActionPerformed(evt)
}

                                }
                            )
generateJMenu!!.add(centerJMenuItem)
autoDamageJMenuItem!!.setText("Damage")
generateJMenu!!.add(autoDamageJMenuItem)
autoExplodeJMenuItem!!.setText("Explode")
autoExplodeJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
autoExplodeJMenuItemMousePressed(evt)
}

                                }
                            )
generateJMenu!!.add(autoExplodeJMenuItem)
autoGrowJMenuItem!!.setText("Grow")
generateJMenu!!.add(autoGrowJMenuItem)
jMenuItem1!!.setText("Mirror")
jMenuItem1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jMenuItem1ActionPerformed(evt)
}

                                }
                            )
generateJMenu!!.add(jMenuItem1)
autoRotateGenerationJMenuItem!!.setText("Rotate")
autoRotateGenerationJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
autoRotateGenerationJMenuItemMousePressed(evt)
}

                                }
                            )
generateJMenu!!.add(autoRotateGenerationJMenuItem)
autoSheildMenuItem!!.setText("Shield")
generateJMenu!!.add(autoSheildMenuItem)
autoShrinkJMenuItem!!.setText("Shrink")
generateJMenu!!.add(autoShrinkJMenuItem)
menuJMenuBar!!.add(generateJMenu)
jMenu1!!.setText("Help")
menuJMenuBar!!.add(jMenu1)
setJMenuBar(menuJMenuBar)
pack()
}


    open fun explodeAllJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.EXPLODE, 
                            null) as Object))
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "explodeAllJMenuItemMousePressed", e)
}

}


    open fun autoExplodeJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.AUTOEXPLODE, 
                            null) as Object))
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "autoExplodeJMenuItemMousePressed", e)
}

}


    open fun stopJjButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getSelectedWorkArea()!!.stop()
}


    open fun playJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getSelectedWorkArea()!!.play()
}


    open fun autoRotateGenerationJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.rotateJDialog!!.setVisible(true)
}


    open fun zoomOutJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
getSelectedWorkArea()!!.changeZoom( -1)
}


    open fun zoomInJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
getSelectedWorkArea()!!.changeZoom(1)
}


    open fun openJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.openGraphics()
}


    open fun exportJMenuItem1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.export()
}


    open fun saveJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.save()
}


    open fun jTabbedPaneStateChanged(evt: javax.swing.event.ChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateSelectedWorkArea()
}


    open fun frameJMenuActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun exitJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
System.exit(0)
}


    open fun newJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.newGraphics()
}


    open fun fileJMenuActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun exitForm(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
System.exit(0)
}


    open fun openJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.openGraphics()
}


    open fun jButton2ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.newGraphics()
}


    open fun centerJMenuItemActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.CENTER, 
                            null) as Object))
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "centerJMenuItemActionPerformed", e)
}

}


    open fun saveJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.save()
}


    open fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.export()
}


    open fun jMenuItem1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.getSelectedWorkArea()!!.autoMirror()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "centerJMenuItemActionPerformed", e)
}

}


    open fun onFiles(files: Array<File?>)
        //nullable = true from not(false or (false and false)) = true
{
var files = files

        try {
            logUtil!!.put("Reading: " +files, this, "onFiles")




                        for (index in 0 until files.size)

        {

    var document: Document = DomHelper.getInstance()!!.createDocument(files[index]!!)!!


    var workAreaJPanel: WorkAreaJPanel = WorkAreaJPanel(WorkAreaDom(document), this.getSize())

workAreaJPanel!!.setLayout(GridLayout(1, 1))
this.add(workAreaJPanel as WorkAreaJPanelInterface)
}

this.fileJDialog!!.setVisible(false)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onFiles", e)
}

}


    open fun newGraphics()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var newName: String = "graphic" +this.numberOfWorkAreas


    var dim: Dimension = this.getSize()!!


    var newDialog: NewWorkAreaJDialog = NewWorkAreaJDialog(this, false, dim, newName)

} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    guiLog!!.put(commonStrings!!.EXCEPTION, this, "newJMenuItemActionPerformed", e)

                                    }
                                
}

}


    open fun openGraphics()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put("Starting", this, "openImageJMenuItemActionPerformed")
fileJDialog!!.setVisible(true)
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    guiLog!!.put(commonStrings!!.EXCEPTION, this, "open", e)

                                    }
                                
}

}


    open fun export()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface


    var file: File = File(this.SAVE_PATH +"/" +workAreaJPanel!!.getName() +JAVAEXTENSION)


    var document: Document = workAreaJPanel!!.toDocument()!!

logUtil!!.put("Export: " +DomHelper.getInstance()!!.toString(document), this, "exportJMenuItem1ActionPerformed")
xslHelper!!.export(file, this.TEMPLATE_EXPORT_PATH +"/" +this.JAVA_TEMPLATE, document)
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    guiLog!!.put(commonStrings!!.EXCEPTION, this, "export", e)

                                    }
                                
}

}


    open fun save()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface

DomHelper.getInstance()!!.save(File(this.SAVE_PATH +"/" +workAreaJPanel!!.getName() +SAVEEXTENSION), workAreaJPanel!!.toDocument())
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    guiLog!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun onHashMap(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var hashMap = hashMap

    var angleIncrementInteger: Integer = hashMap!!.get(Integer(Integer.valueOf(0))) as Integer


    var totalRotationInteger: Integer = hashMap!!.get(Integer(Integer.valueOf(1))) as Integer

this.getSelectedWorkArea()!!.autoRotate(angleIncrementInteger!!.toInt(), totalRotationInteger!!.toInt())
}


    open fun getSelectedWorkArea()
        //nullable = true from not(false or (false and true)) = true
: WorkAreaJPanelInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface
}


    open fun updateSelectedWorkArea()
        //nullable = true from not(false or (false and true)) = true
{

    var numberOfTabs: Int = this.jTabbedPane!!.getTabCount()!!





                        for (index in 0 until numberOfTabs)

        {

    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getComponentAt(index) as WorkAreaJPanelInterface

workAreaJPanel!!.deselect()
}


    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface


    
                        if(workAreaJPanel != 
                                    null
                                )
                        
                                    {
                                    workAreaJPanel!!.select()

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun add(newCanvasInterface: WorkAreaJPanelInterface)
        //nullable = true from not(false or (false and false)) = true
{
var newCanvasInterface = newCanvasInterface

        try {
            this.numberOfWorkAreas++

    
                        if(this.numberOfWorkAreas == MAXWORKAREAS)
                        
                                    {
                                    


                            throw Exception()

                                    }
                                
jTabbedPane!!.addTab(newCanvasInterface!!.getName(), newCanvasInterface as JPanel)
jTabbedPane!!.setSelectedComponent(newCanvasInterface as JPanel)

    var animationThread: Thread = Thread(newCanvasInterface as Runnable)

animationThread!!.start()
this.updateSelectedWorkArea()
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.GRAPHICSCREATION))
                        
                                    {
                                    guiLog!!.put(commonStrings!!.EXCEPTION, this, "addNewCanvas", e)

                                    }
                                
}

}


    open fun keyPressed(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
this.getSelectedWorkArea()!!.keyPressed(keyEvent)
}


    open fun keyReleased(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
}


    open fun keyTyped(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
}


    private var animateJButton: javax.swing.JButton

    private var autoDamageJMenuItem: javax.swing.JMenuItem

    private var autoExplodeJMenuItem: javax.swing.JMenuItem

    private var autoGrowJMenuItem: javax.swing.JMenuItem

    private var autoRotateGenerationJMenuItem: javax.swing.JMenuItem

    private var autoSheildMenuItem: javax.swing.JMenuItem

    private var autoShrinkJMenuItem: javax.swing.JMenuItem

    private var centerJMenuItem: javax.swing.JMenuItem

    private var copyJMenuItem1: javax.swing.JMenuItem

    private var exitJMenuItem: javax.swing.JMenuItem

    private var explodeAllJMenuItem: javax.swing.JMenuItem

    private var exportJMenuItem1: javax.swing.JMenuItem

    private var fileJMenu: javax.swing.JMenu

    private var frameJMenu: javax.swing.JMenu

    private var generateJMenu: javax.swing.JMenu

    private var insertAfterJMenuItem: javax.swing.JMenuItem

    private var insertBeforeJMenuItem: javax.swing.JMenuItem

    private var jButton1: javax.swing.JButton

    private var jButton2: javax.swing.JButton

    private var jButton3: javax.swing.JButton

    private var jButton4: javax.swing.JButton

    private var jButton41: javax.swing.JButton

    private var jButton5: javax.swing.JButton

    private var jMenu1: javax.swing.JMenu

    private var jMenuItem1: javax.swing.JMenuItem

    private var jPanel1: javax.swing.JPanel

    private var jTabbedPane: javax.swing.JTabbedPane

    private var jToolBar1: javax.swing.JToolBar

    private var mainJPanel: javax.swing.JPanel

    private var menuJMenuBar: javax.swing.JMenuBar

    private var newJMenuItem: javax.swing.JMenuItem

    private var nextFrameJMenuItem: javax.swing.JMenuItem

    private var objectJMenu: javax.swing.JMenu

    private var openJButton: javax.swing.JButton

    private var openJMenuItem: javax.swing.JMenuItem

    private var playJButton: javax.swing.JButton

    private var previousFrameJMenuItem: javax.swing.JMenuItem

    private var removeJMenuItem: javax.swing.JMenuItem

    private var saveAsJMenuItem: javax.swing.JMenuItem

    private var saveJButton: javax.swing.JButton

    private var saveJMenuItem: javax.swing.JMenuItem

    private var statusJPanel: javax.swing.JPanel

    private var stopJjButton: javax.swing.JButton

    private var viewJMenu: javax.swing.JMenu

    private var zoomInJMenuItem: javax.swing.JMenuItem

    private var zoomOutJMenuItem: javax.swing.JMenuItem

}
                
            

