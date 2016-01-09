import java.io.File;

/**
 * Created by iwan on 16/1/10.
 */
public class Folder {

    public static void main(String[] args) {


        /**
         * 创建单级文件目录 mkdir()
         */

        //定义单级文件夹对象,无后缀名
        File folder = new File("my folder");

        //创建文件夹
        if (folder.mkdir()) {
            System.out.println("文件夹创建完成");
        } else {
            if (folder.exists()) {
                System.out.println("文件夹已经存在不用创建");
            } else {
                System.out.println("文件夹创建失败");
            }
        }

        /**
         * 创建多级文件目录 mkdirs()
         */

        //定义多级文件夹对象,无后缀名
        File folder2 = new File("new folder/item1/item2/item3");

        //创建文件夹
        if (folder2.mkdirs()) {
            System.out.println("多级目录创建完成");
        } else {
            if (folder.exists()) {
                System.out.println("目录已经存在不用创建");
            } else {
                System.out.println("目录创建失败");
            }
        }


        /**
         * 文件夹重命名 renameto()
         */
        //原来目录文件名
        File folder3 = new File("new folder/item1");
        //新目录文件名
        File newfolder3 = new File("new folder/itemX");
        if (folder3.renameTo(newfolder3)) {
            System.out.println("重命名完成");
        } else {
            System.out.println("reanme fail");
        }


        /**new folder/item1
         * 文件夹删除 delete() ,只允许删除空文件夹
         */
        File folder4 = new File("new folder/itemx/item2/item3");
        if (folder4.delete()) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

    }
}