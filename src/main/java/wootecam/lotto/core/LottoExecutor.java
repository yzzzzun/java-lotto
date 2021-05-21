package wootecam.lotto.core;

import wootecam.lotto.model.LottoCount;
import wootecam.lotto.ui.InputView;
import wootecam.lotto.ui.OutputView;

public class LottoExecutor {

	private final InputView inputView;
	private final OutputView outputView;

	public LottoExecutor() {
		this.inputView = new InputView();
		this.outputView = new OutputView();
	}

	public void start() {
		String purchaseMoneyInput = this.inputView.makeLottoPurchaseMoneyInput();
		LottoCount lottoCount = new LottoCount(purchaseMoneyInput);

		this.outputView.printLottoCount(lottoCount);
	}
}
