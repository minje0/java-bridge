package bridge.view;

import camp.nextstep.edu.missionutils.Console;

import static bridge.view.IOMessage.INPUT_SIZE_MESSAGE;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(INPUT_SIZE_MESSAGE.getMessage());
        String input = inputData();
        return Integer.parseInt(input);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String inputData() {
        String input = Console.readLine();
        nullValidate(input);
        return input;
    }

    private void nullValidate(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
    }
}
