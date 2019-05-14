package labels;

import framework.element.TextField;

import java.util.List;

public class TextBox {
    private List<String> textBox;

    public void addTextField(TextField field) {
        textBox.add(field.getText());
    }

    public List<String> getTextFields() {
        return textBox;
    }
}
