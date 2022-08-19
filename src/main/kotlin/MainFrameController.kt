import javafx.application.Platform
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.layout.AnchorPane
import javafx.scene.text.Text
import javafx.scene.web.WebView


class MainFrameController {
    @FXML lateinit var brownser: WebView
    @FXML lateinit var btnRed: Button
    @FXML lateinit var btnOrange: Button
    @FXML lateinit var btnGreen: Button
    @FXML lateinit var UpBarre: AnchorPane
    @FXML lateinit var Label: Text

    fun initialize() {
       brownser.engine.load(
           "http://www.youtube.com/embed/0zBLEwu0aJM?autoplay=1"
//           "https://www.chess.com/home"
            //"http://192.168.1.13/"
       )

        btnRed.onAction = EventHandler { Platform.exit() }
        btnRed.onMouseEntered = EventHandler { btnRed.style  = "-fx-background-color: RED; -fx-border-color: Red; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }
        btnRed.onMouseExited = EventHandler { btnRed.style  = "-fx-background-color: TRANSPARENT; -fx-border-color: Red; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }

        btnOrange.onAction = EventHandler { WindowsFloat.pStage.isAlwaysOnTop = !WindowsFloat.pStage.isAlwaysOnTop }
        btnOrange.onMouseEntered = EventHandler { btnOrange.style  = "-fx-background-color: ORANGE; -fx-border-color: ORANGE; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }
        btnOrange.onMouseExited = EventHandler { btnOrange.style  = "-fx-background-color: TRANSPARENT; -fx-border-color: ORANGE; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }

        btnGreen.onAction = EventHandler { WindowsFloat.pStage.isIconified = true }
        btnGreen.onMouseEntered = EventHandler { btnGreen.style  = "-fx-background-color: GREEN; -fx-border-color: GREEN; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }
        btnGreen.onMouseExited = EventHandler { btnGreen.style  = "-fx-background-color: TRANSPARENT; -fx-border-color: GREEN; -fx-border-radius: 100; -fx-border-width: 2; -fx-background-radius: 100;" }

        var xOffset:Double = 0.0
        var yOffset:Double = 0.0

        UpBarre.onMousePressed = EventHandler { event ->
            xOffset = WindowsFloat.pStage.x - event.screenX;
            yOffset = WindowsFloat.pStage.y - event.screenY;
        }

        UpBarre.onMouseDragged = EventHandler { event ->
            WindowsFloat.pStage.x = event.screenX + xOffset;
            WindowsFloat.pStage.y = event.screenY + yOffset;
        }

    }
}
