package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift) {
        if (message == null) return "invalid";

        StringBuilder sb = new StringBuilder();
        shift = shift % 26;

        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(' ');
                continue;
            }

            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }

            char shiftedChar = (char) (currentChar + shift);
            if (shiftedChar > 'z') {
                shiftedChar -= 26;
            } else if (shiftedChar < 'a') {
                shiftedChar += 26;
            }
            sb.append(shiftedChar);
        }
        return sb.toString();
    }
}
