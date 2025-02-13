/*
package text.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_16934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String insert_node = insert(s);
        }
    }

    class Node{
        //각 노드의 자식노드 저장
        HashMap<Character, Node> child;
        //이 노드가 단어의 끝인지 저장
        boolean endOfWord;

        public Node() {
            this.child = new HashMap<>();
            this.endOfWord = false;
        }
    }

    public class Trie {
        Node root;

        public Trie() {
            this.root = new Node();
        }

        public void insert(String str); //삽입
    }

    public void insert(String str){
        //시작 노드를 루트노드로 설정 (루트노드에는 값이 없음)
        Node node = this.root;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            //문자열의 각 단어를 가져와서 자식노드 중에 있는지 체크
            node.child.putIfAbsent(c,new Node());
            //있을때 : node = node.child.get(str.charAt(i)); (putIfAbsent는 값 존재시에 value를 반환
            //없을 때 : 새로운 노드를 생성해서 넣음
            node = node.child.get(c); //자식노드로 이동
        }
        //for문이 끝나면 현재 노드는 마지막 글자이기 때문에 단어의 끝임을 명시
        node.endOfWord = true;
    }
}
*/
