package ladder.domain.reward;

import java.util.List;

public class Rewards {
    private final List<Reward> rewards;

    public Rewards(List<Reward> rewards) {
        validate(rewards);
        this.rewards = rewards;
    }

    private void validate(List<Reward> rewards) {
        if (rewards == null || rewards.isEmpty()) {
            throw new IllegalArgumentException("rewards는 빈 값 일 수 없습니다.");
        }
    }
}
