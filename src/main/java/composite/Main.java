package composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //root, home, garam, music, picture, doc, usr
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder garam = new Folder("garam");
        Folder music = new Folder("music");
        Folder picture = new Folder("picture");
        Folder doc = new Folder("doc");
        Folder usr = new Folder("usr");

        // , track1, track2, pic1, pic2, doc1, java
        File track1 = new File("track1");
        File track2 = new File("track2");
        File pic1 = new File("pic1");
        File pic2 = new File("pic2");
        File doc1 = new File("doc1");
        File java1 = new File("java1");

        root.addComponent(home);
        home.addComponent(garam);
        garam.addComponent(music);
        music.addComponent(track1);
        music.addComponent(track2);
        garam.addComponent(picture);
        picture.addComponent(pic1);
        garam.addComponent(doc);
        doc.addComponent(doc1);

        root.addComponent(usr);
        usr.addComponent(java1);

        show(root);
    }

    private static void show(Component component) {
        log.info(component.getName());
        if(component instanceof Folder) {
            for (Component c: ((Folder) component).getChildren()) {
                show(c);
            }
        }
    }

}
