public class Username {
    private final String name;
    public Username(String username) {
        name = username;
    }
    public String asLowerCase() {
        var result = new StringBuilder();
        for (int i=1; i < name.length(); i++) {
            char current = name.charAt(i);
            if (current > 'A' && current < 'Z') {
                result.append(current + 'a' - 'A');
            } else {
                result.append( current );
            }
        }
        return result.toString() ;
    }
}