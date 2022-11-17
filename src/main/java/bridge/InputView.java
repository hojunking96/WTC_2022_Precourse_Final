package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {


    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        /*
        "다리의 길이를 입력해주세요."
         */
        String bridgeSizeInput = Console.readLine();
        /*
         * 입력이 유효한지 확인
         */
        int bridgeSize = Integer.parseInt(bridgeSizeInput);
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        /*
        "이동할 칸을 선택해주세요. (위: U, 아래: D)"
         */
        String movingInput = Console.readLine();
        /*
        입력이 유효한지 확인
         */
        return movingInput;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        /*
        "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"
         */
        String gameCommandInput = Console.readLine();
        /*
        입력이 유효한지 확인
         */
        return gameCommandInput;
    }
}
