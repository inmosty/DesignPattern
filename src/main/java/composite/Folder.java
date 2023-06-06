package composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Folder extends Component {
    List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component component) {
        return children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public Component[] getChildren() {
        return children.toArray(new Component[children.size()]);
    }
}
