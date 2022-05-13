package ladder.domain.reward;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RewardTest {
    @Test
    void Reward는_name_없이_생성_할_경우_예외를_발생_시킨다() {
        assertThatThrownBy(
                () -> new Reward(null)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
