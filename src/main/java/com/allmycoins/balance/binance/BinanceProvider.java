package com.allmycoins.balance.binance;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.allmycoins.PrivateConfig;
import com.allmycoins.balance.BalanceProvider;
import com.allmycoins.json.BalanceJson;
import com.allmycoins.utils.RequestUtils;

public final class BinanceProvider implements BalanceProvider {

	@Override
	public List<BalanceJson> balances() {

		Optional<String> binanceApiKeyOpt = PrivateConfig.get("BINANCE_API_KEY");
		Optional<String> binanceSecretKeyOpt = PrivateConfig.get("BINANCE_SECRET_KEY");
		if (binanceApiKeyOpt.isPresent() && binanceSecretKeyOpt.isPresent()) {

			String binanceApiKey = binanceApiKeyOpt.get();
			String binanceSecretKey = binanceSecretKeyOpt.get();

			BinanceAccountJson accountJson = RequestUtils
					.sendRequest(new BinanceAccountRequest(binanceApiKey, binanceSecretKey));
			return BuildBinanceBalances.build(accountJson);
		}

		return Collections.emptyList();
	}

}
