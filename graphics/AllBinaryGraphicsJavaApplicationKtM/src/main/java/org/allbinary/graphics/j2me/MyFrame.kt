
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

    private val SAVE_PATH: String = MyFrame.PATH +"/save"

    private val TEMPLATE_EXPORT_PATH: String = MyFrame.PATH +"/templates/export"

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
this.initComponents()
this.setSize(Dimension(550, 400))
this.mainJPanel!!.setSize(Dimension(550, 400))
this.jTabbedPane!!.setSize(Dimension(550, 400))
this.fileJDialog= FileJDialog()
this.fileJDialog!!.addFinishedListener(this)
this.rotateJDialog= RotateJDialog(this, false)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
jToolBar1= javax.swing.JToolBar()
this.jButton2= javax.swing.JButton()
this.saveJButton= javax.swing.JButton()
this.jButton1= javax.swing.JButton()
this.openJButton= javax.swing.JButton()
this.jButton3= javax.swing.JButton()
this.jButton4= javax.swing.JButton()
this.jButton41= javax.swing.JButton()
this.jButton5= javax.swing.JButton()
this.animateJButton= javax.swing.JButton()
this.playJButton= javax.swing.JButton()
this.stopJjButton= javax.swing.JButton()
this.jPanel1= javax.swing.JPanel()
this.mainJPanel= javax.swing.JPanel()
this.jTabbedPane= javax.swing.JTabbedPane()
this.statusJPanel= javax.swing.JPanel()
statusJLabel= javax.swing.JLabel()
this.menuJMenuBar= javax.swing.JMenuBar()
this.fileJMenu= javax.swing.JMenu()
this.newJMenuItem= javax.swing.JMenuItem()
this.openJMenuItem= javax.swing.JMenuItem()
this.saveJMenuItem= javax.swing.JMenuItem()
this.saveAsJMenuItem= javax.swing.JMenuItem()
this.exportJMenuItem1= javax.swing.JMenuItem()
this.exitJMenuItem= javax.swing.JMenuItem()
this.viewJMenu= javax.swing.JMenu()
this.zoomInJMenuItem= javax.swing.JMenuItem()
this.zoomOutJMenuItem= javax.swing.JMenuItem()
this.objectJMenu= javax.swing.JMenu()
this.explodeAllJMenuItem= javax.swing.JMenuItem()
this.frameJMenu= javax.swing.JMenu()
this.previousFrameJMenuItem= javax.swing.JMenuItem()
this.nextFrameJMenuItem= javax.swing.JMenuItem()
this.removeJMenuItem= javax.swing.JMenuItem()
this.copyJMenuItem1= javax.swing.JMenuItem()
this.insertAfterJMenuItem= javax.swing.JMenuItem()
this.insertBeforeJMenuItem= javax.swing.JMenuItem()
this.generateJMenu= javax.swing.JMenu()
this.centerJMenuItem= javax.swing.JMenuItem()
this.autoDamageJMenuItem= javax.swing.JMenuItem()
this.autoExplodeJMenuItem= javax.swing.JMenuItem()
this.autoGrowJMenuItem= javax.swing.JMenuItem()
this.jMenuItem1= javax.swing.JMenuItem()
this.autoRotateGenerationJMenuItem= javax.swing.JMenuItem()
this.autoSheildMenuItem= javax.swing.JMenuItem()
this.autoShrinkJMenuItem= javax.swing.JMenuItem()
this.jMenu1= javax.swing.JMenu()
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
this.jButton2!!.setText("New")
this.jButton2!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton2ActionPerformed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.jButton2)
this.saveJButton!!.setText("Save")
this.saveJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
saveJButtonActionPerformed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.saveJButton)
this.jButton1!!.setText("Export")
this.jButton1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.jButton1)
this.openJButton!!.setText("Open")
this.openJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
openJButtonActionPerformed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.openJButton)
this.jButton3!!.setText("Copy")
this.jToolBar1!!.add(this.jButton3)
this.jButton4!!.setText("Insert Before")
this.jToolBar1!!.add(this.jButton4)
this.jButton41!!.setText("Insert After")
this.jToolBar1!!.add(this.jButton41)
this.jButton5!!.setText("Delete")
this.jToolBar1!!.add(this.jButton5)
this.animateJButton!!.setText("AnimateEdit")
this.jToolBar1!!.add(this.animateJButton)
this.playJButton!!.setText("Play")
this.playJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
playJButtonMousePressed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.playJButton)
this.stopJjButton!!.setText("Stop")
this.stopJjButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stopJjButtonMousePressed(evt)
}

                                }
                            )
