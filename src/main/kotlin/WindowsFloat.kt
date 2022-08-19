import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import javafx.stage.StageStyle


class WindowsFloat : Application() {

    companion object{
        lateinit var pStage: Stage

        fun getPrimaryStage(): Stage {
            return pStage
        }

        @JvmStatic
        fun main(args: Array<String>){
            launch(WindowsFloat::class.java)
        }
    }

    override fun start(primaryStage: Stage) {
        val fxmlLoader = FXMLLoader(javaClass.getResource("MainFrame.fxml"))
        val root = fxmlLoader.load<Any>() as AnchorPane
        val scene = Scene(root, 400.0, 250.0)

        fxmlLoader.getController<MainFrameController>().initialize()

        primaryStage.initStyle(StageStyle.UNDECORATED)

        root.style = "-fx-background-color: transparent;"

        primaryStage.icons.add(Image(javaClass.getResource("/icon.png")!!.toString()))

        primaryStage.isAlwaysOnTop = true
        primaryStage.scene = scene
        primaryStage.show()

        pStage = primaryStage
    }

}
