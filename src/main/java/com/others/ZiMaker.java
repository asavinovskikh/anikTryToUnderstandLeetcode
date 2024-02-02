package com.others;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ZiMaker {
    Set <String> setOfStringZi;
    Set <Character> setOfZi;

    public ZiMaker () {
        this.setOfStringZi = new HashSet <>();
        this.setOfZi = new HashSet <>();
    }


    public static void main (String[] args) {
        ZiMaker zi = new ZiMaker();
        InputStream inputStream = null;
        try(FileReader reader = new FileReader("D:\\Work\\anikTryToUnderstandLeetcode\\src\\main\\resources\\HSK\\set.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                zi.add((char)c);
                //System.out.print((char)c);
            }
        }
            catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(zi.getLength());
        System.out.println(zi.getAll());
    }

    public int getLength(){
        return setOfZi.size();
    }

    public String getAll() {
        return String.join(" ", setOfZi.toString());
    }
//
//    public int addAll(List <String> news) {
//        int l = getLength();
//        setOfStringZi.addAll(news);
//        return getLength()-l;
//    }

    public int addAll(List <Character> news) {
        int l = getLength();
        setOfZi.addAll(news);
        return getLength()-l;
    }

    public void add(Character one) {
        if (one != '\n' && one != '\r') {
            setOfZi.add(one);
        }
    }

//    public int addAll(String meow) {
//        return addAll(Arrays.stream(meow.split(" ")).collect(Collectors.toList()));
//    }

    //////////////
    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }


    //try {
    //    // File file = new File();
    //    File dir = new File("HSK");
    //    inputStream = new FileInputStream(dir);

//  обход папок как раз
//            if(dir.isDirectory())
//            {
//                // получаем все вложенные объекты в каталоге
//                for(File item : dir.listFiles()){
//
//                    if(item.isDirectory()){
//
//                        System.out.println(item.getName() + "  \t folder");
//                    }
//                    else{
//
//                        System.out.println(item.getName() + "\t file");
//                    }
//                }
//            }



}