this.jToolBar1!!.add(this.stopJjButton)
getContentPane()!!.add(this.jToolBar1, java.awt.BorderLayout.NORTH)
this.jPanel1!!.setLayout(java.awt.GridLayout(1, 0))
this.mainJPanel!!.setLayout(java.awt.GridLayout(1, 0))
this.jTabbedPane!!.setMinimumSize(java.awt.Dimension(550, 400))
this.jTabbedPane!!.addChangeListener(object: javax.swing.event.ChangeListener()
                                {
                                
    open override fun stateChanged(evt: javax.swing.event.ChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jTabbedPaneStateChanged(evt)
}

                                }
                            )
this.mainJPanel!!.add(this.jTabbedPane)
this.jPanel1!!.add(this.mainJPanel)
getContentPane()!!.add(this.jPanel1, java.awt.BorderLayout.CENTER)
this.statusJPanel!!.setLayout(java.awt.GridLayout(1, 0))
statusJLabel!!.setText("Status Bar")
this.statusJPanel!!.add(statusJLabel)
getContentPane()!!.add(this.statusJPanel, java.awt.BorderLayout.SOUTH)
this.fileJMenu!!.setText("File")
this.fileJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fileJMenuActionPerformed(evt)
}

                                }
                            )
this.newJMenuItem!!.setText("New")
this.newJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
newJMenuItemActionPerformed(evt)
}

                                }
                            )
this.fileJMenu!!.add(this.newJMenuItem)
this.openJMenuItem!!.setText("Open")
this.openJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
openJMenuItemActionPerformed(evt)
}

                                }
                            )
this.fileJMenu!!.add(this.openJMenuItem)
this.saveJMenuItem!!.setText("Save")
this.saveJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
saveJMenuItemMousePressed(evt)
}

                                }
                            )
this.fileJMenu!!.add(this.saveJMenuItem)
this.saveAsJMenuItem!!.setText("SaveAs")
this.fileJMenu!!.add(this.saveAsJMenuItem)
this.exportJMenuItem1!!.setText("Export")
this.exportJMenuItem1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
exportJMenuItem1ActionPerformed(evt)
}

                                }
                            )
this.fileJMenu!!.add(this.exportJMenuItem1)
this.exitJMenuItem!!.setText("Exit")
this.exitJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
exitJMenuItemActionPerformed(evt)
}

                                }
                            )
this.fileJMenu!!.add(this.exitJMenuItem)
this.menuJMenuBar!!.add(this.fileJMenu)
this.viewJMenu!!.setText("View")
this.zoomInJMenuItem!!.setText("Zoom In")
this.zoomInJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
zoomInJMenuItemMousePressed(evt)
}

                                }
                            )
this.viewJMenu!!.add(this.zoomInJMenuItem)
this.zoomOutJMenuItem!!.setText("Zoom Out")
this.zoomOutJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
zoomOutJMenuItemMousePressed(evt)
}

                                }
                            )
this.viewJMenu!!.add(this.zoomOutJMenuItem)
this.menuJMenuBar!!.add(this.viewJMenu)
this.objectJMenu!!.setText("Objects")
this.explodeAllJMenuItem!!.setText("Explode All")
this.explodeAllJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
explodeAllJMenuItemMousePressed(evt)
}

                                }
                            )
this.objectJMenu!!.add(this.explodeAllJMenuItem)
this.menuJMenuBar!!.add(this.objectJMenu)
this.frameJMenu!!.setText("Frame")
this.frameJMenu!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
frameJMenuActionPerformed(evt)
}

                                }
                            )
this.previousFrameJMenuItem!!.setText("Previous")
this.frameJMenu!!.add(this.previousFrameJMenuItem)
this.nextFrameJMenuItem!!.setText("Next")
this.frameJMenu!!.add(this.nextFrameJMenuItem)
this.removeJMenuItem!!.setText("Remove")
this.frameJMenu!!.add(this.removeJMenuItem)
this.copyJMenuItem1!!.setText("Copy")
this.frameJMenu!!.add(this.copyJMenuItem1)
this.insertAfterJMenuItem!!.setText("Ins After")
this.frameJMenu!!.add(this.insertAfterJMenuItem)
this.insertBeforeJMenuItem!!.setText("Ins Before")
this.frameJMenu!!.add(this.insertBeforeJMenuItem)
this.menuJMenuBar!!.add(this.frameJMenu)
this.generateJMenu!!.setText("Generate")
this.centerJMenuItem!!.setText("Center")
this.centerJMenuItem!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
centerJMenuItemActionPerformed(evt)
}

                                }
                            )
