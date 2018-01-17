package homework08;

public class Main {

    public static void main(String[] args) {
	FileOperation fileOperation=new FileOperation();
	fileOperation.FileMaker("/home/pistuc/Desktop","hetfo.txt");
	fileOperation.FileMaker("/home/pistuc/Desktop",3,"kari","txt");
	fileOperation.fileMakerWithcontent1("/home/pistuc/Desktop","iroget","txt","tartalom",3 );
    fileOperation.printMatrxIntoFile();
    }

}
