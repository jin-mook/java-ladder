package nextstep.ladder.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class LineTest {

    @DisplayName("하나의 라인에 존재하는 폭이 동시에 겹치는 경우는 없습니다.")
    @Test
    void notSameConnect() {
        // given
        // when
        Line line = Line.makeLine(5, () -> true);
        // then
        Assertions.assertThat(line.getLine())
                .containsExactly(WidthStatus.connected, WidthStatus.notConnected, WidthStatus.connected, WidthStatus.notConnected);
    }

    @DisplayName("하나의 라인에 존재하는 폭은 전달받은 사람 수보다 1 작습니다.")
    @Test
    void checkLineWidth() {
        // given
        int participatorCount = 5;
        // when
        Line line = Line.makeLine(participatorCount, () -> true);
        // then
        Assertions.assertThat(line.getLine()).hasSize(4);
    }

    @DisplayName("특정 위치가 연결되었는지 확인합니다.")
    @Test
    void isConnected() {
        // given
        Line line = new Line(List.of(WidthStatus.connected, WidthStatus.notConnected));
        // when
        boolean connectResult = line.isConnected(0);
        boolean notConnectResult = line.isConnected(1);
        // then
        Assertions.assertThat(connectResult).isTrue();
        Assertions.assertThat(notConnectResult).isFalse();
    }
}