this.generateJMenu!!.add(this.centerJMenuItem)
this.autoDamageJMenuItem!!.setText("Damage")
this.generateJMenu!!.add(this.autoDamageJMenuItem)
this.autoExplodeJMenuItem!!.setText("Explode")
this.autoExplodeJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
autoExplodeJMenuItemMousePressed(evt)
}

                                }
                            )
this.generateJMenu!!.add(this.autoExplodeJMenuItem)
this.autoGrowJMenuItem!!.setText("Grow")
this.generateJMenu!!.add(this.autoGrowJMenuItem)
this.jMenuItem1!!.setText("Mirror")
this.jMenuItem1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jMenuItem1ActionPerformed(evt)
}

                                }
                            )
this.generateJMenu!!.add(this.jMenuItem1)
this.autoRotateGenerationJMenuItem!!.setText("Rotate")
this.autoRotateGenerationJMenuItem!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
autoRotateGenerationJMenuItemMousePressed(evt)
}

                                }
                            )
this.generateJMenu!!.add(this.autoRotateGenerationJMenuItem)
this.autoSheildMenuItem!!.setText("Shield")
this.generateJMenu!!.add(this.autoSheildMenuItem)
this.autoShrinkJMenuItem!!.setText("Shrink")
this.generateJMenu!!.add(this.autoShrinkJMenuItem)
this.menuJMenuBar!!.add(this.generateJMenu)
this.jMenu1!!.setText("Help")
this.menuJMenuBar!!.add(this.jMenu1)
setJMenuBar(this.menuJMenuBar)
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
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "explodeAllJMenuItemMousePressed", e)
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
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "autoExplodeJMenuItemMousePressed", e)
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
this.getSelectedWorkArea()!!.changeZoom( -1)
}


    open fun zoomInJMenuItemMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getSelectedWorkArea()!!.changeZoom(1)
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
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "centerJMenuItemActionPerformed", e)
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
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "centerJMenuItemActionPerformed", e)
}

}


    open fun onFiles(files: Array<File?>)
        //nullable = true from not(false or (false and false)) = true
{
var files = files

        try {
            this.logUtil!!.putF("Reading: " +files, this, "onFiles")




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
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "onFiles", e)
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
                                    this.guiLog!!.put(this.commonStrings!!.EXCEPTION, this, "newJMenuItemActionPerformed", e)

                                    }
                                
}

}


    open fun openGraphics()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.logUtil!!.putF("Starting", this, "openImageJMenuItemActionPerformed")
this.fileJDialog!!.setVisible(true)
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    this.guiLog!!.put(this.commonStrings!!.EXCEPTION, this, "open", e)

                                    }
                                
}

}


    open fun export()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface


    var file: File = File(this.SAVE_PATH +"/" +workAreaJPanel!!.getName() +this.JAVAEXTENSION)


    var document: Document = workAreaJPanel!!.toDocument()!!

this.logUtil!!.putF("Export: " +DomHelper.getInstance()!!.toString(document), this, "exportJMenuItem1ActionPerformed")
this.xslHelper!!.export(file, this.TEMPLATE_EXPORT_PATH +"/" +this.JAVA_TEMPLATE, document)
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    this.guiLog!!.put(this.commonStrings!!.EXCEPTION, this, "export", e)

                                    }
                                
}

}


    open fun save()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var workAreaJPanel: WorkAreaJPanelInterface = this.jTabbedPane!!.getSelectedComponent() as WorkAreaJPanelInterface

DomHelper.getInstance()!!.save(File(this.SAVE_PATH +"/" +workAreaJPanel!!.getName() +this.SAVEEXTENSION), workAreaJPanel!!.toDocument())
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    this.guiLog!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e)

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

    
                        if(this.numberOfWorkAreas == MyFrame.MAXWORKAREAS)
                        
                                    {
                                    


                            throw Exception()

                                    }
                                
this.jTabbedPane!!.addTab(newCanvasInterface!!.getName(), newCanvasInterface as JPanel)
this.jTabbedPane!!.setSelectedComponent(newCanvasInterface as JPanel)

    var animationThread: Thread = Thread(newCanvasInterface as Runnable)

animationThread!!.start()
this.updateSelectedWorkArea()
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.GRAPHICSCREATION))
                        
                                    {
                                    this.guiLog!!.put(this.commonStrings!!.EXCEPTION, this, "addNewCanvas", e)

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
                
            

