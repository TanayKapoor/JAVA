package HackerEarth;

import java.util.*;
import java.io.*;
class KilljeeAndEasyProblem {
    static class FileReaderI {

        BufferedReader in;

        FileReaderI() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        public int iread() throws Exception {
            return Integer.parseInt(readWord());
        }

        public String readWord() throws IOException {
            StringBuilder b = new StringBuilder();
            int c;
            c = in.read();
            while (c >= 0 && c <= ' ')
                c = in.read();
            if (c < 0)
                return "";
            while (c > ' ') {
                b.append((char) c);
                c = in.read();
            }
            return b.toString();
        }

        public void close() {
            try {
                in.close();
            }
            catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }

        }
    }

    private static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited,
                            List<Integer> res, int start) {

        if(visited[start]) {
            return;
        }

        res.add(start);
        visited[start] = true;

        if(!graph.containsKey(start)) {
            return;
        }

        for(Integer nei : graph.get(start)) {
            if(!visited[nei]) {
                dfs(graph, visited, res, nei);
                res.add(start);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        FileReaderI fr = new FileReaderI();
        int nodes = fr.iread();
        int edges = fr.iread();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        while(edges-- > 0) {
            int from = fr.iread();
            int to = fr.iread();
            List<Integer> adj = graph.computeIfAbsent(from, k -> new ArrayList<>());
            adj.add(to);
            //backward link
            adj = graph.computeIfAbsent(to, k -> new ArrayList<>());
            adj.add(from);
        }

        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[nodes  + 1];
        dfs(graph, visited, res, 1);
        PrintWriter pw = new PrintWriter(System.out);
        StringWriter sw = new StringWriter();
        sw.write(res.size() + "\n");
        for(Integer n : res) {
            sw.write(n + " ");
        }
        pw.println(sw.toString());
        pw.flush();
        pw.close();

        fr.close();
    }
}