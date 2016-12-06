package br.cc.vedesolutions.titanbank.model;

import br.cc.vedesolutions.titanbank.screenframework.IControlledScreen;
import br.cc.vedesolutions.titanbank.screenframework.ScreensController;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

//metodo que carrega o painel de Login do Adm

public class LoginPanelAdm implements IControlledScreen {

	private ScreensController myController;

	public void showPanel(ActionEvent evt) {
		Stage stage = new Stage();
		Node n = this.myController.getScreen("adm_popup_panel");
		Group root = new Group();
		root.getChildren().addAll(n);
		Scene scene = new Scene(root, 208, 305);
		stage.setScene(scene);
		stage.setTitle("Senha");
		//stage.initStyle(StageStyle.UTILITY);
		stage.setResizable(false);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(((Node)evt.getSource()).getScene().getWindow());
		stage.showAndWait();
	}


	@Override
	public void setScreenParent(ScreensController screenPage) {
		this.myController = screenPage;
	}
}

