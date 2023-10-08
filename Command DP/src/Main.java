import java.util.ArrayList;
import java.util.List;

interface ActionListenerCommand{
    public void execute();
}

class ActionSaveCommand implements ActionListenerCommand{
    private Document doc;

    public ActionSaveCommand(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }
}

class ActionOpenCommand implements ActionListenerCommand{
    private Document doc;

    public  ActionOpenCommand(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }
}

// Receiver
class Document{
    public void open(){
        System.out.println("Opening the doc");
    }

    public void save(){
        System.out.println("Saving the doc");
    }
}

// Invoker
class MenuOptions{
    List<ActionListenerCommand> commands = new ArrayList<>();

    public void addCommand(ActionListenerCommand command){
        commands.add(command);
    }

    public void executeCommands(){
        for(ActionListenerCommand command : commands){
            command.execute();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        ActionListenerCommand saveCommand = new ActionSaveCommand(doc);
        ActionListenerCommand openCommand = new ActionOpenCommand(doc);
        MenuOptions menu = new MenuOptions();
        menu.addCommand(saveCommand);
        menu.addCommand(openCommand);

        menu.executeCommands();
    }
}