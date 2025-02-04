package dailyProblems;

class ReplaceWordFromString {

    public static void main(String[] args) {
        String str = "Write short paragraphs and cover one topic per and paragraph. Long paragraphs discourage users from even trying to and understand and your material. Short and paragraphs are easier to and read and understand.";
        String[] strArr = str.split(" ");
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("and"))strArr[i] = "&&";
        }
        StringBuilder sb = new StringBuilder();
        for(String s:strArr){
            sb.append(s + " ");
        }
        System.out.println(sb.toString().trim());
    }
}