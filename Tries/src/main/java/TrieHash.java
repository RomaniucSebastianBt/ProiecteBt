import java.util.HashMap;

class TrieHash {

    // implementing a HashMap
    private HashMap<Character, HashMap> origin;

    // implementing a zero-argument constructor
    public TrieHash() {

        // creating a new HashMap
        origin = new HashMap<Character, HashMap>();
    }

    // implementing another constructor with an array as a parameter
    public TrieHash(String[] array)
    {
        origin = new HashMap<Character, HashMap>();
        // attaching that array string in the trie
        for (String c : array)
            attach(c);
    }

    // attach function to add character to the trie
    public void attach(String str)
    {
        HashMap<Character, HashMap> node = origin;
        int i = 0;
        while (i < str.length()) {
            // if node already contains thatkey point that node
            if (node.containsKey(str.charAt(i))) {
                node = node.get(str.charAt(i));
            }
            else {
                // else we will make a new hashmap with that character and then point it.
                node.put(str.charAt(i), new HashMap<Character, HashMap>());
                node = node.get(str.charAt(i));
            }
            i++;
        }
        node.put('\0', new HashMap<Character, HashMap>(0));
    }

    // function to search for the specific string in the hash trie
    public boolean search(String str)
    {
        HashMap<Character, HashMap> presentNode = origin;
        int i = 0;
        while (i < str.length()) {
            //  search for that character if it exists
            if (presentNode.containsKey(str.charAt(i))) {
                presentNode = presentNode.get(str.charAt(i));
            }
            else {
                //  character does not exist => string not exist
                return false;
            }
            i++;
        }
        //  check for the end string,
        // whole string is found -> true
        //  else -> false
        if (presentNode.containsKey('\0')) {
            return true;
        }
        else {
            return false;
        }
    }
}

