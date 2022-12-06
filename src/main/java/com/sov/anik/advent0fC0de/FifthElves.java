package com.sov.anik.advent0fC0de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FifthElves {

        public static void main(String[] args) {
            FifthElves s = new FifthElves();
            try {
                s.calc();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public int calc() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        List<String> staks = new ArrayList<>();
        int max = 0;

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input5.txt"));

        String currentLine = null;
        int summ = 0;

        boolean firstStep = true;
        while ((currentLine = reader.readLine()) != null) {
            currentLine.trim();
            if (firstStep) {
                if (currentLine.length() < 1) {
                    firstStep = false;
                    continue;
                }
                staks.add(currentLine);
            } else {
                str.add(currentLine);
            }
        }
        reader.close();
        List<Stack<String>> result = addAllStacks(staks);
        calculationStacks(str, result);
        System.out.println(summ);
        return summ;
    }

    private List<Stack<String>> addAllStacks(List<String> stacks) {
        List<Stack<String>> result = new ArrayList<>();
        int n = stacks.size();
        String amountString = stacks.get(n-1);
        String[] nn = amountString.split(" ");
        int amount = Integer.parseInt(nn[nn.length -1].trim());
        stacks.remove(n-1);

        for(int i = 0; i < amount; i++){
            Stack<String> newS = new Stack<>();
            result.add(newS);
        }

        for (String s : stacks) {
            int len = s.length();
            String ccc = s.replace("[", "").replace("]", "").replace("  ", "|").replace(" ", "")
                    .replace("||", "*");
            System.out.println(ccc);

            char[] curr = ccc.toCharArray();
            for (int i = 0; i < amount; i++) {
                if (curr[i] != '*') {
                    result.get(i).push(String.valueOf(curr[i]));
                }
            }
        }
        return result;
    }

    private Stack<String> revert(Stack<String> revering) {
            Stack<String> result = new Stack<>();
            while(!revering.empty()) {
                result.push(revering.pop());
            }
            return result;
    }

    private List<String> calculationStacks(List<String> str, List<Stack<String>> revertedStacks) {
            // 1 стадия - повторяем все шаги

        List<Stack<String>> a = new ArrayList<>();
        for(Stack<String> c : revertedStacks){
            a.add(revert(c));
        }

        List<Stack<String>> list = new ArrayList<>();
        for(String stro : str) {
            if (stro.trim().isEmpty()) {
                continue;
            }
            String ququ = stro.replace("move", "").replace("from", "").replace("to", "").trim();
            System.out.println(ququ);
            String[] qu = ququ.split(" ");

            int q = Integer.valueOf(qu[0]);
            int from = Integer.valueOf(qu[2]);
            int to = Integer.valueOf(qu[4]);

            Stack<String> curr = new Stack<>();
            for(int i = 0; i < q; i++) {
                String cr = a.get(from-1).pop();
                curr.push(cr);
            }

            for(int i = 0; i < q; i++) {
                String cr = curr.pop();
                a.get(to-1).push(cr);
            }
        }


            // 2 стадия - собираем лавры и получаем результат
        List<String> ress = new ArrayList<>();
        for(int i = 0; i < a.size(); i++) {
            ress.add(a.get(i).pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ress.size(); i++) {
            sb.append(ress.get(i));
        }
        System.out.println(sb.toString());

        return ress;


    }
}
