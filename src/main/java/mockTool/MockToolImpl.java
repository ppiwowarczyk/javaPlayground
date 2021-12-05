package mockTool;

import java.util.function.Function;

public class MockToolImpl implements MockTool {

    private Function<RequestId, String> mockProvider;

    public MockToolImpl(Function<RequestId, String> mockProvider) {
        this.mockProvider = mockProvider;
    }

    @Override
    public String mock(RequestId requestId) {
        return mockProvider.apply(requestId);
    }
}
