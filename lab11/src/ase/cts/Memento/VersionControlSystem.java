package ase.cts.Memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//-Manager de memento
public class VersionControlSystem {

    private static int idSnapshot=100;

    //contine o lista de memento-istoric
    //private List<FileSnapshot> versionHistoryList=new ArrayList<>();
    //FileSnapshot fSnapMem= new FileSnapshot();

    HashMap<Integer,FileSnapshot> versionHistoryList=new HashMap<>();

    //asociez fiecare vector cu un id unic
    //->imbunatatire= HashMap(id,FileSNapshot f)

 //2. Metoda de adaugare in istoric a starii ob Originator
    public void addSnapshot(FileSnapshot fSnapMem){
//            versionHistoryList.add(fSnapMem);
        }


    //3. Metoda de accesare a starilor anterioare
//    public FileSnapshot getSnapshotByID--pt MAP
        public FileSnapshot getSnapshot() {

            FileSnapshot fSnapMem = versionHistoryList.get(versionHistoryList.size() - 1);
            versionHistoryList.remove(fSnapMem);

            return fSnapMem;
        }

    }



