package com.allmycoins.balance.bitcoin;

import com.allmycoins.json.BalanceJson;
import com.allmycoins.utils.BigDecimalUtils;

public final class BuildBitcoinBalance {

	public static BalanceJson build(BitcoinBalanceJson btcBalanceJson) {
		float qty = BigDecimalUtils.decimal(btcBalanceJson.getData().getBalance(), 8);
		return new BalanceJson("BTC", qty, "BTC wallet");
	}

}
